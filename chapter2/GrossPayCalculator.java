package chapter2;
import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] arg) {
        // get num of hours worked
        System.out.println("Enter the number of hours worked");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        // Get the hourly rate
        System.out.println("Enter the employee's pay rate.");
        double payRate = scanner.nextDouble();

        // multiply hours by pay rate
        double grossPay = hours * payRate;

        // display the result
        System.out.println("Gross Pay: $" + grossPay);


    }
}


