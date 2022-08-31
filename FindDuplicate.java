
public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 5, 5, 6 };
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {
        int len = nums.length;
        int[] cnt = new int[len + 1];
        for (int i = 0; i < len; i++) {
            cnt[nums[i]]++;
            if (cnt[nums[i]] > 1) {
                return nums[i];
            }
        }

        return len;
    }
}
