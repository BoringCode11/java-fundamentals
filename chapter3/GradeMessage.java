package chapter3;

import java.util.Scanner;

public class GradeMessage {
   public static void main(String[] args) {
      System.out.println("Enter your letter grade");
      Scanner scanner = new Scanner(System.in);
      String grade = scanner.next();

      // enhanced switch statement
      String message = switch (grade) {
         case "A" -> "Excellent job!";
         case "B" -> "Great job!";
         case "C" -> "Good job!";
         case "D" -> "You need to work harder!";
         case "F" -> "Uh oh!";
         default -> "enter correct grade";
      };

      System.out.println(message);
   }
}
