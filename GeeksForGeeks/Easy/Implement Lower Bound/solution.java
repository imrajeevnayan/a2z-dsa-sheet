class Solution {
    int lowerBound(int[] arr, int target) {
        int left=0,right=arr.length-1,ans=arr.length;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]>=target){
                ans=mid;
                right=mid-1;
            }
            else left=mid+1;
        }
        return ans;
    }
}
