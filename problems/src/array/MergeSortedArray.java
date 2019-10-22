package array;

public class MergeSortedArray {
    /*
      time : O(m + n)
      space : O(1)
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int m1 = m - 1, n1 = n - 1, k = m + n - 1;
        while (m1 >= 0 && n1 >= 0) {
            if (nums1[m1] >= nums2[n1]) nums1[k--] = nums1[m1--];
            else nums1[k--] = nums2[n1--];
        }
        while (n1 >= 0) nums1[k--] = nums2[n1--];
    }
}
