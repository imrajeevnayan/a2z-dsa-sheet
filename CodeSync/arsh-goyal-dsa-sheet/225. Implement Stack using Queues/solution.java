/*
 * Platform: LeetCode
 * Problem: 225. Implement Stack using Queues
 * URL: https://leetcode.com/problems/implement-stack-using-queues/description/?envType=problem-list-v2&envId=queue
 * Language: Java
 * Difficulty: Easy
 * Topics: Stack, Design, Queue
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-28T06:40:30.461Z
 */

class MyStack {
    Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }
    public void push(int x) {
        q.offer(x);
        int size = q.size();

        for (int i = 0; i < size - 1; i++) {
            q.offer(q.poll());
        }
    }
    public int pop() {
        return q.poll();
    }
    public int top() {
        return q.peek();
    }
    public boolean empty() {
        return q.isEmpty();
    }
