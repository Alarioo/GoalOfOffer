/**
 * @author alario
 */
class Solution {
    public int missingNumber(int[] nums) {
        int p1=0,p2=nums.length-1,p=0;
        while(p1<=p2){
            p=(p1+p2)/2;
            if (nums[p]==p) p1=p+1;
            else  p2=p-1;
        }
        return p-1;
    }
}
