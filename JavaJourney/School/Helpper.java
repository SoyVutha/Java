package School;
import java.util.*;
public class Helpper {
    public static Scanner scan=new Scanner(System.in);
    public static ArrayList<String> usernames=new ArrayList<>();
    public static ArrayList<Integer> ids=new ArrayList<>();
    public static Random rand=new Random();

    public static boolean isDuplicate(String name){
        boolean isDuplicated=false;
        if(usernames.contains(name)){return true;}
        else{usernames.add(name);return false;}
    }

    public static int isAgevalid(String prompt){
        System.out.println(prompt);
        int age=scan.nextInt();
        try{
            if(age<0){throw new Exception("Age cannot be negative");}
            return age;
        }
        catch(Exception e){
            System.out.println("Invalid age");
            return -1;
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
}
