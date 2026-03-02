// Integer Square Root (Floor)

public class IntegerSquareRoot {
    public static void main(String[] args) {
        int n = 50;
        int root = 1;

        for(int i = 1; i * i <= n; i++) {
            root = i;
        }

        System.out.println("Sqrt (floor): " + root);
    }
}

// Output: Sqrt (floor): 7

/* Second Time
public class IntegerSquareRoot {
    public static void main(String[] args) {
        int n = 50;
        int root = 1;

        for(int i = 1; i * i <= n; i++) {
            root = i;
        }

        System.out.println("Sqrt (floor): " + root);
    }
}
*/

/* Third Time
public class IntegerSquareRoot {
    public static void main(String[] args) {
        int n = 50;
        int root = 1;

        for(int i = 1; i * i <= n; i++) {
            root = i;
        }

        System.out.println("Sqrt (floor): " + root);
    }
}
*/
