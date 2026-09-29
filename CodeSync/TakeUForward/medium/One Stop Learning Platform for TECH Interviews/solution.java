/*
 * Platform: TakeUForward
 * Problem: One Stop Learning Platform for TECH Interviews
 * URL: https://takeuforward.org/
 * Language: Java
 * Difficulty: Medium
 * Topics: Instagram
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-09-25T19:50:27.751Z
 */

class Solution {
    public int[] nextLargerElement(int[] arr) {
        int n=arr.length;
        int [] ans=new int[n];
        Arrays.fill(ans,-1);
        Deque<Integer>st=new ArrayDeque<>();
        for(int i=0;i<arr.length;i++){
           while(!st.isEmpty() && arr[i]>arr[st.peek()]){
            ans[st.pop()]=arr[i];
           }
           st.push(i);
        }
      return ans;
    }
}
