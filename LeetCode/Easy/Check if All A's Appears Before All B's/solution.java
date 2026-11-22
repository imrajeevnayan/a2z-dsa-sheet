class Solution {
    public boolean checkString(String s) {
        return s.lastIndexOf('a') < s.indexOf('b')  || s.indexOf('b') == -1;
    }
}
