package School;
import java.util.*;
public class MainClass {
    public static class Student {
        private int id;
        private String name;
        private int age;
        private double grade;
        private Map<String,Boolean> attandance;
        public Student(){
            this.id=0;this.name="";this.age=0;this.grade=0.0;this.attandance=new HashMap<>();
        } 
        public int getId() {return id;}
        public void setId(int id) {this.id = id;}
        public String getName() {return name;}
        public void setName(String name) {this.name = name;}
        public int getAge() {return age;}
        public void setAge(int age) {this.age = age;}
        public double getGrade() {return grade;}
        public void setGrade(double grade) {this.grade = grade;}
        public Map<String, Boolean> getAttendance() {return attandance;}
        public void setAttendance(Map<String, Boolean> attandance) {this.attandance = attandance;}
        public void markAttendance(String date, boolean isPresent) {attandance.put(date, isPresent);}
        public Boolean getAttendance(String date) {return attandance.get(date);}
    }

    public static class Class{
        private String className;
        private int section;

        public Class(String className,int section){this.className=className;this.section= section;};
        public String getClassName() {return className;}
        public void setClassname(String className){this.className=className;}
        public int getSection() {return section;}
        public void setSection(int section) {this.section = section;}
        public void detail(){
            System.out.println("Class Name: "+className+"Class section"+section);
        }
    }
    public static class Teacher {
        private int id; 
        private String name; 
        private String contactNumber;
        private String email; 
        private String joiningDate; 
        private List<Class> assignClasses=new ArrayList<>();
        private Map<String , String> LeaveRecord= new HashMap<>();

        public Teacher(){this.id=0;this.contactNumber="";this.email="";this.joiningDate="";}
        
        public int getId() {return id;}
        public void setId(int id) {this.id = id;}
        public String getName() {return name;}
        public void setName(String name) {this.name = name;}
        public String getContactNumber() {return contactNumber;}
        public void setContactNumber(String contactNumber) {this.contactNumber = contactNumber;}
        public String getEmail() {return email;}
        public void setEmail(String email) {this.email = email;}
        public String getJoiningDate() {return joiningDate;}
        public void setJoiningDate(String joiningDate) {this.joiningDate = joiningDate;}
        public List<Class> getAssigClasses(){return assignClasses;}
        public void setAssignClass(List<Class> assigClasses){this.assignClasses=assigClasses;}

        public void requestLeave(String date, String reason){
            LeaveRecord.put(date,"Pending : "+reason);
        }

        public void updateLeave(String date, String reason){
            if(LeaveRecord.containsKey(date)){
                LeaveRecord.put(date, reason);
            }
        }

        public Map<String,String> getLeaveRecord(){
            return LeaveRecord;
        }

        
    }



    public static class attendance {

    }

    public static class exam {

    }    
}



