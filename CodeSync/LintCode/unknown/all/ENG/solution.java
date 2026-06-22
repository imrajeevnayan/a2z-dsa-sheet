/*
 * Platform: LintCode
 * Problem: ENG
 * URL: https://www.lintcode.com/problem/167/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Linked ListSimulation, Linked List, Simulation, Test Data Test Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-22T17:02:35.032Z
 */

········int·carry=0;
·······ListNode·head=null;
·······while(!s1.isEmpty()·||·!s2.isEmpty()||·carry=0){
···········int·sum=carry;
···········if(!s1.isEmpty())sum+=s1.pop();
···········if(!s2.isEmpty())sum+=s2.pop();
···········carry=sum/10;
···········ListNode·node=new·ListNode(sum·%·10);
···········node.next=head;
···········head=node;
·······}
·····return·head;
······
····}
}
