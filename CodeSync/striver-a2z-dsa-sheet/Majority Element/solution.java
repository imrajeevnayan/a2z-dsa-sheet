/*
 * Platform: InterviewBit
 * Problem: Majority Element
 * URL: https://www.interviewbit.com/problems/majority-element/submissions/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Description, Discussion, Submissions, Hints
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-07-17T08:35:31.471Z
 */

public class Solution {
    public int majorityElement(final List<Integer> A) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int n:map.keySet()){
            if(map.get(n)> A.size()/2) return n;
        for(int n:A)map.put(n,map.getOrDefault(n,0)+1);
        }
        return -1;
    }
}
