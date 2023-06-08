package chapter3;

import java.util.Scanner;

/*
To qualify for a loan, a person must make at least 30,000
and have been working at their curr job for at least 2 yrs
* */
public class LoanQualifier {
   public static void main(String[] args) {
      int minSalary = 30000;
      int yrsCurrJob = 2;

      System.out.println("Enter your salary");
      Scanner scanner = new Scanner(System.in);
      double salary = scanner.nextDouble();

      System.out.println("Enter years at workplace");
      double years = scanner.nextInt();

      if(salary >= minSalary) {
         if (years >= yrsCurrJob) {
            System.out.println("You qualify for the loan");
         } else {
            System.out.println("You need to be working at your current job for at least 2 years");
         }
      } else {
         System.out.println("You don't qualify for the loan");
      }
   }
}
