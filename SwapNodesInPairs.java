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
    static void change(ListNode head, int index) {
		int help;
		if(head.next == null) {
			return;
		}
		if(index%2 == 0) {
			help = head.next.val;
			head.next.val = head.val;
			head.val = help;
			}
			Solution.change(head.next, (index+1));
		
	}
    
    
    public ListNode swapPairs(ListNode head) {
        
        
        if(head != null) {
    		Solution.change(head,0);    		
    	}
        
        return head;
    }
}