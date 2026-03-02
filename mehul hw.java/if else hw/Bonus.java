// Program 18: Salary Bonus
// Output: Enter salary: 50000, years: 6 => Total Salary with Bonus: 55000.0

import java.util.Scanner;

public class Bonus {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter salary: ");
       double salary = sc.nextDouble();
       System.out.print("Enter years of service: ");
       int years = sc.nextInt();

       if(years > 5)
           System.out.println("Total Salary with Bonus: " + (salary + salary * 0.1));
       else
           System.out.println("No Bonus");
   }
}

/*
// Second Time
import java.util.Scanner;

public class Bonus2 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter salary: ");
       double salary = sc.nextDouble();
       System.out.print("Enter years of service: ");
       int years = sc.nextInt();

       if(years > 5)
           System.out.println("Total Salary with Bonus: " + (salary + salary * 0.1));
       else
           System.out.println("No Bonus");
   }
}
*/

/*
// Third Time
import java.util.Scanner;

public class Bonus3 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter salary: ");
       double salary = sc.nextDouble();
       System.out.print("Enter years of service: ");
       int years = sc.nextInt();

       if(years > 5)
           System.out.println("Total Salary with Bonus: " + (salary + salary * 0.1));
       else
           System.out.println("No Bonus");
   }
}
*/
