package array;

public class RemoveElement {
    /*
    第一种思路
    标签：拷贝覆盖
    主要思路是遍历数组nums，每次取出的数字变量为num，同时设置一个下标ans
    在遍历过程中如果出现数字与需要移除的值不相同时，则进行拷贝覆盖nums[n] = num，n自增1
    如果相同的时候，则跳过该数字不进行拷贝覆盖，最后n即为新的数组长度
    这种思路在移除元素较多时更适合使用，最极端的情况是全部元素都需要移除，遍历一遍结束即可
    时间复杂度：O(n)，空间复杂度：O(1)
     */
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) return 0;
        int n = 0, l = 0;
        while (l < nums.length) {
            if (nums[l] != val) {
                nums[n++] = nums[l];
            }
            l++;
        }
        return n;
    }
    /*
    第二种思路
    标签：交换移除
    主要思路是遍历数组nums，遍历指针为i，总长度为n
    在遍历过程中如果出现数字与需要移除的值不相同时，则i自增1，继续下一次遍历
    如果相同的时候，则将nums[i]与nums[n-1]交换，即当前数字和数组最后一个数字进行交换，交换后就少了一个元素，故而n自减1
    这种思路在移除元素较少时更适合使用，最极端的情况是没有元素需要移除，遍历一遍结束即可
    时间复杂度：O(n)，空间复杂度：O(1)
     */
    public int removeElement2(int[] nums, int val) {
        if (nums == null || nums.length == 0) return 0;
        int l = 0, n = nums.length;
        while (l < n) {
            if (nums[l] == val) {
                nums[l] = nums[n - 1];
                n--;
            } else {
                l++;
            }
        }
        return l;
    }
}
