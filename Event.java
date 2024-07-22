import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;

public class Event {
    //GLOBAL VARIABLE
    static int choice;
    static int Event_Index=0;
    static int volunteer_Index=0;
    static Random rand=new Random();
    static SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
    static int isSearchNameFound=0;
    static int isDeleteNameFound=0;
    static int isAddVolunteerFound=0;
    

    static event_information[] events=new event_information[100];
    static Volunteer_attendence[] volunteers=new Volunteer_attendence[100];
    static Scanner scan=new Scanner(System.in);


    //CLASS
    public static class event_information
    {
        private String Event_Name;
        private String Event_date;
        private String Event_Location;
        private int Event_ID;
        
        //DEFAULT VALUE
        public event_information()
        {
            this.Event_Name="";
            this.Event_Location="";
            this.Event_date="";
            this.Event_ID=0;
        }

        //GETTER
        public String getEvent_Name() {
            return Event_Name;
        }
        
        public String getEvent_date() {
            return Event_date;
        }
        
        public String getEvent_Location() {
            return Event_Location;
        }
        
        public int getEvent_ID() {
            return Event_ID;
        }
        
        // SETTERS
        public void setEvent_Name(String event_Name) {
            Event_Name = event_Name;
        }
        
        public void setEvent_date(String event_date) {
            Event_date = event_date;
        }
        
        public void setEvent_Location(String event_Location) {
            Event_Location = event_Location;
        }
        
        public void setEvent_ID(int event_ID) {
            Event_ID = event_ID;
        }
    } 

    public static class Volunteer_attendence
    {
        private String Volunteer_Name;
        private String Volunteer_email;
        private int Volunteer_ID;

        private int attendence_volunteer;
        private String Volunteer_Event_NAME;
        private int volunteer_Event_ID;
        //DEFAULT VALUE
        public Volunteer_attendence()
        {
            this.Volunteer_ID=0;
            this.Volunteer_Name="";
            this.Volunteer_email="";
            this.attendence_volunteer=0;
            this.Volunteer_Event_NAME="";
            this.volunteer_Event_ID=0;
        }

        //GETTER
        public int getAttendance_volunteer() {
            return attendence_volunteer;
        }

        public void setAttendance_volunteer(int attendence_volunteer) {
            this.attendence_volunteer = attendence_volunteer;
        }

        public int getvolunteer_Event_ID()
        {
            return volunteer_Event_ID;
        }

        public void setvolunteer_Event_ID(int volunteer_Event_ID)
        {
            this.volunteer_Event_ID=volunteer_Event_ID;
        }

        public String getVolunteer_Name() {
            return Volunteer_Name;
        }
        
        public String getVolunteer_email() {
            return Volunteer_email;
        }
        
        public int getVolunteer_ID() {
            return Volunteer_ID;
        }
        
        // SETTERS
        public void setVolunteer_Name(String volunteer_Name) {
            Volunteer_Name = volunteer_Name;
        }
        
        public void setVolunteer_email(String volunteer_email) {
            Volunteer_email = volunteer_email;
        }
        
        public void setVolunteer_ID(int volunteer_ID) {
            Volunteer_ID = volunteer_ID;
        }

        public String getVolunteer_Event_NAME() {
            return Volunteer_Event_NAME;
        }

        public void setVolunteer_Event_NAME(String Volunteer_Event_NAME) {
            this.Volunteer_Event_NAME = Volunteer_Event_NAME;
        }
    }
    
        
    
    public static void main(String[] args) {
        while(true)
        {
            System.out.printf("\nMENU:\n1.Add Event\n2.View Event\n3.Search and Update Event\n4.Delete Event\n5.View Attendences\n6.Update Attendences\n7.Exit\n");
            System.out.printf("Enter your choice: ");
            choice=scan.nextInt();
            scan.nextLine();
            switch(choice)
            {
                case 1:
                Add_Event_Function();
                break;
                case 2:
                View_Event_Function();
                break;
                case 3:
                Search_Update_Function();
                break;
                case 4:
                Delete_Event_Function();
                break;
                case 5:
                View_Attendence_Function();
                break;
                case 6:
                Update_Attendece_Function();
                break;
                case 7:
                System.exit(0);
                default:
                System.out.printf("Invalid Choice");
            }
            

        }
        
    }

    //FUNCTIONS
    public static void Add_Event_Function()
    {
        while(true)
        {
            event_information Event=new event_information();
            System.out.printf("\n Add Event Name(0 to stop):");
            Event.setEvent_Name(scan.nextLine().trim());

            if(Event.getEvent_Name().equalsIgnoreCase("0"))
            {
                break;
            }

            if(Event.getEvent_Name().isEmpty())
            {
                System.out.printf("Event Name Cannot be empty");
                continue;
            }

            System.out.printf("Event Date(YYYY-MM-DD): ");
            Event.setEvent_date(scan.nextLine());

            if(Event.getEvent_date().isEmpty())
            {
                System.out.printf("Event Date Cannot be empty");
                continue;
            }

            try
            {
                dateFormat.parse(Event.getEvent_date());
                
            }
            catch(ParseException e)
            {
                System.out.printf("Invalid Date Format,please enter the date in YYYY-MM-DD: \n");
                continue;
            }

            System.out.printf("Event Avenue:");
            Event.setEvent_Location(scan.nextLine());

            if(Event.getEvent_Location().isEmpty())
            {
                System.out.printf("Event Location Cannot be empty");
                continue;
            }

            Event.setEvent_ID(rand.nextInt(Integer.MAX_VALUE-1)+1); //generate random number

            System.out.printf("Event:%s ID: %d\n",Event.getEvent_Name(),Event.getEvent_ID());

            events[Event_Index++]=Event;
        }
    
    }
    
    public static void View_Event_Function()
    {
        System.out.printf("\n%-15s%-15s%-15s%-15s\n","Event Name","ID","Date","Avenue");
        for(int i=0;i<Event_Index;i++)
        {
            event_information Event=events[i];
            System.out.printf("%-15s%-15d%-15s%-15s\n",Event.getEvent_Name(),Event.getEvent_ID(),Event.getEvent_date(),Event.getEvent_Location());
        }
    
    }
    
    public static void Search_Update_Function()
    {
        while(true)
        {
            System.out.printf("\nEnter Event Name to search(0 to stop): ");
            String searchName=scan.nextLine().trim();
            if(searchName.equals("0"))
            {
                break;
            }
            isSearchNameFound=0;
                    for(int i=0;i<Event_Index;i++)
                    {
                        event_information Event=events[i];
            
                        if(searchName.equalsIgnoreCase(Event.getEvent_Name()))
                        {
                            isSearchNameFound=1;
                            System.out.printf("Event Found:%s\tID:%d\tDate:%s\tAvenue:%s\n",Event.getEvent_Name(),Event.getEvent_ID(),Event.getEvent_date(),Event.getEvent_Location());
                            
                            System.out.printf("Do you want to update the event?(Y/N): ");
                            String update=scan.nextLine();
                           
                            if(update.equalsIgnoreCase("Y"))
                            {
                                System.out.printf("Update Options(Name/Date/Avenue): ");
                                String updateOption=scan.nextLine().trim();
                                if(updateOption.equalsIgnoreCase("Name"))
                                {
                                    System.out.printf("Enter New Event Name: ");
                                    Event.setEvent_Name(scan.nextLine());
                                }
                                else if(updateOption.equalsIgnoreCase("Date"))
                                {
                                    System.out.printf("Enter New Event Date(YYY--MM--DD): ");
                                    Event.setEvent_date(scan.nextLine().trim());

                                    if(Event.getEvent_date().isEmpty())
                                    {
                                        System.out.printf("Event Date cannot be empty\n");
                                        break;
                                    }
            
                                    try
                                    {
                                        dateFormat.parse(Event.getEvent_date());
                                        break; 
                                    }
                                    catch(ParseException e)
                                    {
                                        System.out.printf("Invalid Date Format,please enter the date in YYYY--MM--DD\n");
                                    }
            
                                }
                                else if(updateOption.equalsIgnoreCase("Avenue"))
                                {
                                    System.out.printf("Enter New Event Avenue: ");
                                    Event.setEvent_Location(scan.nextLine());
                                }
                                else
                                {
                                    System.out.printf("Invalid Option");
                                }
                            }
                            else if(update.equalsIgnoreCase("N"))
                            {
                                break;
                            }
                            else
                            {
                                System.out.printf("Invalid choice\n");
                            }
            
                         }
                    }
                    if(isSearchNameFound==0)
                     {
                            System.out.printf("Event Not Found\n");
                    }
        }
    }
    
    public static void Delete_Event_Function()
    {
        while(true)
        {
            
            System.out.printf("\nEnter Event Name To Delete(0 to stop): ");
            String deleteEventName = scan.nextLine().trim();
            if(deleteEventName.equalsIgnoreCase("0"))
            {
                break;
            }
            isDeleteNameFound=0;
            for(int i=0;i<Event_Index;i++)
            {
                event_information Event=events[i];
                if(Event.getEvent_Name().equalsIgnoreCase(deleteEventName))
                {
                    isDeleteNameFound=1;
                    System.out.printf("Event Found\n");
                    for(int j=i;j<Event_Index-1;j++)
                    {
                        events[j]=events[j+1];
                    }

                    events[Event_Index-1]=null;
                    Event_Index--;

                    System.out.printf("Event %s delete sucessfully\n",deleteEventName);
                    break;
                }
            }
            if(isDeleteNameFound==0)
            {
                System.out.printf("Event Not Found\n");
            }

        } 
    }
    
    
    public static void View_Attendence_Function()
    {
      System.out.printf("\n%-15s%-15s%-15s%-15s%-15s\n","Event Name","ID","Avenue","Date","Participant");
      for(int i=0;i<Event_Index;i++)
      {
        event_information Event=events[i];
        Volunteer_attendence attendence=new Volunteer_attendence();
        System.out.printf("%-15s%-15d%-15s%-15s%-15d\n",Event.getEvent_Name(),Event.getEvent_ID(),Event.getEvent_Location(),Event.getEvent_date(),attendence.getAttendance_volunteer());
      }
    
    }
    
   public static void Update_Attendece_Function()
   {
    while(true)
    {
        System.out.printf("\n(1).Add volunteer\n(2).Display volunteer for event\n(3).Exit\n");
        System.out.printf("What's your intention: ");
        int Add_View_Exit=scan.nextInt();
        scan.nextLine();
        switch(Add_View_Exit)
        {
            case 1:
            Add_Volunteer_Function();
            break;
            case 2:
            View_Volunteer_Function();
            break;
            case 3:
            return;
            default:
            System.out.printf("Invalid Input\n");
            break;
        }
    }
   }

   public static void Add_Volunteer_Function()
   {
    while(true)
    {
        System.out.printf("\nEnter Event ID To Add Volunteer(0 to stop):");
        int Event_ID=scan.nextInt();
        scan.nextLine();

        if(Event_ID==0)
        {
            break;
        }

        for(int i=0;i<Event_Index;i++)
        {
            event_information Event=events[i];
            Volunteer_attendence volunteer=new Volunteer_attendence();
            isAddVolunteerFound=0;
            if(Event_ID==Event.getEvent_ID())
            {
                isAddVolunteerFound=1;
                System.out.printf("Enter Volunteer Name(0 to stop):");
                volunteer.setVolunteer_Name(scan.nextLine().trim());

                

                if(volunteer.getVolunteer_Name().equalsIgnoreCase("0"))
                {
                    break;
                }

                if (volunteer.getVolunteer_Name().isEmpty()) 
                {
                    System.out.printf("Volunteer Name cannot be empty\n");
                }

                volunteer.setVolunteer_Event_NAME(Event.getEvent_Name());// how to asign 
                volunteer.setVolunteer_ID(Event.getEvent_ID());


                System.out.printf("Enter %s email: ",volunteer.getVolunteer_Name());
                volunteer.setVolunteer_email(scan.nextLine());

                volunteer.setVolunteer_ID(rand.nextInt(Integer.MAX_VALUE-1)+1);

                System.out.printf("%s ID:%d\n",volunteer.getVolunteer_Name(),volunteer.getVolunteer_ID());

                volunteers[volunteer_Index++]=volunteer;
                break;
            }
        }
        if(isAddVolunteerFound==0)
        {
            System.out.printf("Event ID not found\n");
        }
    }
   }

   public static void View_Volunteer_Function()
   {
    System.out.printf("\n%-15s%-15s%-15s\n","Event Name","Event ID","Volunteers");
    for(int i=0;i<volunteer_Index;i++)
    {
        Volunteer_attendence volunteer=volunteers[i];
        System.out.printf("%-15s%-15d%-15s\n",volunteer.getVolunteer_Event_NAME(),volunteer.getvolunteer_Event_ID(),volunteer.getVolunteer_Name());
    }

   }
}