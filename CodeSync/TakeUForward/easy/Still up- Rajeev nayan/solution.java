/*
 * Platform: TakeUForward
 * Problem: Still up, Rajeev nayan?
 * URL: https://takeuforward.org/dashboard
 * Language: Java
 * Difficulty: Easy
 * Topics: Prep, Explore, My Spaces, Dashboard, Prep Hub, Planly, Community, Blogs
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-01T18:19:49.806Z
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
