package l06;

import java.util.*;


// Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
class Solution{
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {   //返回值可变容易处理
        ArrayList<Integer> ret = new ArrayList<>();
        if (listNode != null) {
            ret.addAll(printListFromTailToHead(listNode.next)); //加上上一级返回数列的所有元素
            ret.add(listNode.val);
        }
        return ret;
    }


//stack
    public int[] reversePrint(ListNode head) {
        Stack<Integer> s=new Stack<>();
        while(head!=null){
            s.push(head.val);
            head=head.next;
        }
        int[] ret=new int[s.size()];
        for(int i=0;s.size()!=0;i++){
            ret[i]=s.pop();
        }
        return ret;
    }

//反向遍历  会破坏链表结构
    public int[] reversePrint2(ListNode head) {
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
//头插入 不破坏原head 生成反向链表
    public int[] reversePrint3(ListNode head) {
        ListNode reversehead= new ListNode(0);
        ListNode temp = head;       //指向原链表的辅助节点
        ListNode next=null;
        int count = 0;
        while (temp != null) {
            next=temp.next;
            temp.next=reversehead.next;
            reversehead.next=temp;
            temp=next;
            count++;
        }
        reversehead=reversehead.next;     //注意头节点是否存数据
        int[] ret = new int[count];
        for (int i = 0; i < count; i++) {
            ret[i] = reversehead.val;
            reversehead = reversehead.next;
        }
        return ret;
    }
}
