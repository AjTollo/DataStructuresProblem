public class FindSingleNumber {
    public static void main(String[] args) {
        int[] nums = { 1, 6, 5, 5, 6 };
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
            System.out.println(ans);
        }
        return ans;
    }
}
