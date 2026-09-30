/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public boolean searchKey(Node head, int key) {
        Node curr=head;
        while(curr!=null){
            if(curr.data==key)return true;
            curr=curr.next;
        }
        return false;
    }
}