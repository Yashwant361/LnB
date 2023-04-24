package Assignment.ClassAndObj;
import java.util.Scanner;
public class Employee1 {
    private String name;
    private static float salary ;
    private float hours;

    public Employee1(){
        name= " ";
        salary = 0;
        hours = 0;
    }

    public void getInfo(String name , float salary , float hours) // methods1
    {
        // Method to set employee information
        this.name = name;
        this.salary = salary;
        this.hours = hours;
    }
    public void AddSal(){
        // Method to add salary if salary is less than 500
        if (salary < 500){
            salary += 10;
        }
    }
    public void AddWork(){
        // Method to add salary if working hours is greater than 6
       if (hours > 6){
           salary+=5;
       }
    }

    public static void main(String[] args) {

        // Create an Object of Employee1 class
        Employee1 myEmp = new Employee1();

        /* taking input of employee details */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter salary");
        float salary = sc.nextFloat();
        System.out.println("Enter no. of working hour");
        float hours = sc.nextFloat();

     /* calling methods of EmployeeDetail class */
        myEmp.getInfo(name,salary,hours); // Set employee information using the getInfo method
        myEmp.AddSal();
        myEmp.AddWork();

        System.out.println("Employee name: "+myEmp.name);
        System.out.println("Salary: "+myEmp.salary);

    }
}
