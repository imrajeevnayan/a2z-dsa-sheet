class Solution {
    public static ArrayList<Integer> deleteElement(int arr[], int k) {

        Stack<Integer> st = new Stack<>();

        for (int num : arr) {
            while (!st.isEmpty() && k > 0 && st.peek() < num) {
                st.pop();
                k--;
            }
            st.push(num);
        }

        return new ArrayList<>(st);
    }
}