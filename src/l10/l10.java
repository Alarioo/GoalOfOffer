package l10;

/**
 * @author alario
 * @Date 2021/7/3 21:33
 */
public class l10 {
    static int num=0;

    public static void main(String[] args) {
        System.out.println(numWays(1));
    }

    public static int numWays(int n) {
        jump(n);
        return num;
    }
    public static void jump(int n){
        if(n==0){
            num++;
            return;
        }else if(n>0){
            for(int i=1;i<3;i++){
                jump(n-i);
            }
        }else if(n<0){
            return;
        }
    }
}
