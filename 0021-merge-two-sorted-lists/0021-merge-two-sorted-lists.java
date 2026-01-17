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
        ListNode current = list1;
        ListNode newHead = list2;
        int length = 1;
    
        

        if (current != null){
            while (current.next != null){
            length++;
            current = current.next;
            
            }

            current.next = newHead;
         
            
            while (current.next != null){
            length++;
            current = current.next;
            
            }

            int[] array = new int[length];
            int length2 = 0;

            ListNode newCurrent = list1;

            while (newCurrent != null){
                
                    array[length2] = newCurrent.val;
                    newCurrent = newCurrent.next;
                    length2++;
                
                
            }

            Arrays.sort(array);
            ListNode head = list1;
            for (int i = 0; i < length; i++){
                head.val = array[i];
                head = head.next;
            }
            ListNode finalHead = list1;

            
            return finalHead;
        } else {
            current = newHead;
            return current;
        }
        
        
        
        }

        
    }
