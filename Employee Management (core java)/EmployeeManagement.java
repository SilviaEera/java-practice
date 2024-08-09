import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

abstract class Employee implements Serializable {

    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "[" + "Name: " + name + " Employee Id: " + id + " Salary " + calculateSalary() + "]";
    }
}

class FullTimeEmployee extends Employee {
    double salary;

    public FullTimeEmployee(String name, int id, double salary) {

        // using the paraent constractor inside the child constractor
        // child inheriting parent class constractor
        super(name, id);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;

    }

    public void changeSalary(int newSalary) {
        salary = newSalary;
    }

}

// part-time employee class

class PartTimeEmployee extends Employee {

    private float hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, float hoursWorked, double hourlyRate) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;

    }

}

class ManagementSystem {
    FullTimeEmployee f;
    PartTimeEmployee p;

    // a list to hold the objects of all the employees
    private ArrayList<Employee> employees;

    Scanner sc = new Scanner(System.in);

    public ManagementSystem() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // to remove an employee

    public void removeEmployee(int id) {
        Employee employeeToRemove = null;
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employeeToRemove = employee;
                break;
            }

        }

        if (employeeToRemove != null) {
            employees.remove(employeeToRemove);
            System.out.println("Employee " + employeeToRemove.getName() + " has been removed.");
        }

    }

    int newSalary;

    // changing the salary of an existing employee
    public int changeSalary(int id) {
        Employee changeSalaryOfEmployee = null;

        for (Employee employee : employees) {
            if (employee.getId() == id) {
                changeSalaryOfEmployee = employee;
                break;
            }
        }

        if (changeSalaryOfEmployee != null) {
            System.out.println("Please enter the new salary for employee " + changeSalaryOfEmployee.getName() + ".");
            newSalary = sc.nextInt();
        }

        // for (Employee employee : employees) {
        // if (employee == f) {
        // f.changeSalary(newSalary);
        // }
        // }
        return newSalary;
    }

    public void displayEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void displaySingleEmployee(int id) {
        Employee displayEmployeeDetails = null;

        for (Employee employee : employees) {
            if (employee.getId() == id) {
                displayEmployeeDetails = employee;
                break;
            }
        }

        if (displayEmployeeDetails != null) {
            System.out.println(displayEmployeeDetails);
        } else {
            System.out.println("Employee not found. Try entering the correct ID.");
        }

    }
}

class EmployeeManagement {
    public static void main(String[] args) throws Exception {

        ManagementSystem managementSystem = new ManagementSystem();

        Employee e = null;
        HashMap<Integer, Employee> h = new HashMap<>();

        try {
            FileInputStream fis = new FileInputStream("AllEmployee.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int count = ois.readInt();
            for (int i = 0; i < count; i++) {
                e = (Employee) ois.readObject();

                h.put(e.getId(), e);
            }
            fis.close();
            ois.close();
        } catch (Exception err) {
            System.out.println(err);
        }

        FileOutputStream fos = new FileOutputStream("AllEmployee.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Scanner sc = new Scanner(System.in);
        int option;

        String name;
        int id;
        double salary;
        float hoursWorked;
        double hourlyRate;

        do {
            System.out.println("Type 1 to add Full-Time Employee. ");
            System.out.println("Type 2 to add Part-Time Employee. ");
            System.out.println("Type 3 to remove Employee. ");
            System.out.println("Type 4 to Display Employee. ");
            System.out.println("Type 5 to Display All Employee. ");
            System.out.println("Type 6 To close menu. ");
            option = sc.nextInt();
            switch (option) {
                case 1:

                    System.out.println("Enter employee name. ");
                    name = sc.next();
                    System.out.println();
                    System.out.println("Enter employee id. ");
                    id = sc.nextInt();
                    System.out.println();
                    System.out.println("Enter employee salary. ");
                    salary = sc.nextDouble();

                    FullTimeEmployee e1 = new FullTimeEmployee(name, id, salary);
                    managementSystem.addEmployee(e1);
                    h.put(id, e1);
                    System.out.println();
                    System.err.println("Employee addedd successfylly.");

                    break;
                case 2:
                    System.out.println("Enter employee name. ");
                    name = sc.next();
                    System.out.println();
                    System.out.println("Enter employee id. ");
                    id = sc.nextInt();
                    System.out.println();
                    System.out.println("Enter hours worked. ");
                    hoursWorked = sc.nextFloat();
                    System.out.println();
                    System.out.println("Enter employees hourly rate. ");
                    hourlyRate = sc.nextDouble();

                    PartTimeEmployee pe1 = new PartTimeEmployee(name, id, hoursWorked, hourlyRate);
                    managementSystem.addEmployee(pe1);
                    h.put(id, pe1);

                    System.out.println();
                    System.err.println("Employee addedd successfylly.");

                    break;

                case 3:
                    System.out.println("Enter id of employee you want to remove. ");

                    id = sc.nextInt();

                    h.remove(id);

                    System.out.println("Successfully removed Employee.");

                    break;
                case 4:
                    id = sc.nextInt();

                    e = h.get(id);
                    System.out.println(e);

                    break;

                case 5:
                    for (Employee ee : h.values()) {
                        System.out.println(ee);
                    }
                    break;
                case 6:

                    oos.writeInt(h.size());
                    for (Employee ee : h.values()) {
                        oos.writeObject(ee);
                    }

            }

        } while (option != 6);

        // FullTimeEmployee e1 = new FullTimeEmployee("Silvia", 1, 5000);
        // FullTimeEmployee e2 = new FullTimeEmployee("Taskia", 2, 15000);
        // PartTimeEmployee pe1 = new PartTimeEmployee("Taslima", 3, 5, 500);
        // PartTimeEmployee pe2 = new PartTimeEmployee("Mehedi", 4, 4, 350);

        // managementSystem.addEmployee(e1);
        // managementSystem.addEmployee(e2);
        // managementSystem.addEmployee(pe1);
        // managementSystem.addEmployee(pe2);

        // managementSystem.displayEmployee();

        // managementSystem.removeEmployee(3);

        // System.out.println();

        // managementSystem.displayEmployee();

    }
}