// Simulate Division without '/'

public class SimulateDivision {
    public static void main(String[] args) {
        int dividend = 20, divisor = 3;
        int quotient = 0;

        for(; dividend >= divisor; ) {
            dividend -= divisor;
            quotient++;
        }

        System.out.println("Quotient: " + quotient);
    }
}

// Output: Quotient: 6

/* Second Time
public class SimulateDivision {
    public static void main(String[] args) {
        int dividend = 20, divisor = 3;
        int quotient = 0;

        for(; dividend >= divisor; ) {
            dividend -= divisor;
            quotient++;
        }

        System.out.println("Quotient: " + quotient);
    }
}
*/

/* Third Time
public class SimulateDivision {
    public static void main(String[] args) {
        int dividend = 20, divisor = 3;
        int quotient = 0;

        for(; dividend >= divisor; ) {
            dividend -= divisor;
            quotient++;
        }

        System.out.println("Quotient: " + quotient);
    }
}
*/
