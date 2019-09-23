package array;

public class RemoveDuplicatesfromSortedArray {
    /*
    方法：双指针法
    复杂度分析
    时间复杂度：O(n)，空间复杂度：O(1)
     */
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int res = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[res] = nums[i];
                res++;
            }
        }
        return res;
    }
}
