package l03;
//在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
//import java.util.Arrays;
//import java.util.HashSet;

public class Solution {
//对于这种数组元素在 [0, n-1] 范围内的问题，可以将值为 i 的元素调整到第 i 个位置上进行求解。在调整过程中，如果第 i 位置上已经有一个值为 i 的元素，就可以知道 i 值重复
//时间复杂度 O(N)，空间复杂度 O(1)
    public int duplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    return  nums[i];
                }
                swap(nums, i, nums[i]);
            }
            swap(nums, i, nums[i]);
        }
        return -1;
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    //    public int findRepeatNumber(int[] nums) {
//        HashSet<Integer> hs = new HashSet<>();
//        Arrays.sort(nums);
//        int n=-1;
//        if(nums==null || nums.length==0) return -1;
//        for (int i = 0; i < nums.length; i++) {
//            if(hs.contains(nums[i])){
//                n=nums[i];
//                return n;
//            }
//            hs.add(nums[i]);
//        }
//        return n;
//    }
}