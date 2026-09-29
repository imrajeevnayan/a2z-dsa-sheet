/*
 * Platform: TakeUForward
 * Problem: Capitalize First and Last Character of Each Word POTD
 * URL: https://takeuforward.org/practice/dsa/capitalize-first-and-last-character-of-each-word
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Explore, My Spaces, Dashboard, Prep Hub, DSA, SQL, Planly
 * Runtime: 0.169 ms
 * Memory: N/A
 * Synced: 2026-09-25T19:52:37.844Z
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
