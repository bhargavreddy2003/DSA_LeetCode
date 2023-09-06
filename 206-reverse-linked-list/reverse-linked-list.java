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
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;     //rreturn if list is empty
        }
        
        ListNode curr = head;
        ListNode prv = null;
        
        while (curr != null) {
            ListNode currp1 = curr.next;
            curr.next = prv;                //increment current to next node   swap previous node to current and change link travers till end where current points to null
            prv = curr;
            curr = currp1;
        }
        
        head = prv;
        return head;
    }
}
