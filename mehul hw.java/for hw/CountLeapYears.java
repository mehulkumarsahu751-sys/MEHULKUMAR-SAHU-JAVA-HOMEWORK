// Count Leap Years

public class CountLeapYears {
    public static void main(String[] args) {
        int start = 2000, end = 2020;
        int count = 0;

        for(int y = start; y <= end; y++) {
            if((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
                count++;
            }
        }

        System.out.println("Leap Years: " + count);
    }
}

// Output: Leap Years: 6

/* Second Time
public class CountLeapYears {
    public static void main(String[] args) {
        int start = 2000, end = 2020;
        int count = 0;

        for(int y = start; y <= end; y++) {
            if((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
                count++;
            }
        }

        System.out.println("Leap Years: " + count);
    }
}
*/

/* Third Time
public class CountLeapYears {
    public static void main(String[] args) {
        int start = 2000, end = 2020;
        int count = 0;

        for(int y = start; y <= end; y++) {
            if((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
                count++;
            }
        }

        System.out.println("Leap Years: " + count);
    }
}
*/
