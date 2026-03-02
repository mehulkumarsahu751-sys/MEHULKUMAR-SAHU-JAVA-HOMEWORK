// Infinite Loop with Break

import java.util.Scanner;

public class InfiniteLoopBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        for(;;) {
            System.out.print("Enter 0 to stop, any other number to continue: ");
            n = sc.nextInt();

            if(n == 0) {
                break;
            }
        }

        System.out.println("Loop Terminated.");
    }
}

// Sample Output: Enter 0 to stop, any other number to continue: 5
// Enter 0 to stop, any other number to continue: 7
// Enter 0 to stop, any other number to continue: 0
// Loop Terminated.

/* Second Time
import java.util.Scanner;

public class InfiniteLoopBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        for(;;) {
            System.out.print("Enter 0 to stop, any other number to continue: ");
            n = sc.nextInt();

            if(n == 0) {
                break;
            }
        }

        System.out.println("Loop Terminated.");
    }
}
*/

/* Third Time
import java.util.Scanner;

public class InfiniteLoopBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        for(;;) {
            System.out.print("Enter 0 to stop, any other number to continue: ");
            n = sc.nextInt();

            if(n == 0) {
                break;
            }
        }

        System.out.println("Loop Terminated.");
    }
}
*/
