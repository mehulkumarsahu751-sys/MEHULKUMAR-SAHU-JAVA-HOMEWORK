// Series: 9 + 99 + 999 + ...

public class Series999 {
    public static void main(String[] args) {
        int n = 5;
        long term = 9;
        long sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += term;
            term = term * 10 + 9;
        }

        System.out.println("Sum: " + sum);
    }
}

// Output: Sum: 111105

/* Second Time
public class Series999 {
    public static void main(String[] args) {
        int n = 5;
        long term = 9;
        long sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += term;
            term = term * 10 + 9;
        }

        System.out.println("Sum: " + sum);
    }
}
*/

/* Third Time
public class Series999 {
    public static void main(String[] args) {
        int n = 5;
        long term = 9;
        long sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += term;
            term = term * 10 + 9;
        }

        System.out.println("Sum: " + sum);
    }
}
*/
