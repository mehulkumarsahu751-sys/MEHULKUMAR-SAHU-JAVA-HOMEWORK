// LCM of Two Numbers

public class LCM {
    public static void main(String[] args) {
        int n1 = 4, n2 = 6;
        int max = Math.max(n1, n2);

        for(;; max++) {
            if(max % n1 == 0 && max % n2 == 0) {
                System.out.println("LCM: " + max);
                break;
            }
        }
    }
}

// Output: LCM: 12

/* Second Time
public class LCM {
    public static void main(String[] args) {
        int n1 = 4, n2 = 6;
        int max = Math.max(n1, n2);

        for(;; max++) {
            if(max % n1 == 0 && max % n2 == 0) {
                System.out.println("LCM: " + max);
                break;
            }
        }
    }
}
*/

/* Third Time
public class LCM {
    public static void main(String[] args) {
        int n1 = 4, n2 = 6;
        int max = Math.max(n1, n2);

        for(;; max++) {
            if(max % n1 == 0 && max % n2 == 0) {
                System.out.println("LCM: " + max);
                break;
            }
        }
    }
}
*/
