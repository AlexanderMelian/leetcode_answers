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
    
    public void addNumbers(ListNode l1, ListNode l2, ListNode res, int carry){
        int help=0;
        if(l1 != null && l2 != null){
            help = l1.val+l2.val+carry;
        }
        else if(l1 != null && l2 == null){
            help = l1.val+carry;
        }
        else if(l1 == null && l2 != null){
            help = l2.val+carry;
        }
        else if(l1 == null && l2 == null){
            help = carry;
        }
        if(help>9){
            carry = help/10;
            help = help%10;
        }else{
            carry = 0;
        }
        res.val = help;
        if(l1 == null && l2 == null && carry>0){
            res.next = new ListNode();
            res.next.val = carry;
        }
        else if(l1.next!=null && l2.next != null){
            res.next = new ListNode();
            addNumbers(l1.next,l2.next,res.next,carry);
        }
        else if(l1.next==null && l2.next != null){
            res.next = new ListNode();
            addOneNumber(l2.next,res.next,carry);
        }
        else if(l1.next!=null && l2.next == null){
            res.next = new ListNode();
            addOneNumber(l1.next,res.next,carry);
        }
        else if(l1.next == null && l2.next == null && carry>0){
            res.next = new ListNode();
            res.next.val = carry;
        }
    }
public void addOneNumber(ListNode l1, ListNode res,int carry){
        int help=l1.val+carry;
        if(help>9){
            carry = help/10;
            help = help%10;
        }else{
            carry = 0;
        }
        res.val = help;
        if(l1.next==null && carry>0){
            res.next = new ListNode();
            res.next.val = carry;
        }
        else if(l1.next!=null){
            res.next = new ListNode();
            addOneNumber(l1.next,res.next,carry);
        }
    }
    
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        
        if(l1 != null && l2 != null){
           addNumbers(l1,l2,res,0);
        }
        
        return res;
    }
}