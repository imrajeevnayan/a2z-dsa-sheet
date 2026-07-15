/*
 * Platform: LintCode
 * Problem: ENG
 * URL: https://www.lintcode.com/problem/471/
 * Language: Java
 * Difficulty: Unknown
 * Topics: HeapHash TableSort, Heap, Hash Table, Sort, Pocket Gems Amazon Bloomberg Yelp Uber, Pocket Gems, Amazon, Bloomberg
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-07-15T09:40:43.868Z
 */

public·class·Solution·{
····public·String[]·topKFrequentWords(String[]·words,·int·k)·{
·····HashMap<String,Integer>map=new·HashMap<>();
·····for(String·s·:words)map.put(s,map.getOrDefault(s,0)+1);
·····PriorityQueue<String>·pq·=·new·PriorityQueue<>((a,·b)·->·{
······if·(map.get(a).equals(map.get(b)))·{return·a.compareTo(b);}
·········return·map.get(b)·-·map.get(a);··});
·······pq.addAll(map.keySet());
·······String·ans[]=new·String[k];
·······for(int·i=0;i<k;i++)·ans[i]=pq.poll();
·······return·ans;
····}
}
