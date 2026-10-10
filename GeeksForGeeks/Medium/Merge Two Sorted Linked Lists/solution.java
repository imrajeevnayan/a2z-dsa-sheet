class Solution {
    Node sortedMerge(Node head1, Node head2) {
       Node dummy = new Node(-1); // fake starting node
              Node tail = dummy;

              while (head1 != null && head2 != null) {
                  if (head1.data <= head2.data) {
                      tail.next = head1;
                      head1 = head1.next;
                  } else {
                      tail.next = head2;
                      head2 = head2.next;
                  }
                  tail = tail.next;
              }

              // ek list khatam ho gayi? baaki wali seedha attach karo
              tail.next = (head1 != null) ? head1 : head2;

              return dummy.next;
        
    }
}