# Platform: LintCode
# Problem: ENG
# URL: https://www.lintcode.com/problem/167/
# Language: Python
# Difficulty: Unknown
# Topics: Linked ListSimulation, Linked List, Simulation, Test Data Test Output
# Runtime: N/A
# Memory: N/A
# Synced: 2026-06-22T09:08:03.458Z

public·class·Solution·{
····public·ListNode·addLists(ListNode·l1,·ListNode·l2)·{
······
········Stack<Integer>s1=new·Stack<>();
········Stack<Integer>s2=new·Stack<>();
········while(l1!=null){
············s1.push(li.val);
········}
············l1=l1.next;
········while(l2!=null){
············s2.push(l2.val)
········}
····}
}
