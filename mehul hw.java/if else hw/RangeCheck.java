// Program 25: Number in Range (1-100)
// Output: Enter number: 45 => Within Range

import java.util.Scanner;

public class RangeCheck {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter number: ");
       int n = sc.nextInt();

       if(n >= 1 && n <= 100)
           System.out.println("Within Range");
       else
           System.out.println("Out of Range");
   }
}

/*
// Second Time
import java.util.Scanner;

public class RangeCheck2 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter number: ");
       int n = sc.nextInt();

       if(n >= 1 && n <= 100)
           System.out.println("Within Range");
       else
           System.out.println("Out of Range");
   }
}
*/

/*
// Third Time
import java.util.Scanner;

public class RangeCheck3 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter number: ");
       int n = sc.nextInt();

       if(n >= 1 && n <= 100)
           System.out.println("Within Range");
       else
           System.out.println("Out of Range");
   }
}
*/
