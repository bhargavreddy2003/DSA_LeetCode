/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
     ListNode temp= head;
     while(temp!=null){
        pq.add(temp.val);
        temp=temp.next;
     }
     temp=head;
     while(temp!=null){
        temp.val=pq.remove();
        temp=temp.next;
     } 
      return head;
    }
}