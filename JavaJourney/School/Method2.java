package School;
import java.util.*;
public  class Method2 {
    public static Scanner scan=new Scanner(System.in);
    public static MainClass.Student student=new MainClass.Student();
    public static List<MainClass.Student> students=new ArrayList<>();
    public static int studentindex=0;

    public static void Addstudent(){
        while(true){
            System.out.println("Enter student name (0 to stop)");
            String name=scan.nextLine();
            if(name.equals("0")){break;}
            if(Helpper.isDuplicate(name)){
                System.out.println("Student already exists");
            }
            student.setName(name);

            int age = Helpper.isAgevalid("Enter student's age : ");student.setAge(age);

            int id=Helpper.generateID();student.setId(id);
            students.add(student);
            studentindex++;
        }
    }

    public static void Deletestudent(){
        boolean isStudentIdFonund = false;
        while(true){
            System.out.println("Enter student id to delete (0 to stop)");
            int id=scan.nextInt();
            scan.nextLine();
            if(id==0){break;}
           
            for(int i=0;i<students.size();i++){
                if(student.getId()==id){students.remove(i);studentindex--;System.out.println("Student successfully removed");isStudentIdFonund=true;break;}
            }
            if(!isStudentIdFonund){System.out.println("Student id not found");
            
        }
    }
    }

    public static void studentattandance(){}

    public static void updatestudent(){}

    public static void displaystudent(){}
}

