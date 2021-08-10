package l30;

import java.util.Stack;

/**
 * @author alario
 */
class MinStack {
    static Stack<Integer> s=new Stack<>();
    static  int i,j;
    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        s.add(x);
        if(x<=i){
            i=x;
            j++;
        }
    }

    public void pop() {
        int t=s.pop();
        if (t==i){
            j--;
        }
    }

    public int top() {
        int t=s.pop();
        if (t==i){
            j--;
        }
        return t;
    }

    public int min() {
        if(j)
    }
}
