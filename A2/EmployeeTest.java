public class EmployeeTest {
    public static void main(String[] args)
    {
        // Create three Employee objects
        Employee employee1 = new Employee("Bob","Jones",2875.00);
        Employee employee2 = new Employee("Susan ","Baker",3150.75);
        Employee employee3 = new Employee("John","Lin",-5000.00);


        // Display the first name, last name and yearly salary of the employee1
        System.out.printf("Employee 1: %s %s; Yearly Salary: %.2f%n",
                employee1.getFirstName(),employee1.getLastName(),
                (employee1.getMonthlySalary()*12));

        // Display the first name, last name and yearly salary of the employee2
        System.out.printf("Employee 2: %s %s; Yearly Salary: %.2f%n",
                employee2.getFirstName(),employee2.getLastName(),
                (employee2.getMonthlySalary()*12));

        // Display the first name, last name and yearly salary of the employee3
        System.out.printf("Employee 3: %s %s; Yearly Salary: %.2f%n",
                employee3.getFirstName(),employee3.getLastName(),
                (employee3.getMonthlySalary()*12));

        // Increases each employees' salaries by 10%
        System.out.println("\nIncreasing employee salaries by 10%");
        employee1.setMonthlySalary(employee1.getMonthlySalary() * (1 + 0.1));
        employee2.setMonthlySalary(employee2.getMonthlySalary() * (1 + 0.1));
        employee3.setMonthlySalary(employee3.getMonthlySalary() * (1 + 0.1));

        // Display employee1's information after increased salaries by 10%
        System.out.printf("Employee 1: %s %s; Yearly Salary: %.2f%n",
                employee1.getFirstName(),employee1.getLastName(),
                (employee1.getMonthlySalary()*12));

        // Display employee2's information after increased salaries by 10%
        System.out.printf("Employee 2: %s %s; Yearly Salary: %.2f%n",
                employee2.getFirstName(),employee2.getLastName(),
                (employee2.getMonthlySalary()*12));

        // Display employee3's information after increased salaries by 10%
        System.out.printf("Employee 3: %s %s; Yearly Salary: %.2f%n",
                employee3.getFirstName(),employee3.getLastName(),
                (employee3.getMonthlySalary()*12));



    }
}
