package first;

/**
 * @author wlm
 * Day:29
 * Potic:给你一个有序数组nums ，请你原地删除重复出现的元素，使每个元素只出现一次 ，返回删除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 */
public class TwentyNineOne {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,5,89,89,89};
        int i = removeDuplicates(nums);
        System.out.println(i);
    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
