
// Alternating Series

public class AlternatingSeries {
    public static void main(String[] args) {
        int n = 5;
        double sum = 0.0;

        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0)
                sum -= 1.0 / i;
            else
                sum += 1.0 / i;
        }

        System.out.println("Sum: " + sum);
    }
}

// Output: Sum: 0.7833333333333332

/* Second Time
public class AlternatingSeries {
    public static void main(String[] args) {
        int n = 5;
        double sum = 0.0;

        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0)
                sum -= 1.0 / i;
            else
                sum += 1.0 / i;
        }

        System.out.println("Sum: " + sum);
    }
}
*/

/* Third Time
public class AlternatingSeries {
    public static void main(String[] args) {
        int n = 5;
        double sum = 0.0;

        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0)
                sum -= 1.0 / i;
            else
                sum += 1.0 / i;
        }

        System.out.println("Sum: " + sum);
    }
}
*/
