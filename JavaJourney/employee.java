
import java.util.Scanner;

public class employee {
    //GlOBAl VIRIABLE
    static int employee_Index=0;
    static int choice;
    static int IsSearchFound=0;
    static int IsDeleteFound=0;

    static Scanner scan = new Scanner(System.in);
    static employee_information[] employees=new employee_information[50]; //THIS LINE IS IMPORTANT

    //CLASS
    public static class employee_information
    {
        private String name;
        private int age;
        private float salary;
        private int experince;
        private String department;

        //DEFAULT VALUE
            public employee_information()
            {
                this.name="";
                this.age=0;
                this.salary=0.00f;
                this.experince=0;
                this.department="";
            }
        //GETTER SETTER
            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public float getSalary() {
                return salary;
            }

            public void setSalary(float salary) {
                this.salary = salary;
            }

            public int getExperience() {
                return experince;
            }

            public void setExperience(int experience) {
                this.experince = experience;
            }

            public String getDepartment() {
                return department;
            }

            public void setDepartment(String department) {
                this.department = department;
            }
    }
    
    public static void main(String[] args) {
        while(true)
        {
            System.out.printf("\nMENU:\n1.Add Employee\n2.View Employee\n3.Search & Update Employee\n4.Delete Employee\n5.Exit\n");
            System.out.printf("Enter your choice");
            choice=scan.nextInt();
            scan.nextLine();
            switch(choice)
            {
                case 1:
                AddEmployee_Function();
                break;
                case 2:
                ViewEmployee_Function();
                break;
                case 3:
                SearchUpdate_Function();
                break;
                case 4:
                Delete_Function();
                break;
                case 5:
                System.exit(0);
                break;
                default:
                System.out.printf("Invalid choice\n");
                break;
            }
        }
        
    } 

    //FUNTION OR VIOD
    public static void AddEmployee_Function()
    {
        if(employee_Index<employees.length)
        {
            employee_information emp=new employee_information();//CREATE EMP WHICH IS ARRAY VALUE OF EMPLOYEE_INFORMATION

            System.out.printf("Enter employee name:");
            emp.name=scan.nextLine();

            System.out.printf("Enter %s age", emp.name);
            emp.age=scan.nextInt();
            scan.nextLine();

            System.out.printf("Enter %s department:",emp.name);
            emp.department=scan.nextLine();

            System.out.printf("Enter %s experience:",emp.name);
            emp.experince=scan.nextInt();
            scan.nextLine();

            System.out.printf("Enter %s salary:",emp.name);
            emp.salary=scan.nextFloat();
            scan.nextLine();

            employees[employee_Index++]=emp;//INCREMENT BY 1
            System.out.printf("Employee %s successfully added\n",emp.name);
        }
        else{
            System.out.printf("Employee database is full, cannot add more employee\n");
        }

    }

    public static void ViewEmployee_Function()
    {
        System.out.printf("%-15s%-5s%-15s%-15s%-10s\n", "Name", "Age", "Department", "Experience", "Salary");
        for(int i=0;i<employee_Index;i++)
        {
            employee_information emp=employees[i]; 
            System.out.printf("%-15s%-5d%-15s%-15d%-10.2f\n", emp.getName(), emp.getAge(), emp.getDepartment(), emp.getExperience(), emp.getSalary());
        }
    }

    public static void SearchUpdate_Function()
    {
    

        
            System.out.printf("Enter the employee name to search:");
            String searchname=scan.nextLine();
            for(int i=0;i<employee_Index;i++)
            {
                if(employees[i].getName().equalsIgnoreCase(searchname))
                {
                    IsSearchFound=1;
                    System.out.printf(" Enter Update options(salary/age/name/department/experience) for %s:",searchname);
                    String updateoption=scan.nextLine();
                    if(updateoption.equalsIgnoreCase("salary"))
                    {
                        System.out.printf("Enter %s new salary",searchname);
                        employees[i].setSalary(scan.nextFloat());
                        scan.nextLine();
                        break;
                    }
                    else if(updateoption.equalsIgnoreCase("age"))
                    {
                        System.out.printf("Enter %s new age",searchname);
                        employees[i].setAge(scan.nextInt());
                        scan.nextLine();
                        break;
                    }
                    else if(updateoption.equalsIgnoreCase("name"))
                    {
                        System.out.printf("Enter %s new name",searchname);
                        employees[i].setName(scan.nextLine());
                        break;
                    }
                    else if(updateoption.equalsIgnoreCase("department"))
                    {
                        System.out.printf("Enter %s new department",searchname);
                        employees[i].setDepartment(scan.nextLine());
                        break;
                    }
                    else if(updateoption.equalsIgnoreCase("experience"))
                    {
                        System.out.printf("Enter %s new experince",searchname);
                        employees[i].setExperience(scan.nextInt());
                        scan.nextLine();
                    }
                    else{
                        System.out.printf("Invalid choice, please enter another one:");
                        updateoption=scan.nextLine();
                    }
                    System.out.printf("Updated sucessfully");

                }
            }
            if(IsSearchFound==0)
            {
                System.out.printf("Employee %s not found\n",searchname);
            }
           

        
    }

    public static void Delete_Function()
    {
        
            System.out.printf("Enter the employee name to delete:");
            String deletename=scan.nextLine();
            for(int i=0;i<employee_Index;i++)
            {
                if(employees[i].getName().equalsIgnoreCase(deletename))
                {
                    IsDeleteFound=1;
                    for(int j=i;j<employee_Index-1;j++)
                    {
                        employees[j]=employees[j+1];
                    }
                    employee_Index--;
                    System.out.printf("Employee %s deleted\n",deletename);
                }
            }
            if(IsDeleteFound==0)
            {
                System.out.printf("Employee %s not found\n",deletename);
            }
        }
    }