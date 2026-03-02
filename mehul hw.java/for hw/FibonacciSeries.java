// Fibonacci Series

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        int t1 = 0, t2 = 1;

        System.out.print(t1 + " " + t2 + " ");

        for(int i = 3; i <= n; i++) {
            int next = t1 + t2;
            System.out.print(next + " ");
            t1 = t2;
            t2 = next;
        }
    }
}

// Output: 0 1 1 2 3 5 8 13 21 34

/* Second Time
public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        int t1 = 0, t2 = 1;

        System.out.print(t1 + " " + t2 + " ");

        for(int i = 3; i <= n; i++) {
            int next = t1 + t2;
            System.out.print(next + " ");
            t1 = t2;
            t2 = next;
        }
    }
}
*/

/* Third Time
public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        int t1 = 0, t2 = 1;

        System.out.print(t1 + " " + t2 + " ");

        for(int i = 3; i <= n; i++) {
            int next = t1 + t2;
            System.out.print(next + " ");
            t1 = t2;
            t2 = next;
        }
    }
}
*/
