package w3Schools;

class Details {
    String name;
    int age;
    int phoneNumber;
    String address;
    int salary;

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Details {
    /*The Employee class has an additional property, specialization, which is not present in the Details class.
     This means that Employee has all the properties of Details, plus the specialization property.*/
    String specialization;
}

class Manager extends Details {
    /*Similarly, the Manager class has an additional property, department, which is not present in the Details class.
     This means that Manager has all the properties of Details, plus the department property.*/
    String department;
}

public class Member {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "xyz";
        e.age = 23;
        e.phoneNumber = 986765432;
        e.address = "xyzxyz";
        e.salary = 1231;
        e.specialization = "xyzxyz";

        Manager m = new Manager();
        m.name = "xyz";
        m.age = 23;
        m.phoneNumber = 986765432;
        m.address = "xyzxyz";
        m.salary = 1231;
        m.department = "xyzxyz";

        System.out.println("Employee Details:");
        System.out.println("Name: " + e.name);
        System.out.println("Age: " + e.age);
        System.out.println("Phone Number: " + e.phoneNumber);
        System.out.println("Address: " + e.address);
        e.printSalary();
        System.out.println("Specialization: " + e.specialization);

        System.out.println("\nManager Details:");
        System.out.println("Name: " + m.name);
        System.out.println("Age: " + m.age);
        System.out.println("Phone Number: " + m.phoneNumber);
        System.out.println("Address: " + m.address);
        m.printSalary();
        System.out.println("Department: " + m.department);
    }
}
