// Program 20: Divisible by 3 and 7
// Output: Enter number: 21 => Divisible by both 3 and 7

import java.util.Scanner;

public class DivisibleCheck {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter number: ");
       int n = sc.nextInt();

       if(n % 3 == 0 && n % 7 == 0)
           System.out.println("Divisible by both 3 and 7");
       else
           System.out.println("Not divisible by both");
   }
}

/*
// Second Time
import java.util.Scanner;

public class DivisibleCheck2 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter number: ");
       int n = sc.nextInt();

       if(n % 3 == 0 && n % 7 == 0)
           System.out.println("Divisible by both 3 and 7");
       else
           System.out.println("Not divisible by both");
   }
}
*/

/*
// Third Time
import java.util.Scanner;

public class DivisibleCheck3 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter number: ");
       int n = sc.nextInt();

       if(n % 3 == 0 && n % 7 == 0)
           System.out.println("Divisible by both 3 and 7");
       else
           System.out.println("Not divisible by both");
   }
}
*/
