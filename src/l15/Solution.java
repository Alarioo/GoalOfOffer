package l15;

/**
 * @author alario
 */
public class Solution {
    // you need to treat n as an unsigned value
    public static void main(String[] args) {
        int i =1;
        System.out.println(i>>1);
        hammingWeight(8);
    }
    public static int hammingWeight(int n) {
/*        int m=0;
        while (n>0){
            n &= (n-1);     //消除最右边的1 https://www.jianshu.com/p/927009730809
            m++;
        }
        return m;*/
        //

        int m=0;
        while(n!=0){
            if((n&1)!=0){
                m++;
            }
            n >>>= 1; //n右移一位 >>> 无符号移位    >>有符号移位
        }
        return m;
/*        int m=0;
        while (n<(2^m)){
            m++;
        }
        int s=0;
        while(n>0){
            int t=2^(m-1);
            if(n>=t){
                n-=t;
                m--;
                s++;
            }else{
                m--;
            }
        }
        return s;*/
    }
}
