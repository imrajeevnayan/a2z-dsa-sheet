class Solution {
    int findCeil(Node root, int x) {
        int ans = -1; // Default value agar koi ceil na mile

        while (root != null) {
            if (root.data == x) return root.data;
            else if (root.data > x) {
                // Current node x se bada hai, toh ye ek potential answer hai
                ans = root.data;

                // Lekin humein sabse CHOTA bada number chahiye, 
                // isliye ab Left side check karte hain ki kya wahan isse chota koi valid number hai
                root = root.left;
            } 
            else {
                // root.data < x
                // Current node chota hai, ye ceil nahi ho sakta.
                // Humein bada number chahiye, isliye Right side jao
                root = root.right;
            }
        }
        return ans;
    }
}