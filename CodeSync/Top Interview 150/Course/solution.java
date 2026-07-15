/*
 * Platform: LintCode
 * Problem: Course
 * URL: https://www.lintcode.com/problem/471/record
 * Language: Java
 * Difficulty: Hard
 * Topics: Test Data Test Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-07-15T09:42:48.836Z
 */

public·class·Solution·{
····public·String[]·topKFrequentWords(String[]·words,·int·k)·{
······HashMap<String,Integer>map=new·HashMap<>();
········for(String·w:words)map.put(w,map.getOrDefault(w,0)+1);
········PriorityQueue<String>·pq·=·new·PriorityQueue<>((a,·b)·->·
············map.get(a).equals(map.get(b))·?·a.compareTo(b)·:·map.get(b)·-·map.get(a)
········);········pq.addAll(map.keySet());
········String·ans[]=new·String[k];
·······for(int·i=0;i<k;i++)·ans[i]=pq.poll();
·······return·ans;
····}
}
public class Solution {
