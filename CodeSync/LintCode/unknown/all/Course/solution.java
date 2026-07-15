/*
 * Platform: LintCode
 * Problem: Course
 * URL: https://www.lintcode.com/problem/471/leaderboard
 * Language: Java
 * Difficulty: Unknown
 * Topics: Test Data Test Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-07-15T09:42:03.386Z
 */

public·class·Solution·{
····public·String[]·topKFrequentWords(String[]·words,·int·k)·{
······HashMap<String,Integer>map=new·HashMap<>();
········for(String·w:words)map.put(w,map.getOrDefault(w,0)+1);
········PriorityQueue<String>·pq·=·new·PriorityQueue<>((a,·b)·->·
············map.get(a).equals(map.get(b))·?·a.compareTo(b)·:·map.get(b)·-·map.get(a)
········);········pq.addAll(map.keySet());
········List<String>ans=new·ArrayList<>();
········for(int·i=0;i<k;i++)ans.add(pq.poll());
········return·ans;
····}
}
