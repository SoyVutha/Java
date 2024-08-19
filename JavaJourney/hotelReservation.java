

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class hotelReservation {

    static int choice;
    static int isReserveRoomFound = 0;
    static int isCancelRoomFound = 0;

    static final int TOTAL_AVERAGE = 10;
    static final int TOTAL_BELOW_AVERAGE = 5;
    static final int TOTAL_UPPER_AVERAGE = 5;

    static String isAvailableString = "";

    static int averageRoom = 0;
    static int belowAverageRoom = 0;
    static int upperAverageRoom = 0;

    static int addRoomIndex = 0;
    static int reservationIndex = 0;

    static Room[] rooms = new Room[20];
    static Random rand = new Random();
    static Scanner scan = new Scanner(System.in);
    static Set<Integer> usedRoomNumbers = new HashSet<>();
    static List<String> roomTypes = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.printf("\nMENU:\n1. Add Room\n2. Make Reservation\n3. Cancel Reservation\n4. View Rooms\n5. Exit\n");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine(); // Consume the newline character
            switch (choice) {
                case 1:
                    addRoom();
                    break;
                case 2:
                    makeReservation();
                    break;
                case 3:
                    cancelReservation();
                    break;
                case 4:
                    viewRooms();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    public static void addRoom() {
        if (addRoomIndex >= rooms.length) {
            System.out.println("No more rooms available");
            return;
        }

        Room room;
        do {
            int roomNumber;
            do {
                roomNumber = rand.nextInt(21) + 110;
            } while (usedRoomNumbers.contains(roomNumber));

            usedRoomNumbers.add(roomNumber);
            room = new Room();
            room.setRoomNumber(roomNumber);
            room.setAvailable(true);

            roomTypes.clear();
            for (int i = 0; i < TOTAL_AVERAGE; i++) {
                roomTypes.add("Average");
            }
            for (int i = 0; i < TOTAL_BELOW_AVERAGE; i++) {
                roomTypes.add("Below Average");
            }
            for (int i = 0; i < TOTAL_UPPER_AVERAGE; i++) {
                roomTypes.add("Upper Average");
            }

            Collections.shuffle(roomTypes);
        } while (addRoomIndex >= roomTypes.size());

        String roomType = roomTypes.get(addRoomIndex);
        room.setRoomType(roomType);

        switch (roomType) {
            case "Average":
                room.setRoomPrice(29.99);
                break;
            case "Upper Average":
                room.setRoomPrice(49.99);
                break;
            case "Below Average":
                room.setRoomPrice(19.99);
                break;
        }

        rooms[addRoomIndex++] = room;
        System.out.printf("Room:%d\tAvailability:%s\tRoom Type:%s\tPrice:%.2f/night\n",
                room.getRoomNumber(), room.isAvailable() ? "Available" : "Not Available", room.getRoomType(), room.getRoomPrice());
    }

    public static void makeReservation() {
        while (true) {
            int roomNumber = -1;
            System.out.print("Please enter the room number you would like to reserve (0 to stop): ");
            try {
                roomNumber = Integer.parseInt(scan.nextLine());
                if (roomNumber == 0) {
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter an integer.");
                continue;
            }

            isReserveRoomFound = 0;

            for (int i = 0; i < addRoomIndex; i++) {
                Room room = rooms[i];
                if (room.getRoomNumber() == roomNumber) {
                    isReserveRoomFound = 1;
                    if (room.isAvailable()) {
                        room.setAvailable(false);
                        System.out.printf("Room:%d Reserved Successfully\n", room.getRoomNumber());
                        System.out.printf("Room:%d\tRoom Type:%s\tPrice:%.2f/night\n", room.getRoomNumber(), room.getRoomType(), room.getRoomPrice());
                        if (reservationIndex < rooms.length) {
                            rooms[reservationIndex++] = room;
                        } else {
                            System.out.println("Sorry, we are full");
                        }
                    } else {
                        System.out.println("Room is not available");
                    }
                    break;
                }
            }

            if (isReserveRoomFound == 0) {
                System.out.println("Room not found");
            }
        }
    }

    public static void cancelReservation() {
        while (true) {
            System.out.print("Please enter the room number you would like to cancel (0 to stop): ");
            int cancelRoomNumber = -1;

            try {
                cancelRoomNumber = Integer.parseInt(scan.nextLine());
                if (cancelRoomNumber == 0) {
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter an integer.");
                continue;
            }

            isCancelRoomFound = 0;

            for (int i = 0; i < reservationIndex; i++) {
                Room room = rooms[i];
                if (room.getRoomNumber() == cancelRoomNumber) {
                    room.setAvailable(true);
                    System.out.printf("Room:%d Cancelled Successfully\n", room.getRoomNumber());
                    isCancelRoomFound = 1;
                    break;
                }
            }

            if (isCancelRoomFound == 0) {
                System.out.println("Room not found");
            }
        }
    }

    public static void viewRooms() {
        System.out.printf("\n%-15s%-15s%-15s%-15s\n", "Room ID", "Room Type", "Room Price", "Availability");

        for (int i = 0; i < addRoomIndex; i++) {
            Room room = rooms[i];
            System.out.printf("%-15d%-15s%-15.2f%-15s\n", room.getRoomNumber(), room.getRoomType(), room.getRoomPrice(), room.isAvailable() ? "Available" : "Not Available");
        }
    }

    public static class Room {
        private int roomNumber;
        private String roomType;
        private double roomPrice;
        private boolean isAvailable;

        public int getRoomNumber() {
            return roomNumber;
        }

        public void setRoomNumber(int roomNumber) {
            this.roomNumber = roomNumber;
        }

        public String getRoomType() {
            return roomType;
        }

        public void setRoomType(String roomType) {
            this.roomType = roomType;
        }

        public double getRoomPrice() {
            return roomPrice;
        }

        public void setRoomPrice(double roomPrice) {
            this.roomPrice = roomPrice;
        }

        public boolean isAvailable() {
            return isAvailable;
        }

        public void setAvailable(boolean isAvailable) {
            this.isAvailable = isAvailable;
        }
    }
}
