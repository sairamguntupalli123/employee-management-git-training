public class Main {

    public static void main(String[] args) {

        System.out.println("Employee Management System");

        Employee employee = new Employee(101, "John");

        employee.displayEmployee();

        SalaryCalculator calculator = new SalaryCalculator();

        double monthlySalary = 5000;

        double annualSalary = calculator.calculateAnnualSalary(monthlySalary);

        System.out.println("Annual Salary: " + annualSalary);

        EmployeeSearch search = new EmployeeSearch();

        search.searchEmployee(101);
    }
}