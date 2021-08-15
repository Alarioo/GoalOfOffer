package ACM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.next());
        String[] input=new String[n];
        for(int i=0;i<n;i++){
            input[i]=sc.next();
        }
        check(input);
    }
    public static void check(String[] input){
        for(String word: input){
            int i=0;
            StringBuilder sb=new StringBuilder(word);
            while((i+2)<sb.length()){
                if(sb.charAt(i)==sb.charAt(i+1)&&sb.charAt(i+1)==sb.charAt(i+2)){
                    sb.delete(i,i+1);
                    continue;
                }
                i++;
            }
            i=0;
            while((i+3)<sb.length()){
                if(sb.charAt(i)==sb.charAt(i+1)&&sb.charAt(i+2)==sb.charAt(i+3)){
                    sb.delete(i+2,i+3);
                    continue;
                }
                i++;
            }
            System.out.println(sb.toString());
        }
    }
}
/*

1. 三个同样的字母连在一起，一定是拼写错误，去掉一个的就好啦：比如 helllo -> hello
2. 两对一样的字母（AABB型）连在一起，一定是拼写错误，去掉第二对的一个字母就好啦：比如 helloo -> hello
3. 上面的规则优先“从左到右”匹配，即如果是AABBCC，虽然AABB和BBCC都是错误拼写，应该优先考虑修复AABB，结果为AABCC

 */