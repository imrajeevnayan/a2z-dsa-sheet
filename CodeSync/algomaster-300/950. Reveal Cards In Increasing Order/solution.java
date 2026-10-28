/*
 * Platform: LeetCode
 * Problem: 950. Reveal Cards In Increasing Order
 * URL: https://leetcode.com/problems/reveal-cards-in-increasing-order/description/?envType=problem-list-v2&envId=queue
 * Language: Java
 * Difficulty: Medium
 * Topics: Array, Queue, Sorting, Simulation
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-28T06:37:35.780Z
 */

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);

        int n = deck.length;
        int[] ans = new int[n];

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            q.offer(i);
        }

        for (int card : deck) {
            int idx = q.poll();
            ans[idx] = card;

            if (!q.isEmpty()) {
                q.offer(q.poll());
            }
        }
