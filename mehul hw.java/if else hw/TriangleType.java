// Program 23: Triangle Type
// Output: Enter sides: 5, 5, 3 => Isosceles

import java.util.Scanner;

public class TriangleType {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter side 1: ");
       int a = sc.nextInt();
       System.out.print("Enter side 2: ");
       int b = sc.nextInt();
       System.out.print("Enter side 3: ");
       int c = sc.nextInt();

       if(a == b && b == c)
           System.out.println("Equilateral");
       else if(a == b || b == c || a == c)
           System.out.println("Isosceles");
       else
           System.out.println("Scalene");
   }
}

/*
// Second Time
import java.util.Scanner;

public class TriangleType2 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter side 1: ");
       int a = sc.nextInt();
       System.out.print("Enter side 2: ");
       int b = sc.nextInt();
       System.out.print("Enter side 3: ");
       int c = sc.nextInt();

       if(a == b && b == c)
           System.out.println("Equilateral");
       else if(a == b || b == c || a == c)
           System.out.println("Isosceles");
       else
           System.out.println("Scalene");
   }
}
*/

/*
// Third Time
import java.util.Scanner;

public class TriangleType3 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter side 1: ");
       int a = sc.nextInt();
       System.out.print("Enter side 2: ");
       int b = sc.nextInt();
       System.out.print("Enter side 3: ");
       int c = sc.nextInt();

       if(a == b && b == c)
           System.out.println("Equilateral");
       else if(a == b || b == c || a == c)
           System.out.println("Isosceles");
       else
           System.out.println("Scalene");
   }
}
*/
