/*
 * Platform: LintCode
 * Problem: ENG
 * URL: https://www.lintcode.com/problem/167/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Linked ListSimulation, Linked List, Simulation, Test Data Test Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-22T17:19:00.847Z
 */

············if·(!s2.isEmpty())
················sum·+=·s2.pop();

············carry·=·sum·/·10;

············ListNode·node·=·new·ListNode(sum·%·10);

············node.next·=·head;
············head·=·node;
········}

········return·head;
····}
}
