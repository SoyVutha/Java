package School;
import java.text.SimpleDateFormat;
import java.util.*;
public class Helpper {
    public static Scanner scan=new Scanner(System.in);
    public static ArrayList<String> usernames=new ArrayList<>();
    public static ArrayList<Integer> ids=new ArrayList<>();
    public static Random rand=new Random();
    public static SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy MM dd");


    public static boolean isDuplicate(String name){
        boolean isDuplicated=false;
        if(usernames.contains(name)){return true;}
        else{usernames.add(name);return false;}
    }

    public static int isAgevalid(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                int age = Integer.parseInt(scan.nextLine().trim());
                if (age < 0) {
                    throw new IllegalArgumentException("Age cannot be negative.");
                }
                return age; 
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int generateID(){
        int id=0;
        do{
            id=rand.nextInt(Integer.MAX_VALUE-1)+1;
            System.out.println("Student ID : "+ id);
        }
        while(isIdduplicate(id));
        return id;
    }

    public static boolean isIdduplicate(int id){
        boolean isDuplicate=false;
        if(ids.contains(id)){return true;}
        else{ids.add(id); return false;}
    }

    public static String isDateValid(String prompt) {
        while (true) {
            System.out.printf(prompt);
            String date = scan.nextLine();
            try {
                if (date.isEmpty()) {
                    throw new Exception("Date cannot be empty");
                }
                dateFormat.parse(date);
                return date; 
            } catch (Exception e) {
                System.out.println("Date is not valid: " + e.getMessage());
            }
        }
    }

}
