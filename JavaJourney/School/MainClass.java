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

    public static class teacher {

    }

    public static class attendance {

    }

    public static class exam {

    }    
}



