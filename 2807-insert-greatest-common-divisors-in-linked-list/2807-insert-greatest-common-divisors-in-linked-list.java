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
            int gcd = getGCD(head.val, head.next.val);
            ListNode newNode = new ListNode(gcd);
            ListNode temp = head.next;
            newNode.next = temp;
            head.next = newNode;
            head = head.next.next;
        }
        
        return first;
    }

    private int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}