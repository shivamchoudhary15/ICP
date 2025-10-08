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
    public void reorderList(ListNode head) {
        ListNode temp=head;
        ArrayList<Integer> res=new ArrayList<>();
        while(temp!=null){
            res.add(temp.val);
            temp=temp.next;
        }
        int arr[]=new int[res.size()]; //1 2 3 4 5
        int i=0;
        int j=arr.length-1; //
        int k=0;
        while(i<j){
            arr[k]=res.get(i); 
            k++;
            arr[k]=res.get(j);
            k++;
            i++;
            j--;
        }
        if(i==j) {
            arr[k]=res.get(i);
        }
        temp = head;
        for (int val:arr) {
            temp.val=val;
            temp=temp.next;
        }
    }
}
