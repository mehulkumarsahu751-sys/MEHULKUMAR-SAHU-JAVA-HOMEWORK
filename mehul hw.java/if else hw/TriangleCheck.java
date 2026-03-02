// Program 16: Triangle Valid or Not
// Output: Enter sides: 3, 4, 5 => Valid Triangle

import java.util.Scanner;

public class TriangleCheck {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter side 1: ");
       int a = sc.nextInt();
       System.out.print("Enter side 2: ");
       int b = sc.nextInt();
       System.out.print("Enter side 3: ");
       int c = sc.nextInt();

       if(a + b > c && a + c > b && b + c > a)
           System.out.println("Valid Triangle");
       else
           System.out.println("Invalid Triangle");
   }
}

/*
// Second Time
import java.util.Scanner;

public class TriangleCheck2 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter side 1: ");
       int a = sc.nextInt();
       System.out.print("Enter side 2: ");
       int b = sc.nextInt();
       System.out.print("Enter side 3: ");
       int c = sc.nextInt();

       if(a + b > c && a + c > b && b + c > a)
           System.out.println("Valid Triangle");
       else
           System.out.println("Invalid Triangle");
   }
}
*/

/*
// Third Time
import java.util.Scanner;

public class TriangleCheck3 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter side 1: ");
       int a = sc.nextInt();
       System.out.print("Enter side 2: ");
       int b = sc.nextInt();
       System.out.print("Enter side 3: ");
       int c = sc.nextInt();

       if(a + b > c && a + c > b && b + c > a)
           System.out.println("Valid Triangle");
       else
           System.out.println("Invalid Triangle");
   }
}
*/
