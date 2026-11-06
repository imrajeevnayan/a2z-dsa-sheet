class Solution {
    public ArrayList<String> generateUsernames(String[] arr) {

        HashSet<String> used = new HashSet<>();

        // Initially all usernames are reserved
        for (String s : arr) {
            used.add(s);
        }

        HashSet<String> assigned = new HashSet<>();
        ArrayList<String> ans = new ArrayList<>();

        for (String name : arr) {

            if (!assigned.contains(name)) {
                ans.add(name);
                assigned.add(name);
            } else {

                int suffix = 1;

                while (used.contains(name + suffix)) {
                    suffix++;
                }

                String newName = name + suffix;

                ans.add(newName);

                used.add(newName);
                assigned.add(newName);
            }
        }

        return ans;
    }
}