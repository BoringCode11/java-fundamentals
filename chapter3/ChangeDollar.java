package chapter3;

import java.util.Scanner;

/*
* The objective of the game is to enter enough change to equal exactly R1
* Create a program that asks the user to enter quantities of the following coins,
* nickles, dimes, and quarters
* Your program should count up the value of all the change
* If it is exactly R1, they win
* if it is more or less tell the user the went over or below the R1,
* and tell them how much they over or under
* */
public class ChangeDollar {
   public static void main(String[] args) {
      System.out.println("Hello test");

      double dimes = 0.10;
      double nickles = 0.05;
      double quarters = 0.25;

      System.out.println("Enter number of dimes");
      Scanner scanner = new Scanner(System.in);
      dimes = dimes * scanner.nextInt();

      System.out.println("Enter number of nickels");
      nickles = nickles * scanner.nextInt();

      System.out.println("Enter number of quarters");
      quarters = quarters * scanner.nextInt();

      double total = dimes + nickles + quarters;

      if(total > 1) {
         System.out.println("more" + total);
      } else if (total < 1) {
         System.out.println("less " + total);
      } else {
         System.out.println("okay " + total);
      }

   }
}
