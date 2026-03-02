
// Approximate e (Euler's constant)

public class ApproximateE {
    public static void main(String[] args) {
        int n = 10;
        double e = 1.0;
        double fact = 1.0;

        for(int i = 1; i <= n; i++) {
            fact *= i;
            e += 1.0 / fact;
        }

        System.out.println("e: " + e);
    }
}

// Output: e: 2.7182818011463845

/* Second Time
public class ApproximateE {
    public static void main(String[] args) {
        int n = 10;
        double e = 1.0;
        double fact = 1.0;

        for(int i = 1; i <= n; i++) {
            fact *= i;
            e += 1.0 / fact;
        }

        System.out.println("e: " + e);
    }
}
*/

/* Third Time
public class ApproximateE {
    public static void main(String[] args) {
        int n = 10;
        double e = 1.0;
        double fact = 1.0;

        for(int i = 1; i <= n; i++) {
            fact *= i;
            e += 1.0 / fact;
        }

        System.out.println("e: " + e);
    }
}
*/
