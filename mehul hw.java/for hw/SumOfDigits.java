// Sum of Digits

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1234;
        int sum = 0;

        for(; n != 0; n /= 10) {
            sum += n % 10;
        }

        System.out.println("Sum: " + sum);
    }
}

// Output: Sum: 10

/* Second Time
public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1234;
        int sum = 0;

        for(; n != 0; n /= 10) {
            sum += n % 10;
        }

        System.out.println("Sum: " + sum);
    }
}
*/

/* Third Time
public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1234;
        int sum = 0;

        for(; n != 0; n /= 10) {
            sum += n % 10;
        }

        System.out.println("Sum: " + sum);
    }
}
*/
