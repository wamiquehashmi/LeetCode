// Asked in facebook

public class Solution {

    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 7;
        System.out.println(Arrays.toString(firstAndLastPosition(arr, target)));
    }

    // Will return the greaterThan or equal to the target value index
    static int[] firstAndLastPosition(int[] arr, int target) {
        int[] ans = {-1, -1};
        // check for the first occurrence of target first
        int start = searchTarget(arr, target, true);
        int end = searchTarget(arr, target, false);
        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    // this function just returns the index value of target
    static int searchTarget(int[] arr, int target, boolean findFirstIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length -1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (target<arr[mid]) {
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;
            } else {
                ans = mid;
                if (findFirstIndex) {
                    end = mid -1;
                } else {
                    start = mid +1;
                }
            }
        }
        return ans;
    }
}


/* Output:
 * [1, 2]
 */
