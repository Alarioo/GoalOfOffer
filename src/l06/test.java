package l06;

import java.util.*;


// Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
class Solution1{
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {   //返回值可变容易处理
        ArrayList<Integer> ret = new ArrayList<>();
        if (listNode != null) {
            ret.addAll(printListFromTailToHead(listNode.next)); //加上上一级返回数列的所有元素
            ret.add(listNode.val);
        }
        return ret;
    }


//stack
class Solution2 {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> s=new Stack<>();
        while(head!=null){
            s.add(head.val);
            head=head.next;
        }
        int[] ret=new int[s.size()];
        for(int i=0;s.size()!=0;i++){
            ret[i]=s.pop();
        }
        return ret;
    }
}
//反向遍历
class Solution3 {
    public int[] reversePrint(ListNode head) {
        ListNode node=head;
        int count=0;
        while(node!=null){
            count++;
            node=node.next;
        }
        int[] back=new int[count];
        for(int i=count-1;i>=0;i--){
            back[i]=head.val;
            head=head.next;
        }
        return back;
    }
}
//头插入
class Solution4 {
    public int[] reversePrint(ListNode head) {
        ListNode origin=new ListNode(0);
        ListNode temp=head;
        int count=0;
        while(head!=null){
            temp=head.next;
            head.next=origin.next;
            origin.next=head;
            head=temp;
            count++;
        }
        int[] ret=new int[count];
        for(int i=0;i<count;i++){
            ret[i]= head.val;
            head=head.next;
        }
        return ret;
    }
}