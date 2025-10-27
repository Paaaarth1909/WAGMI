/* Given the head of a linked list, remove the nth node from the end of the list and return its head.

 

Example 1:


Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]
 

Constraints:

The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz
*/
    //  
 // Definition for singly-linked list.
  public class Remove_Nth_Node_from_the_end_of_the_List_019 {
      int val;
      Remove_Nth_Node_from_the_end_of_the_List_019 next;
      Remove_Nth_Node_from_the_end_of_the_List_019() {}
      Remove_Nth_Node_from_the_end_of_the_List_019(int val) { this.val = val; }
      Remove_Nth_Node_from_the_end_of_the_List_019(int val, Remove_Nth_Node_from_the_end_of_the_List_019 next) { this.val = val; this.next = next; }
  }
 /* */
class Solution {
    public Remove_Nth_Node_from_the_end_of_the_List_019 removeNthFromEnd(Remove_Nth_Node_from_the_end_of_the_List_019 head, int n) {
        Remove_Nth_Node_from_the_end_of_the_List_019 curr = head;
        int ls = 0;
        while (curr != null) {
            curr = curr.next;
            ls++;
        }
        if (ls == n) {
            if (ls > 1) return head.next;
            return null;
        }
        curr = head;
        for (int i = 0; i < ls - n - 1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
 }   
