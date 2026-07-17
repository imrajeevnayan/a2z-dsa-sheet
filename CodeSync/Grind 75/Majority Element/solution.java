/*
 * Platform: InterviewBit
 * Problem: Majority Element
 * URL: https://www.interviewbit.com/problems/majority-element/
 * Language: Java
 * Difficulty: Easy
 * Topics: Programming, Greedy Algorithm, Description, Discussion, Submissions, Hints, Bulbs 23 Minutes Easy Asked in:, Turn on the Bulbs 27 Minutes Very Easy Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-07-17T08:33:55.961Z
 */

public class Solution {
    public int majorityElement(final List<Integer> A) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int n:A)map.put(n,map.getOrDefault(n,0)+1);
        for(int n:map.keySet()){
            if(map.get(n)> A.size()/2) return n;
        }
        return -1;
    }
}
