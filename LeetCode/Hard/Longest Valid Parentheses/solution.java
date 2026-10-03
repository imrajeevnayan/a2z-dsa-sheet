class Solution {
    public int longestValidParentheses(String s) {
        // Stack banayenge jo sirf INDICES (positions) store karega, characters nahi.
        Stack<Integer> stack = new Stack<>();
         stack.push(-1);
        
        int maxLength = 0; // Final answer store karne ke liye
        
        // String ko start se end tak traverse karo
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(') {
                // Agar opening bracket mila, toh uska INDEX stack mein daal do.
                // Hum baad mein isse match karenge.
                stack.push(i);
            } else {
                // Agar closing bracket ')' mila:
                
                // Sabse pehle top element ko pop karo.
                // Kyunki ye ')' apne se pehle wale '(' se match hone ki try kar raha hai.
                stack.pop();
                
                // Ab check karo ki stack khali toh nahi ho gaya?
                if (stack.isEmpty()) {
                    // Agar stack khali ho gaya, iska matlab ye ')' invalid hai.
                    // Iske pehle koi matching '(' nahi bacha tha.
                    // Toh current index 'i' ko naya BASE (boundary) bana do.
                    // Agla valid substring isi ke baad shuru hoga.
                    stack.push(i);
                } else {
                    // Agar stack khali NAHI hua, iska matlab abhi bhi koi base bacha hai.
                    // Current valid substring ki length calculate karo:
                    // Formula: (Current Index) - (Stack ke top pe jo index hai)
                    int currentLength = i - stack.peek();
                    
                    // Max length update karo agar ye wala bada hai
                    maxLength = Math.max(maxLength, currentLength);
                }
            }
        }
        
        return maxLength;
    }
}