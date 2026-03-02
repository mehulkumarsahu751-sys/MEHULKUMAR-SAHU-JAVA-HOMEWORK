// Program 22: Driving License Eligibility
// Output: Enter age: 20 => Can Apply for License

import java.util.Scanner;

public class License {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter age: ");
       int age = sc.nextInt();

       if(age >= 18)
           System.out.println("Can Apply for License");
       else
           System.out.println("Not Eligible");
   }
}

/*
// Second Time
import java.util.Scanner;

public class License2 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter age: ");
       int age = sc.nextInt();

       if(age >= 18)
           System.out.println("Can Apply for License");
       else
           System.out.println("Not Eligible");
   }
}
*/

/*
// Third Time
import java.util.Scanner;

public class License3 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter age: ");
       int age = sc.nextInt();

       if(age >= 18)
           System.out.println("Can Apply for License");
       else
           System.out.println("Not Eligible");
   }
}
*/
