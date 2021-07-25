package l11;

import java.util.Scanner;

/**
 * @author alario
 */
public class Solution {
    public static void main(String[] args) {
        int[] i={3,3,1,3};
        System.out.println(minArray(i));
    }
    public static int minArray(int[] numbers) {
        int left = 0;
        int right = numbers.length-1;
        while(left<right){
            int mid = (right+left)/2;
            System.out.println(left+","+mid+","+right);
            if(numbers[right]<numbers[mid]){
                left=mid+1;
            } else if (numbers[mid] < numbers[right]){
                right=mid;
            }else {
                right--;
            }
        }
        return numbers[left];
    }
}
