package Problems;

public class MissingNumber {
    public static void main(String[] args) {

    }

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;

        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }
}
