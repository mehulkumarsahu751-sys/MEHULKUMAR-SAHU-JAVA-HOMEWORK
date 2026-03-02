// Largest Digit

public class LargestDigit {
    public static void main(String[] args) {
        int n = 48291;
        int max = 0;

        for(; n != 0; n /= 10) {
            int d = n % 10;
            if(d > max) {
                max = d;
            }
        }

        System.out.println("Max Digit: " + max);
    }
}

// Output: Max Digit: 9

/* Second Time
public class LargestDigit {
    public static void main(String[] args) {
        int n = 48291;
        int max = 0;

        for(; n != 0; n /= 10) {
            int d = n % 10;
            if(d > max) {
                max = d;
            }
        }

        System.out.println("Max Digit: " + max);
    }
}
*/

/* Third Time
public class LargestDigit {
    public static void main(String[] args) {
        int n = 48291;
        int max = 0;

        for(; n != 0; n /= 10) {
            int d = n % 10;
            if(d > max) {
                max = d;
            }
        }

        System.out.println("Max Digit: " + max);
    }
}
*/
