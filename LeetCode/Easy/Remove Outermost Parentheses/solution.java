class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int balance = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                // Pehle balance badhao, phir check karo
                balance++;
                
                // Agar balance > 1 hai, toh ye outermost nahi hai
                if (balance > 1) {
                    sb.append(c);
                }
            } else {
                // Pehle balance ghatao, phir check karo
                balance--;
                
                // Agar balance >= 1 hai (ghatane ke baad), toh ye outermost nahi hai
                if (balance >= 1) {
                    sb.append(c);
                }
            }
        }
        
        return sb.toString();
    }
}