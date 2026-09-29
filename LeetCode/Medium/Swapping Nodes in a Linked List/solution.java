class Solution {
    public ListNode swapNodes(ListNode head, int k) {
      ListNode slow=head,fast=head;
      for(int i=1;i <k;i++){
        fast=fast.next;
      }
      ListNode first=fast;
      while(fast.next !=null){
        fast=fast.next;
        slow=slow.next;
      }
      int temp=first.val;
      first.val=slow.val;
      slow.val=temp;

      return head;
      
    }
}