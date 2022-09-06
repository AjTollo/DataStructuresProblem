public class PlusOne {
    public static void main(String[] args) {
        int[] x = { 1, 2, 9, 3, 11 };
        int[] res = plusOne(x);
        System.out.println("\n\n\n");
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int res[] = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
}
