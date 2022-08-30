import java.util.Scanner;

public class Main {

    public static double calculateEmployeeSalary(double hoursWorkedPerWeek, double hourlyRate) {
        double result;
        result = (hoursWorkedPerWeek * hourlyRate) * 52;
        return result;
    }

    public static void main(String[] args) {
        double hoursWorkedPerWeek;
        double hourlyRate;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter hours worked per week.");
        hoursWorkedPerWeek = input.nextInt();
        System.out.println("Enter hourly rate.");
        hourlyRate = input.nextInt();
        double grossYearlySalary = calculateEmployeeSalary(hoursWorkedPerWeek, hourlyRate);
        System.out.println("Your Gross Yearly Salary is " + grossYearlySalary);
    }
}
