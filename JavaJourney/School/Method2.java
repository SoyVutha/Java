
import java.util.*;
public  class Method2 {
    public static Scanner scan=new Scanner(System.in);
     
    public static List<MainClass.Student> students=new ArrayList<>();
    public static List<MainClass.Teacher> teachers = new ArrayList<>();
    public static List<MainClass.Class> classes=new ArrayList<>();
 

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
            System.out.printf("\n\nEnter Teacher's name (0 to stop) : ");
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
            String enrolldate=Helpper.enrolldate("Enter Teacher's joined date(YYYY MM Dd) : ");
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

    public static void assignclass(){
        boolean isAssignFound=false;boolean isAssignClassFound=false;
        MainClass.Class history=new MainClass.Class("History", 101);
        MainClass.Class English = new MainClass.Class("English I", 102);
        MainClass.Class math = new MainClass.Class("Math I", 201);
        MainClass.Class Critical_Thinking = new MainClass.Class("Critical Thinking", 301);
        MainClass.Class Computer_Science = new MainClass.Class("Computer Science", 401);
        classes.add(Computer_Science);classes.add(history);classes.add(English);classes.add(math);classes.add(Critical_Thinking);
        while(true){
            if(teachers.isEmpty()){return;}
            for(int i=0;i<teachers.size();i++){
                System.out.println("Teacher name : "+teachers.get(i).getName()+" Teacher ID : "+teachers.get(i).getId());
            }
            System.out.printf("Enter teacher's ID to assign class (0 to stop) : ");
            int id = scan.nextInt();scan.nextLine();
            if(id==0){break;}
            MainClass.Teacher teach=null;
            for(int i=0;i<teachers.size();i++){
                if(teachers.get(i).getId()==id){
                    isAssignFound=true;
                    teach=teachers.get(i);
                    break;
                }
            }
            if(!isAssignFound){
                System.out.println("Teacher not found");
                continue;
            }
            System.out.println("\nAvailable classes : ");
            for(int i=0;i<classes.size();i++){
                System.out.println("Class name : "+classes.get(i).getClassName()+" Section : "+classes.get(i).getSection());
            }

            System.out.printf("Enter class section to assign teacher (0 to stop) : ");
            int section = scan.nextInt();scan.nextLine();
            if(section==0){break;}
            MainClass.Class Cls=null;
            for(int i=0;i<classes.size();i++){
                if(classes.get(i).getSection()==section){
                    isAssignClassFound=true;
                    Cls=classes.get(i);
                    break;
                }
            }
            if(!isAssignClassFound){
                System.out.println("Class not found");
            }
            if(Cls==null){
                System.out.println("Class not found ");continue;
            }
            teach.getAssigClasses().add(Cls);

            System.out.println("Class " + Cls.getClassName() + " assigned to teacher " + teach.getName());
            break;
            
        }

    }

    public static void displayteacher(){
        System.out.printf("%-10s %-10s %-20s %-20s\n","Name","ID","Email","Phone Number");
        for(int i=0;i<teachers.size();i++){
            System.out.printf("%-10s %-10s %-20s %-20s\n",teachers.get(i).getName(),teachers.get(i).getId(),teachers.get(i).getEmail(),teachers.get(i).getContactNumber());
        }
    }
    public static void leavemanagement(){
        boolean isLeaveFound=false;
        while(true){
            System.out.printf("Enter Teacher's ID (0 to stop) : ");
            int Id = scan.nextInt();scan.nextLine();
            if(Id==0){break;}
            for(int i=0;i<teachers.size();i++)
            {
                if(teachers.get(i).getId()==Id){
                    isLeaveFound=true;
                    System.out.printf("Enter date : ");String date = scan.nextLine();
                    System.out.printf("Enter reason : ");String reason = scan.nextLine();
                    teachers.get(i).requestLeave(date, reason);
                    System.out.println("Leaved Successfully");
                    break;
                }
            }
            if(!isLeaveFound){
                System.out.println("Teacher not found");
            }
        }
    }

    public static void teacherattandance(){
        
    }


    // -------------------------------------------------------------------------------------------------------------------------------------------
    public static void addClass(){
        while(true)
        {
            System.out.printf("Enter Class Name (0 to stop) : ");
            String name = scan.nextLine();
            if(name.equals("0")){break;}
            System.out.printf("Enter class section : ");
            int section= scan.nextInt();scan.nextLine();
            MainClass.Class Cls = new MainClass.Class(name,section);
            if(classes.contains(Cls)){
                System.out.println("Class already exists");
            }
            else{
                classes.add(Cls);
            }
        }
}

    public static void deleteclass(){
        boolean isDeleteClassFound=false;
        while(true){
            System.out.printf("Enter Class section (0 to stop) : ");
            int section = scan.nextInt();scan.nextLine();
            if(section==0){break;}
            for(int i=0;i<classes.size();i++)
            {
                if(classes.get(i).getSection()==section){
                    isDeleteClassFound=true;
                    classes.remove(i);
                    break;
                }
            }
            if(!isDeleteClassFound){
                System.out.println("Class not found");
            }
        }
    }

    public static void AssignStudent() {
        boolean is_Class_Found=false;
        boolean is_Student_Found=false;
        while (true) {
            System.out.printf("Enter Class section (0 to stop) : ");
            int section = scan.nextInt();
            scan.nextLine();
            if (section == 0) {
                break;
            }
            MainClass.Class targetClass=null;
            for (int i = 0; i < classes.size(); i++) {
                if (classes.get(i).getSection() == section) {
                    is_Class_Found=true;
                    targetClass = classes.get(i);
                    break;
                }
            }
            if(!is_Class_Found){
                System.out.println("Class not found");
            }
            System.out.printf("Enter student name (0 to stop) : ");            
            String name = scan.nextLine();
            if(name.equals("0")){
                break;
            }
            MainClass.Student target_student =null;
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getName().equals(name)) {
                    is_Student_Found=true;
                    target_student=students.get(i);
                    break;
                }
            }
            if(!is_Student_Found){
                System.out.println("Student not found");
            }
            
            if(targetClass.getStudents().contains(target_student)){
                System.out.println("Student already assigned to this class");
            }
            else{
                targetClass.getStudents().add(target_student);
                System.out.println("Student " + target_student + " assigned to class " + targetClass.getClassName());
            }
        }
    }

    public static void ClassDetail(){
        System.out.printf("\n\n%-15s%-15s%-15s\n","Class Name","Section","Teacher");
        for(int i=0;i<classes.size();i++){
            MainClass.Class Cls=classes.get(i);
            StringBuilder teachername=new StringBuilder();
            List<MainClass.Teacher> assignTeachers = Cls.getassignTeachers();
        for(MainClass.Teacher teacher: assignTeachers){
            if(teachername.length()>0){
                teachername.append(", ");
            }
            teachername.append(teacher.getName());
        }  
        if(teachername.length()<0){
            teachername.append("No Teacher");
        }
        System.out.printf("%-15s%-15s%-15s\n",Cls.getClassName(),Cls.getSection(),teachername.toString());
    }
    }
}

