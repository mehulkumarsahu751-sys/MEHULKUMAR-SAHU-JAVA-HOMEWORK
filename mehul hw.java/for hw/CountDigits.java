// Count Digits

public class CountDigits {
    public static void main(String[] args) {
        int n = 5829;
        int count = 0;

        for(; n != 0; n /= 10) {
            count++;
        }

        System.out.println("Digits: " + count);
    }
}

// Output: Digits: 4

/* Second Time
public class CountDigits {
    public static void main(String[] args) {
        int n = 5829;
        int count = 0;

        for(; n != 0; n /= 10) {
            count++;
        }

        System.out.println("Digits: " + count);
    }
}
*/

/* Third Time
public class CountDigits {
    public static void main(String[] args) {
        int n = 5829;
        int count = 0;

        for(; n != 0; n /= 10) {
            count++;
        }

        System.out.println("Digits: " + count);
    }
}
*/
