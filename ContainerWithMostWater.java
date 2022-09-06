public class ContainerWithMostWater {
    public static void main(String[] args) {

        int[] x = { 1, 8, 6, 2, 5, 4, 8, 3, 7 }; // length of 8
        int res = MaxArea(x);
        System.out.println(res);
    }

    public static int MaxArea(int[] height) {

        int i = 0, j = height.length - 1, max = 0;

        while (i < j) {
            int area = Math.min(height[i], height[j]) * (j - i); // Basically area = height * width
            max = Math.max(max, area);

            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }
        return max;

        // Solution 2 without Math.funtions

        // int i = 0;
        // int j = height.Length-1;
        // int maxAmt = 0;
        // int iH;
        // int jH;
        // int cal;

        // while(j>i)
        // {
        // iH = height[i];
        // jH = height[j];

        // //Convergence back and forth
        // //which is higher，than will convergence from the other side
        // if(iH>jH)
        // {
        // cal = jH*(j-i);
        // j--;
        // }
        // else
        // {
        // cal = iH*(j-i);
        // i++;
        // }

        // if(cal>maxAmt)
        // maxAmt = cal;

        // }
        // return maxAmt;
    }
}
