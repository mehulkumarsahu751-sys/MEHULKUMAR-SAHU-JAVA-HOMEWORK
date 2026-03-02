// Program 21: Time Greeting
// Output: Enter hour: 15 => Good Afternoon

import java.util.Scanner;

public class Greeting {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter hour (0-23): ");
       int hour = sc.nextInt();

       if(hour < 12)
           System.out.println("Good Morning");
       else if(hour < 18)
           System.out.println("Good Afternoon");
       else
           System.out.println("Good Evening");
   }
}

/*
// Second Time
import java.util.Scanner;

public class Greeting2 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter hour (0-23): ");
       int hour = sc.nextInt();

       if(hour < 12)
           System.out.println("Good Morning");
       else if(hour < 18)
           System.out.println("Good Afternoon");
       else
           System.out.println("Good Evening");
   }
}
*/

/*
// Third Time
import java.util.Scanner;

public class Greeting3 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter hour (0-23): ");
       int hour = sc.nextInt();

       if(hour < 12)
           System.out.println("Good Morning");
       else if(hour < 18)
           System.out.println("Good Afternoon");
       else
           System.out.println("Good Evening");
   }
}
*/
