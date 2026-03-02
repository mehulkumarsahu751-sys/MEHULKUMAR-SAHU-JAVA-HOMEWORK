// Sum of Factorials (1! + 2! + ...)

public class SumOfFactorials {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            fact *= i;
            sum += fact;
        }

        System.out.println("Sum: " + sum);
    }
}

// Output: Sum: 153

/* Second Time
public class SumOfFactorials {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            fact *= i;
            sum += fact;
        }

        System.out.println("Sum: " + sum);
    }
}
*/

/* Third Time
public class SumOfFactorials {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            fact *= i;
            sum += fact;
        }

        System.out.println("Sum: " + sum);
    }
}
*/
