/*
 * Platform: TakeUForward
 * Problem: Striver’s A2Z DSA Sheet
 * URL: https://takeuforward.org/prep-hub/strivers-a2z-dsa-sheet
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Explore, My Spaces, Dashboard, Prep Hub, Planly, Community, Blogs
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-09-26T10:52:26.009Z
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
