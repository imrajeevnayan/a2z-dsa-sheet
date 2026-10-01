public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();

        // List A ke saare nodes Set mein daalo
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }

        // List B mein same node dhundo
        while (headB != null) {
            if (set.contains(headB)) return headB;
            headB = headB.next;
        }
        return null;
    }
}
