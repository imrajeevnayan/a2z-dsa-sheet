class Solution {
    public int maxProfit(int[] prices) {
     int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
     for(int n :prices){
        min=Math.min(min,n);
        max=Math.max(max,n-min);
     }
     return max;   
    }
}