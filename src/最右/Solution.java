package 最右;

/**
 * @author alario
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums={5,6,7,8,8,10};
        System.out.println(search(nums,9));

    }
    public static int search(int[] nums, int target) {
        return method(nums,target)-method(nums,target-1);
    }
    public static int method(int[] nums,int tar){
        int p1=0,p=0,p2=nums.length-1;          //找到小于等于tar的最右位置 存在-1
        while(p1<=p2){
            p=(p1+p2)/2;
            System.out.println(p1+","+p+","+p2);
            if(nums[p]<=tar) p1=p+1;
            else p2=p-1;
        }
        return p2;
    }
    public static int search2(int[] nums, int target) {
        // 搜索右边界 right
        int i = 0, j = nums.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(nums[m] <= target) i = m + 1;
            else j = m - 1;
        }
        System.out.println(i);
        int right = i;
        // 若数组中无 target ，则提前返回
        if(j >= 0 && nums[j] != target) return 0;
        // 搜索左边界 right
        i = 0; j = nums.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(nums[m] < target) i = m + 1;
            else j = m - 1;
        }
        System.out.println(j);
        int left = j;
        return right - left - 1;
    }

    public static int search3(int[] nums, int target) {
        return helper(nums, target) - helper(nums, target - 1);
    }
    public static int helper(int[] nums, int tar) {
        int i = 0, j = nums.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(nums[m] <= tar) i = m + 1;
            else j = m - 1;
        }
        return i;
    }
}
