public class FlowControl {
    public static void main(String[] args) {

        // IF then Else
        int age = 34;
        if (age <= 20) {
            System.out.println("Less than or equal 20");
        } else if (age <= 50) {
            System.out.println("less then or equal 50");
        } else {
            System.out.println("Greater then 50");
        }

        // Ternary Operator
        String message = age >= 20 ? "Age greater than 20" : "Age less than 20";
        System.out.println(message);

        // Switch Case
        int choice = 50;
        switch(choice) {
            case 10 :
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            case 40: case 50: case 60:
                System.out.println("Either 40, 50 or 60");
                break;
            default:
                System.out.println("Default");
        }

        // For loop
        String s = "MADAM";
        boolean isPalindrom = true;
        for (int i=0,j=s.length()-1;i<=j;i++,j--) {
            if (s.charAt(i) != s.charAt(j)) {
                isPalindrom = false;
            }
        }
        if (isPalindrom) System.out.println("Yes");
        else System.out.println("No");

        // Digit Palindrome
        System.out.println(isDigitPalindrome(1001));
        System.out.println(isDigitPalindrome(-1001));
        System.out.println(isDigitPalindrome(11));
        System.out.println(isDigitPalindrome(1));
        System.out.println(isDigitPalindrome(10012));
        System.out.println(isDigitPalindrome(100101));

        /** Finding sum of first 5 number between 1-1000 which are
         divisible by both 3 and 5 (Time Complexity O(n/(3*5)) = o(n)*/
        int sum = 0;
        int count = 0;
        for (int i=15;i<=1000;i+=15) {
            if ((i%3 == 0) && (i%5 == 0)) {
                sum+=i;
                count++;
                if (count == 5) break;
            }
        }
        System.out.println(sum);
        System.out.println(sumOdd(1,200));

        // While Loop
        int start = 1;
        int end = 1000;
        sum = 0;
        while(start <= end) {
            if (start%3 == 0 && start%5 == 0) {
                sum+=start;
            }
            start+=1;
        }
        System.out.println(sum);

        // DO-While Loop
        start = 1;
        end = 1000;
        sum = 0;
        do {
            if (start%3 == 0 && start%5 == 0) {
                sum += start;
            }
            start += 1;
        } while(start <= 1000);
        System.out.println(sum);
    }
    public static boolean isOdd(int value) {
        if (value <= 0) return false;
        return value%2 != 0;
    }
    public static int sumOdd(int start, int end) {
        if (start > end || start <= 0 || end <= 0) return -1;
        int sum = 0;
        for (int i=start;i<=end;i++) {
            if (isOdd(i)) {
                sum+=i;
            }
        }
        return sum;
    }
    public static boolean isDigitPalindrome(int digit) {
        if (digit < 0) digit *= -1;
        String s = digit + "";
        for (int i=0, j=s.length()-1;i<=j;i++,j--) {
            if (s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
    }
}
