package Problems;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] x = { 0, -1, -3, 4, 5, 2, -2 };
        int res = firstMissingPositive(x);
        System.out.println(res);
    }

    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] > 0 && nums[i] <= nums.length) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return j + 1;
            }
        }
        return nums.length + 1;
    }

    static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }

    public int otherFirstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int j = 1;
        // Starting with variable j = 1, then checking if it exists in nums.
        // If it doesn't then that is the answer.
        // If it does, increment j by 1 each time.
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != j)
                j = j;
            else
                j = j + 1;
        }
        return j;

    }
}
