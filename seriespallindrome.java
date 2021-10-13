import java.util.*;

public class seriespallindrome {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt(), n2 = s.nextInt();

        for (int i = n1; i <= n2; i++) {
            if (isPallindrome(i)) {
                System.out.print(i + " ");
            }
        }

    }

    private static boolean isPallindrome(int n) {

        int res = 0;
        int temp = n;
        int rem = 0;

        while (temp != 0) {
            rem = temp % 10;
            res = (res * 10) + rem;
            temp /= 10;
        }

        if (res == n) {
            return true;
        }
        return false;

    }

}
