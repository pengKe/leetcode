package array;

public class RotateArray {
    ////time : O(n)  space : O(n)
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length <= 1 || k == 0)
            return;
        int n = nums.length;
        if (k % n == 0) return;
        int mod =  (k % n);
        int[] tmp = new int[nums.length];
        for (int i = 0; i < tmp.length; i++) {
            tmp[(i + mod) % n] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = tmp[i];
        }
    }
    //time : O(n)  space : O(1)
    public void rotate2(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    private void reverse(int[] arr , int l ,int r){
        while (l < r){
            int tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;
            l++;
            r--;
        }
    }
    //time : O(n∗k)  space : O(1)
    public void rotate3(int[] nums, int k) {
        int temp, previous;
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
    }
    //time : O(n)  space : O(1)
    public void rotate4(int[] nums, int k) {
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }


}
