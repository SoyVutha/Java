
//COMPLETE  CODE
import java.util.Random;
import java.util.Scanner;

public class student {
    //GLOBAL VARIABLE
    static int student_Index=0;
    static int choice;
    static Random rand=new Random();//Generate Random Number
    static int isSearchFound=0;
    static int isDeleteFound=0;
    static int isUpdateGradeFound=0;
    static int isUpdateAttendenceFound=0;

    static Scanner scan=new Scanner(System.in);
    static Student_Information[] students=new Student_Information[100];

    //CLASS
    public static class Student_Information
    {
        private String name;
        private int ID;
        private float Math_Course_Grade;
        private float English_Course_Grade;
        private float Computer_Course_Grade;
        private float Geo_Course_Grade;
        private float total_Grade;
        private int attendence;

        //DEFAULT VALUE
        public Student_Information()
        {
            this.name="";
            this.ID=0;
            this.Computer_Course_Grade=0;
            this.Math_Course_Grade=0;
            this.English_Course_Grade=0;
            this.Geo_Course_Grade=0;
            this.total_Grade=0;     
            this.attendence=0;       
        }

        //GETTER AND SETTER
        //GETTER AND SETTER
            public String getName() 
            {
                return name;
            }

            public void setName(String name)
            {
                this.name = name;
            }

            public int getID()
            {
                return ID;
            }

            public void setID(int iD)
            {
                ID = iD;
            }

            public float getMath_Course_Grade()
            {
                return Math_Course_Grade;
            }

            public void setMath_Course_Grade(float math_Course_Grade)
            {
                Math_Course_Grade = math_Course_Grade;
            }

            public float getEnglish_Course_Grade()
            {
                return English_Course_Grade;
            }

            public void setEnglish_Course_Grade(float english_Course_Grade)
            {
                English_Course_Grade = english_Course_Grade;
            }

            public float getComputer_Course_Grade()
            {
                return Computer_Course_Grade;
            }

            public void setComputer_Course_Grade(float computer_Course_Grade)
            {
                Computer_Course_Grade = computer_Course_Grade;
            }

            public float getGeo_Course_Grade()
            {
                return Geo_Course_Grade;
            }

            public void setGeo_Course_Grade(float geo_Course_Grade)
            {
                Geo_Course_Grade = geo_Course_Grade;
            }

            public float getTotal_Grade()
            {
                return total_Grade;
            }

            public void setTotal_Grade(float total_Grade)
            {
                this.total_Grade = total_Grade;
            }
            public int getattendence() {
                return attendence;
            }
        
            public void setattendence(int attendence) {
                this.attendence = attendence;
            }
    }

    public static void main(String[] args) 
    {
       
        while(true)
        {
            System.out.printf("\nMENU:\n1.Add Student\n2.View Student\n3.Search & Update Student\n4.Delete Student\n5.Calculate GPA\n6.View Students Grade\n7.Update Grade\n8.View Student Attendence\n9.Update Attendence\n10.Exit\n");
            System.out.printf("Enter your choice:");
            
                        choice=scan.nextInt();
                        scan.nextLine();
                        switch(choice)
                        {
                            case 1:
                            AddStudent_Function();
                            break;
                            case 2:
                            ViewStudent_Function();
                            break;
                            case 3:
                            SearchAndUpdate_Function();
                            break;
                            case 4:
                            DeleteStudent_Function();
                            break;
                            case 5:
                            CalculateGPA_Function();
                            break;
                            case 6:
                            ViewStudentGrade_Function();
                            break;
                            case 7:
                            UpdateGrade_Function();
                            break;
                            case 8:
                            ViewAttendence_Function();
                            break;
                            case 9:
                            UpdateAttendence_Function();
                            break;
                            case 10:
                            System.exit(0);
                            default:
                            System.out.printf("Invalid choice\n");
                        }

            
        }   
    }



    public static void AddStudent_Function ()
    {
        while(student_Index<students.length)
        {
            Student_Information student=new Student_Information();

            System.out.printf("Enter Student name(0 to stop):");
            student.setName(scan.nextLine());
            if(student.getName().equals("0"))
            {
                break;

            }

            student.setID(rand.nextInt(Integer.MAX_VALUE-1)+1);//generate random number

            System.out.printf("%s ID:%d\n",student.getName(),student.getID());

            System.out.printf("Student %s add successfully\n",student.getName());

            students[student_Index++]=student;

        }
    }

    public static void ViewStudent_Function ()
    {
        System.out.printf("%-15s%-15s\n","Name","Student 3ID");
        for(int i=0;i<student_Index;i++)
        {
            Student_Information student=students[i];
            System.out.printf("%-15s%-15d\n",student.getName(),student.getID());
        }
    }

    public static void SearchAndUpdate_Function ()
    {
        while(true)
        {
            isSearchFound=0;
            System.out.printf("Enter student name to search(0 to stop):");
            String searchname=scan.nextLine();
            if(searchname.equals("0"))
            {
                break;
            }

            for(int i=0;i<student_Index;i++)
            {
                if(students[i].getName().equalsIgnoreCase(searchname))
                {
                    isSearchFound=1;
                    System.out.printf("Enter new name:");
                    students[i].setName(scan.nextLine());
                    System.out.printf("Student %s updated\n",searchname);
                    break;
                }
            }
            if(isSearchFound==0)
            {
                System.out.printf("Student %s not found\n",searchname);
            }
            
        }
    }

    public static void DeleteStudent_Function ()
    {
        while(true)
        {
            isDeleteFound=0;
            System.out.printf("Enter student name to delete(1.Start/0.Stop):");
            String deleteName=scan.nextLine();
            if(deleteName.equals("0"))
            {
                break;
            }
            for(int i=0;i<student_Index;i++)
            {
                if(students[i].getName().equalsIgnoreCase(deleteName))
                {
                    isDeleteFound=1;
                    for(int j=i;j<student_Index-1;j++)
                    {
                        students[j]=students[j+1];
                    }
                    student_Index--;
                    System.out.printf("Student %s delete sucessully\n",deleteName);
                }
            }
            if(isDeleteFound==0)
            {
                System.out.printf("Student %s not found\n",deleteName);
            }
        }
    }



    public static void CalculateGPA_Function ()
    {
        boolean isStop=false;
       while(!isStop)
       {
        
           for(int i=0;i<student_Index;i++)
           {
               try
               {
                  
                       System.out.printf("Enter student %s grade on the following courses(1.Start/0.Stop):\n",students[i].getName());
                       int stop_or_not=scan.nextInt();
                       scan.nextLine();
                       if(stop_or_not==0)
                       {
                        isStop=true;
                       }
                       else
                       {
                           students[i].setComputer_Course_Grade(getValidInput("Computer course:"));
                           students[i].setMath_Course_Grade(getValidInput("Math course:"));
                           students[i].setEnglish_Course_Grade(getValidInput("English course:"));
                           students[i].setGeo_Course_Grade(getValidInput("Geography course:"));
                           
                           CalculateGPA(students[i]);

                           System.out.printf("%s Overall GPA:%.2f\n",students[i].getName(),students[i].getTotal_Grade());
                       }

               }
               catch (Exception e)
               {
                   System.out.printf("Invalid grade input,please enter a valid one");
                   scan.nextLine();
               }
           }
       }
    }

    public static void CalculateGPA(Student_Information student)
    {
       
        
            student.setTotal_Grade(
                (student.getComputer_Course_Grade()
                +student.getEnglish_Course_Grade()
                +student.getGeo_Course_Grade()
                +student.getMath_Course_Grade()
                )/4
            );   
        
    }


    public static float getValidInput(String prompt)
    {
        float grade=0.00f;
        boolean isValid=false;
        while(!isValid)
        {
            System.out.printf(prompt);  //This code print out the parameter (prompt) 
            try{
                String input=scan.nextLine(); //Read the user input as string
                grade=Float.parseFloat(input); //Convert the string by user into float 
                isValid=true;
            }
            catch(Exception e)
            {
                System.out.println("Invalid input, please enter a valid number");
                scan.nextLine();

            }
        }
        return grade;
    }



    public static void ViewStudentGrade_Function ()
    {
        System.out.printf("\n%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n","StudentName","Student ID","Geography","Mathmatices","English","Computer","Overall Grade");
        for(int i=0;i<student_Index;i++)
        {
            Student_Information View=students[i];
            System.out.printf("%-15s%-15d%-15.2f%-15.2f%-15.2f%-15.2f%-15.2f\n",View.getName(),View.getID(),View.getGeo_Course_Grade(),View.getMath_Course_Grade(),View.getEnglish_Course_Grade(),View.getComputer_Course_Grade(),View.getTotal_Grade());
        }
    }
    public static void UpdateGrade_Function ()
    {
        while(true)
        {
            isUpdateGradeFound=0;
            System.out.printf("Enter Student Name to Update Grade(0 to stop):");
            String UpdateGradeName=scan.nextLine();
            if(UpdateGradeName.equals("0"))
            {
                break;
            }
            for(int i=0;i<student_Index;i++)
            {
                if(UpdateGradeName.equalsIgnoreCase(students[i].getName()))
                {
                    isUpdateGradeFound=1;
                    System.out.printf("Enter Student %s Course to Update(Geography/Mathmatics,English,Computer):",UpdateGradeName);
                    String UpdateGradeCourse=scan.nextLine();
                    try
                    {
                        if(UpdateGradeCourse.equalsIgnoreCase("Geography"))
                        {
                            System.out.printf("Enter %s New Grade",UpdateGradeName);
                            students[i].setGeo_Course_Grade(scan.nextFloat());
                            scan.nextLine();
                        
                        }
    
                        else if(UpdateGradeCourse.equalsIgnoreCase("Mathmatics"))
                        {
                            System.out.printf("Enter %s New Grade",UpdateGradeName);
                            students[i].setMath_Course_Grade(scan.nextFloat());
                            scan.nextLine();
                            
                        }
    
                        else if(UpdateGradeCourse.equalsIgnoreCase("English"))
                        {
                            System.out.printf("Enter %s New Grade",UpdateGradeName);
                            students[i].setEnglish_Course_Grade(scan.nextFloat());
                            scan.nextLine();
                            
                        }
    
                        else if(UpdateGradeCourse.equalsIgnoreCase("Computer"))
                        {
                            System.out.printf("Enter %s New Grade",UpdateGradeName);
                            students[i].setComputer_Course_Grade(scan.nextFloat());
                            scan.nextLine();
                        
                        } 
    
                        else{
                            System.out.printf("Invalid choice\n,");
                            break;
                        }  
                        CalculateGPA(students[i]);
                        System.out.printf("Grade updated and GPA recalculated for %s\n", UpdateGradeName);  
                        break;
                    }
                    catch(Exception e)
                    {
                        System.out.printf("Invalid option,please enter a valid one");
     
                    }
                

                }
            }
            if(isUpdateGradeFound==0)
            {
                System.out.printf("Student not found\n");

            }
        }
    }

    public static void ViewAttendence_Function() {
        System.out.printf("%-15s%-15s%-15s\n","Student Name","Student ID","Student Attendance");
        for(int i=0;i<student_Index;i++) {
            Student_Information student=students[i];
            System.out.printf("%-15s%-15d%-15d\n",student.getName(),student.getID(),student.getattendence());
        }
    }
    

    public static void UpdateAttendence_Function ()
    {
        while(true)
        {
            System.out.printf("Enter Student ID to update attendence(0 to stop): ");
            int update_attendence_id=scan.nextInt();
            scan.nextLine();
            if(update_attendence_id==0)
            {
                break;
            }
            for(int i=0;i<student_Index;i++)
            {   
                if(update_attendence_id==students[i].getID())
                {
                    isUpdateAttendenceFound=1;
                    System.out.printf("Enter %s New Attendence:",update_attendence_id);
                    try
                    {
                        students[i].setattendence(scan.nextInt());
                        scan.nextLine();
                        System.out.printf("Attendence Updated sucessfully\n");
                        break;
                    }
                    catch(Exception e)
                    {
                        System.out.printf("Invalid option,please enter a valid one");
                        scan.nextLine();
                    }
                }
            }            
        }

    }


}
