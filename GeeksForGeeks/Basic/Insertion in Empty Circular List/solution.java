/*class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}*/
class Solution {
    public Node insertIntoEmpty(Node last, int data) {
        while(last !=null){
            return null;
        }
        Node newNode=new Node(data);
        newNode.next=newNode;
        return newNode;
        
    }
}
