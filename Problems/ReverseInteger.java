package Problems;

import java.util.Scanner;

public class ReverseInteger {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int x = scan.nextInt();
        int reverseInt = reverse(x);

        System.out.println("Reversed Value: " + reverseInt);

        // main(args);
    }

    public static int reverse(int x) {
        int res = 0;

        while (x != 0) {
            int temp = x % 10;
            int prev = res;
            res = res * 10 + temp;
            if ((res - temp) / 10 != prev)
                return 0;
            x /= 10;
        }

        return x < 0 ? -1 * res : res;
    }
}
