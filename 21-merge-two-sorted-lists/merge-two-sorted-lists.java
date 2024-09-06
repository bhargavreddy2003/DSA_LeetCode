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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
            ListNode temp1=list1;
            ListNode temp2=list2;
            ListNode head=new ListNode();
            if(list1==null && list2==null) return list1;
            

        while(temp1!=null){
            pq.add(temp1.val);
            temp1=temp1.next;
        }
        while(temp2!=null){
            pq.add(temp2.val);
            temp2=temp2.next;
        }
            
            
             
             head.val=pq.poll();
             head.next=null;
            ListNode tempHead;
            tempHead=head;
       
        while(!pq.isEmpty()){
            ListNode temp3= new ListNode();
            temp3.val=pq.poll();
            tempHead.next= temp3;
            tempHead=tempHead.next;
            
        }
        return head;
       
      



    }
}