package array;

public class RemoveDuplicatesfromSortedArrayII {
    /*
   时间复杂度：O(n)，空间复杂度：O(1)
   */
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int cnt = 1, res = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                cnt++;
            } else
                cnt = 1;
            if (cnt <= 2) {
                nums[res] = nums[i];
                res++;
            }
        }
        return res;
    }

    /*
    时间复杂度：O(n)，空间复杂度：O(1)
    */
    public int removeDuplicates2(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i < 2 || n > nums[i - 2])
                nums[i++] = n;
        return i;
    }

    /*
    时间复杂度：O(n)，空间复杂度：O(1)
    执行用时 :1 ms, 在所有 Java 提交中击败了99.90%的用户
    内存消耗 :36.9 MB, 在所有 Java 提交中击败了99.36%的用户
     */
    public static int removeDuplicates3(int[] nums) {
        if (nums.length <= 2) return nums.length;
        int count = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[count - 2]) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
