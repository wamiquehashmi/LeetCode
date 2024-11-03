public class Solution {

    // added main to run locally
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] arr) {
        if(arr.length==0) {
            return -1;
        }
        int count=0;
        for(int i=0; i<arr.length; i++) {
            if(isEvenDigit1(arr[i])) {
                count++;
            }
        }
        return count;
    }

    // using log function to reduce time complexity
    static boolean isEvenDigit1(int num) {
        return (int)(Math.log10(num)+1) % 2 == 0;
    }

    // by using loop
    static boolean isEvenDigit2(int x) {
        int n = 0;
        while(x>0) {
            n++;
            x= x/10;
        }
        return n%2==0;
    }
}
