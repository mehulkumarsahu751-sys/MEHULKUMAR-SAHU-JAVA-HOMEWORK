// Tribonacci Series

public class TribonacciSeries {
    public static void main(String[] args) {
        int n = 8;
        int a = 0, b = 1, c = 1;

        System.out.print(a + " " + b + " " + c + " ");

        for(int i = 4; i <= n; i++) {
            int next = a + b + c;
            System.out.print(next + " ");
            a = b;
            b = c;
            c = next;
        }
    }
}

// Output: 0 1 1 2 4 7 13 24

/* Second Time
public class TribonacciSeries {
    public static void main(String[] args) {
        int n = 8;
        int a = 0, b = 1, c = 1;

        System.out.print(a + " " + b + " " + c + " ");

        for(int i = 4; i <= n; i++) {
            int next = a + b + c;
            System.out.print(next + " ");
            a = b;
            b = c;
            c = next;
        }
    }
}
*/

/* Third Time
public class TribonacciSeries {
    public static void main(String[] args) {
        int n = 8;
        int a = 0, b = 1, c = 1;

        System.out.print(a + " " + b + " " + c + " ");

        for(int i = 4; i <= n; i++) {
            int next = a + b + c;
            System.out.print(next + " ");
            a = b;
            b = c;
            c = next;
        }
    }
}
*/
