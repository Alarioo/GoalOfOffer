package l21;

/**
 * @author alario
 */
public class Solution {
    public static void main(String[] args) {
        int[] l={1,2,2,3,4};
        for(Integer i:exchange(l)){
            System.out.print(i+" ");
        }
    }

    public static int[] exchange(int[] nums) {
        if(nums==null){return null;}
        int p1=0,p2=nums.length-1;
        while(p1<p2){
            if(nums[p1]%2==0&&nums[p2]%2==1){
                int temp=nums[p2];
                nums[p2]=nums[p1];
                nums[p1]=temp;
                p1++;
                p2--;
            }else if(nums[p1]%2==1){
                p1++;
            }else{
                p2--;
            }
        }
        return nums;

/*        if(nums==null){return null;}
        int[] arr=new int[nums.length];
        int p1=0,p2=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==1){
                arr[p1]=nums[i];
                p1++;
            }else{
                arr[p2]=nums[i];
                p2--;
            }
        }
        return arr;*/
    }
}
