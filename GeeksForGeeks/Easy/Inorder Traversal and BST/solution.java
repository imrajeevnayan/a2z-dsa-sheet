class Solution {
    public boolean doesRepresentBST(int[] arr) {
        int n = arr.length;

        // Empty ya single element wala array hamesha valid BST hota hai
        if (n <= 1) return true;

        // Array ko traverse karo aur check karo ki wo strictly increasing hai ya nahi
        for (int i = 0; i < n - 1; i++) {
            // Agar current element next element se bada ya equal hai, 
            // toh ye sorted nahi hai, hence BST nahi hai
            if (arr[i] >= arr[i + 1]) {
                return false;
            }
        }

        return true;
    }
}