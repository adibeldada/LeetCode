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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode start = head;
        int temp = 0;
        if (start != null){
            temp = start.val;
        }
        


        while (start != null && start.next != null){
            
            if (temp == start.next.val){
                start.next = start.next.next;
                
            } else {
                temp = start.next.val;
                start = start.next;
            }

        }

        
        
        return head;
    }
}