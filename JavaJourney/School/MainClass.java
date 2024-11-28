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

    public static class Teacher {
        private int id; 
        private String name; 
        private String designation;  
        private String contactNumber;
        private String email; 
        private String joiningDate; 

        public Teacher(){this.id=0;this.designation="";this.contactNumber="";this.email="";this.joiningDate="";}
        
        public int getId() {return id;}
        public void setId(int id) {this.id = id;}
        public String getName() {return name;}
        public void setName(String name) {this.name = name;}
        public String getDesignation() {return designation;}
        public void setDesignation(String designation) {this.designation = designation;}
        public String getContactNumber() {return contactNumber;}
        public void setContactNumber(String contactNumber) {this.contactNumber = contactNumber;}
        public String getEmail() {return email;}
        public void setEmail(String email) {this.email = email;}
        public String getJoiningDate() {return joiningDate;}
        public void setJoiningDate(String joiningDate) {this.joiningDate = joiningDate;}





    }



    public static class attendance {

    }

    public static class exam {

    }    
}



