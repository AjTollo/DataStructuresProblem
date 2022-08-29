package Problems;

public class ReverseInteger {
    public static void main(String[] args) {

    }

    public int reverse(int x) {
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
