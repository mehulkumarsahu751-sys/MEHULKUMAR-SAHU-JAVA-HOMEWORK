// Reverse a Number

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 9876;
        int rev = 0;

        for(; n != 0; n /= 10) {
            rev = rev * 10 + n % 10;
        }

        System.out.println("Reversed: " + rev);
    }
}

// Output: Reversed: 6789

/* Second Time
public class ReverseNumber {
    public static void main(String[] args) {
        int n = 9876;
        int rev = 0;

        for(; n != 0; n /= 10) {
            rev = rev * 10 + n % 10;
        }

        System.out.println("Reversed: " + rev);
    }
}
*/

/* Third Time
public class ReverseNumber {
    public static void main(String[] args) {
        int n = 9876;
        int rev = 0;

        for(; n != 0; n /= 10) {
            rev = rev * 10 + n % 10;
        }

        System.out.println("Reversed: " + rev);
    }
}
*/
