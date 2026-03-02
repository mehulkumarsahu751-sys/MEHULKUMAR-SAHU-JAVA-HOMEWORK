// Count Set Bits (1s)

public class CountSetBits {
    public static void main(String[] args) {
        int n = 23;
        int count = 0;

        for(; n > 0; n >>= 1) {
            if((n & 1) == 1) {
                count++;
            }
        }

        System.out.println("Set bits: " + count);
    }
}

// Output: Set bits: 4

/* Second Time
public class CountSetBits {
    public static void main(String[] args) {
        int n = 23;
        int count = 0;

        for(; n > 0; n >>= 1) {
            if((n & 1) == 1) {
                count++;
            }
        }

        System.out.println("Set bits: " + count);
    }
}
*/

/* Third Time
public class CountSetBits {
    public static void main(String[] args) {
        int n = 23;
        int count = 0;

        for(; n > 0; n >>= 1) {
            if((n & 1) == 1) {
                count++;
            }
        }

        System.out.println("Set bits: " + count);
    }
}
*/
