class Solution {
    boolean isGoodOrBad(String s) {
        int vMax = 0; // maximum consecutive vowels possible
        int cMax = 0; // maximum consecutive consonants possible

        for (char ch : s.toCharArray()) {

            if (isVowel(ch)) {
                vMax++;
                cMax = 0;
            }
            else if (ch == '?') {
                int newV = vMax + 1;
                int newC = cMax + 1;

                vMax = newV;
                cMax = newC;
            }
            else {
                cMax++;
                vMax = 0;
            }

            if (vMax > 5 || cMax > 3) {
                return false; // BAD
            }
        }

        return true; // GOOD
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'
            || ch == 'o' || ch == 'u';
    }
}
