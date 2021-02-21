//import java.io.*;

public class Employee {
    private String firstName; // First name of the employee
    private String lastName; // Last name of the employee
    private double monthlySalary; // Monthly salary of the employee

    // Constructor initializes firstName, lastName, and monthly salary
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName; // initializes firstName
        this.lastName = lastName;
        setMonthlySalary(monthlySalary);
    }

    // Sets the first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Returns the first name
    public String getFirstName() {
        return firstName;
    }

    // Sets the last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Returns the last name
    public String getLastName() {
        return lastName;
    }

    // Sets and validate the monthly salary
    public void setMonthlySalary(double monthlySalary) {
        if(monthlySalary < 1)
        {
            System.out.printf("%n***The inputted salary: %.2f for %s %s" +
                    " is less than zero.%nSet the salary to $1000.00.***%n%n%n",
                    monthlySalary,getFirstName(),getLastName());
            monthlySalary = 1000;
        }
        this.monthlySalary = monthlySalary;
    }

    // Returns the monthly salary
    public double getMonthlySalary() {
        return monthlySalary;
    }
}
