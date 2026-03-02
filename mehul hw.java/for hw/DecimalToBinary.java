// Decimal → Binary

public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 10;

        for(int i = 31; i >= 0; i--) {
            int k = n >> i;
            if((k & 1) == 1)
                System.out.print("1");
            else
                System.out.print("0");
        }
    }
}

// Output: 00000000000000000000000000001010

/* Second Time
public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 10;

        for(int i = 31; i >= 0; i--) {
            int k = n >> i;
            if((k & 1) == 1)
                System.out.print("1");
            else
                System.out.print("0");
        }
    }
}
*/

/* Third Time
public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 10;

        for(int i = 31; i >= 0; i--) {
            int k = n >> i;
            if((k & 1) == 1)
                System.out.print("1");
            else
                System.out.print("0");
        }
    }
}
*/
