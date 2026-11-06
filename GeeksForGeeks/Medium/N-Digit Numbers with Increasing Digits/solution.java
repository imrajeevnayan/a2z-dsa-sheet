class Solution {

    public static ArrayList<Integer> increasingNumbers(int n) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (n == 1) {
            for (int i = 0; i <= 9; i++) {
                ans.add(i);
            }
            return ans;
        }

        if (n > 10) return ans;

        helper(n, 1, "", ans);
        return ans;
    }

    static void helper(int n, int start, String curr, ArrayList<Integer> ans) {
        if (curr.length() == n) {
            ans.add(Integer.parseInt(curr));
            return;
        }

        for (int digit = start; digit <= 9; digit++) {
            helper(n, digit + 1, curr + digit, ans);
        }
    }
}