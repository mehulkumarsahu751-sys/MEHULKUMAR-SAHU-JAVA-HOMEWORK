// Program 27: Bank Loan Eligibility Checker
// Output: Enter age: 28, income: 40000, score: 750 => Loan Approved

import java.util.Scanner;

public class LoanEligibility {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter age: ");
       int age = sc.nextInt();
       System.out.print("Enter monthly income: ");
       double income = sc.nextDouble();
       System.out.print("Enter credit score: ");
       int score = sc.nextInt();

       if(age >= 21 && age <= 60 && income >= 25000 && score >= 700)
           System.out.println("Loan Approved");
       else
           System.out.println("Loan Rejected");
   }
}

/*
// Second Time
import java.util.Scanner;

public class LoanEligibility2 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter age: ");
       int age = sc.nextInt();
       System.out.print("Enter monthly income: ");
       double income = sc.nextDouble();
       System.out.print("Enter credit score: ");
       int score = sc.nextInt();

       if(age >= 21 && age <= 60 && income >= 25000 && score >= 700)
           System.out.println("Loan Approved");
       else
           System.out.println("Loan Rejected");
   }
}
*/

/*
// Third Time
import java.util.Scanner;

public class LoanEligibility3 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter age: ");
       int age = sc.nextInt();
       System.out.print("Enter monthly income: ");
       double income = sc.nextDouble();
       System.out.print("Enter credit score: ");
       int score = sc.nextInt();

       if(age >= 21 && age <= 60 && income >= 25000 && score >= 700)
           System.out.println("Loan Approved");
       else
           System.out.println("Loan Rejected");
   }
}
*/
