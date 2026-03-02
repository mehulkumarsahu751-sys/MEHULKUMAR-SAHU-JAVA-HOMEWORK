// Program 30: Quadratic Equation Nature Checker
// Output: Enter a: 1, b: -3, c: 2 => Two Real and Distinct Roots

import java.util.Scanner;

public class QuadraticNature {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter coefficient a: ");
       double a = sc.nextDouble();
       System.out.print("Enter coefficient b: ");
       double b = sc.nextDouble();
       System.out.print("Enter coefficient c: ");
       double c = sc.nextDouble();

       double d = b*b - 4*a*c;

       if(d > 0)
           System.out.println("Two Real and Distinct Roots");
       else if(d == 0)
           System.out.println("Two Real and Equal Roots");
       else
           System.out.println("Complex Roots");
   }
}

/*
// Second Time
import java.util.Scanner;

public class QuadraticNature2 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter coefficient a: ");
       double a = sc.nextDouble();
       System.out.print("Enter coefficient b: ");
       double b = sc.nextDouble();
       System.out.print("Enter coefficient c: ");
       double c = sc.nextDouble();

       double d = b*b - 4*a*c;

       if(d > 0)
           System.out.println("Two Real and Distinct Roots");
       else if(d == 0)
           System.out.println("Two Real and Equal Roots");
       else
           System.out.println("Complex Roots");
   }
}
*/

/*
// Third Time
import java.util.Scanner;

public class QuadraticNature3 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter coefficient a: ");
       double a = sc.nextDouble();
       System.out.print("Enter coefficient b: ");
       double b = sc.nextDouble();
       System.out.print("Enter coefficient c: ");
       double c = sc.nextDouble();

       double d = b*b - 4*a*c;

       if(d > 0)
           System.out.println("Two Real and Distinct Roots");
       else if(d == 0)
           System.out.println("Two Real and Equal Roots");
       else
           System.out.println("Complex Roots");
   }
}
*/
