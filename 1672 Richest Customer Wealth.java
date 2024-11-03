public class Solution {

    public static void main(String[] args) {
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] arr) {
        int sum;
        int max= Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            sum =0;
            for (int col = 0; col < arr[row].length; col++) {
                sum = sum + arr[row][col];
            }
            if (sum>max) {
                max = sum;
            }
        }
        return max;
    }
}
