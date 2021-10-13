import java.util.*;

public class evenoddseries {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        long n = s.nextLong();
        int even = 0, odd = 0;

        while (n != 0) {
            if (n % 2 == 0) {
                System.out.print(even + " ");
                even += 2;
            } else {
                System.out.print(odd + " ");
                odd++;
            }
            n--;
        }

    }

}
