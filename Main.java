import java.util.Scanner;

public class Main {

    public static double calculateEmployeeSalary(double hoursWorkedPerWeek, double hourlyRate, double totalVacationDays) {
        double result;
        double totalHoursWorkedForYear;
        double totalVacationHoursTaken;

        totalVacationHoursTaken = totalVacationDays * 8;
        totalHoursWorkedForYear = (hoursWorkedPerWeek * 52) - totalVacationHoursTaken;
        result = totalHoursWorkedForYear * hourlyRate;

        return result;
    }

    public static void main(String[] args) {
        double hoursWorkedPerWeek;
        double hourlyRate;
        double totalVacationDays;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter hours worked per week.");
        hoursWorkedPerWeek = input.nextInt();

        System.out.println("Enter hourly rate.");
        hourlyRate = input.nextInt();

        System.out.println("Enter total vacation days taken.");
        totalVacationDays = input.nextInt();

        double grossYearlySalary = calculateEmployeeSalary(hoursWorkedPerWeek, hourlyRate, totalVacationDays);
        System.out.println("Your Gross Yearly Salary is " + grossYearlySalary);
    }
}
