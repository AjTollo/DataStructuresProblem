package Problems;

public class TwoSumII {

    public static void main(String[] args) {

        int[] a = { 1, 2, 3, 4, 5, 6, 7 };
        int[] r = twoSum(a, 8);

        System.out.println(r);

    }

    static public int[] twoSum(int[] numbers, int target) {

        // define points

        int L = 0, n = numbers.length, R = n - 1;
        // twopointer find the sum
        while (L < R) {
            int sum = numbers[L] + numbers[R];
            if (sum == target) {
                return new int[] { L + 1, R + 1 };
            } else if (sum < target) {
                L++;
            } else {
                R--;
            }
        }
        return new int[] { -1, -1 };
    }

}
