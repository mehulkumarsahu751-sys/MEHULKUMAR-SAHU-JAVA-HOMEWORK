// Sum of AP (without formula)

public class SumAP {
    public static void main(String[] args) {
        int a = 1, d = 3, n = 5;
        int sum = 0;
        int current = a;

        for(int i = 1; i <= n; i++) {
            sum += current;
            current += d;
        }

        System.out.println("Sum: " + sum);
    }
}

// Output: Sum: 35

/* Second Time
public class SumAP {
    public static void main(String[] args) {
        int a = 1, d = 3, n = 5;
        int sum = 0;
        int current = a;

        for(int i = 1; i <= n; i++) {
            sum += current;
            current += d;
        }

        System.out.println("Sum: " + sum);
    }
}
*/

/* Third Time
public class SumAP {
    public static void main(String[] args) {
        int a = 1, d = 3, n = 5;
        int sum = 0;
        int current = a;

        for(int i = 1; i <= n; i++) {
            sum += current;
            current += d;
        }

        System.out.println("Sum: " + sum);
    }
}
*/
