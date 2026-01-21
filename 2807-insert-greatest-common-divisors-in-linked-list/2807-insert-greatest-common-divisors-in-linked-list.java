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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode first = head;
        
        while (head.next != null){
            int greatest;
            if (head.val > head.next.val){
                greatest = head.val;
            } else {
                greatest = head.next.val;
            }
            int gcd =1;

            for (int i = greatest; i >= 1; i-- ){
                if (head.val  % i == 0 && head.next.val % i == 0){
                    gcd = i;
                    break;
                }
                continue;

            }
            ListNode newNode = new ListNode(gcd);
            ListNode temp = head.next;
            newNode.next = temp;
            head.next = newNode;
            head = head.next.next;
        }
        
        return first;
    }
}