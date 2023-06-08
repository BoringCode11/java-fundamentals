package chapter3;
import java.util.Scanner;

public class SalaryCalculator {
   public static void main(String[] args) {
      double salary = 1000;
      double bonus = 250;

      System.out.println("Enter number of sales");
      Scanner scanner = new Scanner(System.in);
      int sales = scanner.nextInt();
      scanner.close();

      if (sales > 10) {
         salary = salary + bonus;
      }

      System.out.println(salary);
   }
}
