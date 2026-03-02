// Program 28: Scholarship Eligibility
// Output: Enter percentage: 88, income: 250000 => Full Scholarship

import java.util.Scanner;

public class Scholarship {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter percentage: ");
       double per = sc.nextDouble();
       System.out.print("Enter family income: ");
       double income = sc.nextDouble();

       if(per >= 85 && income < 300000)
           System.out.println("Full Scholarship");
       else if(per >= 70 && income < 500000)
           System.out.println("Partial Scholarship");
       else
           System.out.println("Not Eligible");
   }
}

/*
// Second Time
import java.util.Scanner;

public class Scholarship2 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter percentage: ");
       double per = sc.nextDouble();
       System.out.print("Enter family income: ");
       double income = sc.nextDouble();

       if(per >= 85 && income < 300000)
           System.out.println("Full Scholarship");
       else if(per >= 70 && income < 500000)
           System.out.println("Partial Scholarship");
       else
           System.out.println("Not Eligible");
   }
}
*/

/*
// Third Time
import java.util.Scanner;

public class Scholarship3 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter percentage: ");
       double per = sc.nextDouble();
       System.out.print("Enter family income: ");
       double income = sc.nextDouble();

       if(per >= 85 && income < 300000)
           System.out.println("Full Scholarship");
       else if(per >= 70 && income < 500000)
           System.out.println("Partial Scholarship");
       else
           System.out.println("Not Eligible");
   }
}
*/
