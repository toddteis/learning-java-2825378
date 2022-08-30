import java.util.Scanner;

public class Main {

    public static double calculateEmployeeSalary(double hoursWorkedPerWeek, double hourlyRate, double totalVacationDays) {
        double result;
        double totalHoursWorkedForYear;
        double totalVacationHoursTaken;
        Scanner input = new Scanner(System.in);

        if(hoursWorkedPerWeek <= 0) {
            Boolean isValid = false;
            while(!isValid) {
                System.out.println("Hours worked per week is an incorrect value, please enter a positive integer.");
                hoursWorkedPerWeek = input.nextInt();
                if(hoursWorkedPerWeek > 0) {
                    isValid = true;
                } 
            }
        }

        if(hourlyRate <= 0) {
            Boolean isValid = false;
            while(!isValid) {
                System.out.println("Hourly rate is an incorrect value, please enter a positive integer.");
                hourlyRate = input.nextInt();
                if(hourlyRate > 0) {
                    isValid = true;
                } 
            }
        }

        if(totalVacationDays < 0) {
            Boolean isValid = false;
            while(!isValid) {
                System.out.println("Total vacation days is an incorrect value, please enter a positive integer or zero.");
                totalVacationDays = input.nextInt();
                if(totalVacationDays >= 0) {
                    isValid = true;
                } 
            }
        }

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
