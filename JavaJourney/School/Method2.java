package School;
import java.util.*;
public  class Method2 {
    public static Scanner scan=new Scanner(System.in);
     
    public static List<MainClass.Student> students=new ArrayList<>();
    public static List<MainClass.Teacher> teachers = new ArrayList<>();


    public static void Addstudent(){
        while(true){
            MainClass.Student student = new MainClass.Student();
            System.out.printf("\n\nEnter student name (0 to stop)");
            String name=scan.nextLine();
            if(name.equals("0")){break;}
            if(Helpper.isDuplicate(name)){
                System.out.println("Student already exists");
            }
            student.setName(name);

            int age = Helpper.isAgevalid("Enter student's age : ");student.setAge(age);

            int id=Helpper.generateID();student.setId(id);
            students.add(student);

        }
    }

    public static void Deletestudent(){
        boolean isStudentIdFonund = false;
        while(true){
            System.out.printf("\n\nEnter student id to delete (0 to stop)");
            int id=scan.nextInt();
            scan.nextLine();
            if(id==0){break;}
           
            for(int i=0;i<students.size();i++){
                if(students.get(i).getId()==id){students.remove(i);System.out.println("Student successfully removed");isStudentIdFonund=true;break;}
            }
            if(!isStudentIdFonund){System.out.println("Student id not found");            
        }
    }
    }

    public static void studentattandance(){
        
        boolean isStudentfound=false;
      while(true){
        System.out.printf("\n\nEnter student id to mark attendance (0 to stop)");
        int id=scan.nextInt();
        scan.nextLine();
        if(id==0){break;}
        for(int i=0;i<students.size();i++){
            
            if(students.get(i).getId()==id){
                isStudentfound=true;
                String date = Helpper.isDateValid("Enter the date (YYYY MM DD) :");
                boolean isPresent=false;
                System.out.printf("Is the student present (y/n)");
                char choice = scan.next().toLowerCase().charAt(0);
                if(choice=='y'){isPresent=true;}
                else{isPresent=false;}
                students.get(i).markAttendance(date, isPresent);
                System.out.println("Attendance marked");
                break;
            }
        }
        if(!isStudentfound){
            System.out.println("Student id not found");
        }
      }
    }

    public static void updatestudent(){
        while(true){
            boolean isUpdateFound=false;
            System.out.println("\n\nEnter student id to update (0 to stop)");
            int id=scan.nextInt();
            scan.nextLine();
            if(id==0){break;}
            for(int i=0;i<students.size();i++){
                if(students.get(i).getId()==id){
                    isUpdateFound=true;
                    System.out.println("What do you want the change (1. Name/2. ID)");
                    int choice=scan.nextInt();scan.nextLine();
                    if(choice==1){
                        System.out.printf("Enter new name : ");
                        String name=scan.nextLine();
                        if (Helpper.isDuplicate(name)) {
                            System.out.println("Student already exists");
                        }
                        students.get(i).setName(name);
                        break;
                    }
                    else if(choice==2){
                        int ID =Helpper.generateID();
                        students.get(i).setId(ID);
                        break;
                    }
                    else{System.out.println("Invalid choice");}
                    break;
                }
            }
            if(!isUpdateFound){System.out.println("Student Not Found");}
        }
    }

    public static void displaystudent(){
        System.out.printf("\n\n%-15s%-15s%-15s\n","Name","ID","Age");
        for(int i=0;i<students.size();i++){
            System.out.printf("\n%-15s%-15s%-15s\n",students.get(i).getName(),students.get(i).getId(),students.get(i).getAge());
        }
    }

    // -------------------------------------------------------------------------------------------------------------------------------------------

    public static void addteacher(){
        while(true){
            MainClass.Teacher teacher=new MainClass.Teacher();
            System.out.printf("Enter Teacher's name (0 to stop) : ");
            String name=scan.nextLine();
            if(name.equals("0")){break;}
            if(Helpper.isTeacherNameDuplicate(name)){
                System.out.println("Teacher already exists");
            }
            teacher.setName(name);
            int TeacherId=Helpper.generateID();
            teacher.setId(TeacherId);

            String number = Helpper.setContactNumber("Enter phone number : ");
            teacher.setContactNumber(number);
            String email = Helpper.setEmail("Enter email : ");
            teacher.setEmail(email);
            String enrolldate=Helpper.enrolldate("Enter Teacher's joined date : ");
            teacher.setJoiningDate(enrolldate);
            teachers.add(teacher);

        }
    }
    
    public static void deleteteacher(){
        while(true){
            boolean isDeletefound=false;
            System.out.printf("Enter teacher's ID to remove (0 to stop) : ");
            int id = scan.nextInt();
            scan.nextLine();
            if(id==0){break;}
            for(int i=0;i<teachers.size();i++){
                if(teachers.get(i).getId()==id){
                    isDeletefound=true;teachers.remove(i);System.out.println("Teacher had been successfully remove");break;
                }
            }
            if(!isDeletefound){
                System.out.println("Teacher not found");
            }
        }
    }

    public static void assignclass(){}

    public static void displayteacher(){}

    public static void leavemanagement(){}
}


