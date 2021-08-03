package l25;

/**
 * @author alario
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

/*    static ListNode l111 =new ListNode(4);
    static ListNode l11 =new ListNode(2,l111);
    static ListNode l1 =new ListNode(1,l11);
    static ListNode l222 =new ListNode(4);
    static ListNode l22 =new ListNode(3,l222);
    static ListNode l2 =new ListNode(1,l22);*/


    public static void main(String[] args) {
         ListNode l111 =new ListNode(4);
         ListNode l11 =new ListNode(2,l111);ListNode l1 =new ListNode(1,l11);
        ListNode l222 =new ListNode(4);
         ListNode l22 =new ListNode(3,l222);
        ListNode l2 =new ListNode(1,l22);
        mergeTwoLists(l1,l2);
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(-1),p=new ListNode(-1);
        head=p;
        while(true){
            ListNode temp;
            if(l1==null){
                if(l2!=null){
                    p.next=l2;
                }
                return head.next;
            }else if(l2==null){
                if(l1!=null){
                    p.next=l1;
                }
                return head.next;
            }
            if(l1.val<=l2.val){
                p.next=l1;
                l1=l1.next;

            }else if(l1.val> l2.val){
                p.next=l2;
                l2=l2.next;
            }
            p=p.next;
        }
    }
}
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
    ListNode(int x,ListNode l) {
        val = x;
        next = l;
    }
}
