/*
 * Platform: LintCode
 * Problem: ENG
 * URL: https://www.lintcode.com/problem/167/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Linked ListSimulation, Linked List, Simulation, Test Data Test Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-22T17:00:58.849Z
 */

public·class·Solution·{
····public·ListNode·addLists(ListNode·l1,·ListNode·l2)·{
········Stack<Integer>s1=new·Stack<>();
········Stack<Integer>s2=new·Stack<>();
········while(l1!=null){
············s1.push(li.val);
············l1=l1.next;
········}
········while(l2!=null){
············s2.push(l2.val);
············l2=l2.next;
········}
········int·carry=0;
·······ListNode·head=null;
·······while(!s1.isEmpty()·||·!s2.isEmpty()||·carry=0){
···········int·sum=carry;
···········if(!s1.isEmpty())sum+=s1.pop();
···········if(!s2.isEmpty())sum+=s2.pop();
···········carry=sum/10;
···········ListNode·node=new·ListNode(sum·%·10);
·······}

······
····}
···········node.next=head;
}
