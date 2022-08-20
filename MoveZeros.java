public class MoveZeros {
    public static void main(String[] args) {

    }

    static void moveZeros(int[] nums) {

        int n = nums.length;

        if (n < 2)
            return;

        int L = 0, R = 0;

        while (R < n) {
            if (nums[L] != 0) {
                L++;
                R++;
            } else if (nums[R] == 0) {
                R++;
            } else {
                int temp = nums[R];
                nums[R] = nums[L];
                nums[L] = temp;
            }
        }
    }
}
