package l09;

import java.util.Stack;
/*
pop s1 add入s2，s2中实现了先进s1的在后进上方的结构，当s2中被删空时空时将s1更新的数据加入s2
 */
public class CQueue {
        public Stack<Integer> s1=new Stack<>();
        public Stack<Integer> s2=new Stack<>();
        CQueue() {
        }

        public void appendTail(int value) {
            s1.add(value);
        }

        public int deleteHead() {
            if(s2.isEmpty()){
                if(s1.isEmpty()){
                    return -1;
                }else {
                    while(!s1.isEmpty()){
                        s2.add(s1.pop());
                    }
                    return s2.pop();
                }
            }else{
                return s2.pop();
            }
        }

}
