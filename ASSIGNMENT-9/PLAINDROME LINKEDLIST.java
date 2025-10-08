class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode curr=slow;
        ListNode prev=null;
       
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
           curr=next;
        }
        ListNode a=head;
        ListNode b=prev;
        while(b!=null){
            if(b.val!=a.val){
                return false;
            }
            b=b.next;
            a=a.next;
        }
        return true;
    }
}
