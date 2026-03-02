
// Binary → Decimal

public class BinaryToDecimal {
    public static void main(String[] args) {
        long binary = 1010;
        int decimal = 0;
        int base = 1;

        for(; binary > 0; binary /= 10) {
            int lastDigit = (int)(binary % 10);
            decimal += lastDigit * base;
            base *= 2;
        }

        System.out.println("Decimal: " + decimal);
    }
}

// Output: Decimal: 10

/* Second Time
public class BinaryToDecimal {
    public static void main(String[] args) {
        long binary = 1010;
        int decimal = 0;
        int base = 1;

        for(; binary > 0; binary /= 10) {
            int lastDigit = (int)(binary % 10);
            decimal += lastDigit * base;
            base *= 2;
        }

        System.out.println("Decimal: " + decimal);
    }
}
*/

/* Third Time
public class BinaryToDecimal {
    public static void main(String[] args) {
        long binary = 1010;
        int decimal = 0;
        int base = 1;

        for(; binary > 0; binary /= 10) {
            int lastDigit = (int)(binary % 10);
            decimal += lastDigit * base;
            base *= 2;
        }

        System.out.println("Decimal: " + decimal);
    }
}
*/
