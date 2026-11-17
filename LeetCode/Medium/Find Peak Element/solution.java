class Solution {
    public int findPeakElement(int[] nums) {
        int low=0,high=nums.length-2,ans=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[mid+1]){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}