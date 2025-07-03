/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode h1=headA;
        ListNode h2=headB;
        while(h1!=h2){
            if(h1!=null){
                h1=h1.next;
            }else{
                h1 = headB;
            }
            if(h2!=null){
                h2=h2.next;
            }else{
                h2 = headA;
            }
            
        }
        return h1;
    }
}