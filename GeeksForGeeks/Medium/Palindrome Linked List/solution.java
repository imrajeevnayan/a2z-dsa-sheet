import java.util.Stack;

class Solution {
    public boolean isPalindrome(Node head) {
        // Edge case handling
        if (head == null || head.next == null) return true;
        
        Stack<Integer> stack = new Stack<>();
        Node curr = head;

        // Step 1: Saare elements ko stack mein daal do
        while (curr != null) {
            stack.push(curr.data);
            curr = curr.next;
        }

        // Step 2: Head se start karo aur stack ke top se compare karo
        curr = head;
        while (curr != null) {
            // Agar data match nahi hua, toh palindrome nahi hai
            if (curr.data != stack.pop())  return false;
            
            curr = curr.next;
        }
        // Agar loop pura chal gaya, toh sab match hua
        return true;
    }
}