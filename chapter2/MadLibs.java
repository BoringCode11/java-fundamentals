package chapter2;
import  java.util.Scanner;

public class MadLibs {
   public static void main(String[] args) {
      // ask user for season of the year
      System.out.println("Enter a season of the year");
      Scanner scanner = new Scanner(System.in);
      String season = scanner.next();

      // whole number
      System.out.println("Enter a whole number");
      int number = scanner.nextInt();
      System.out.println(number);

      // and an adjective
      System.out.println("Enter an adjective");
      String adj = scanner.next();

      // use the input to complete the mad-lib
      String madlib = "On a " + adj + " " + season + " day, I drink a minimum of " + number + " cups of coffee";
      System.out.println(madlib);
   }
}
