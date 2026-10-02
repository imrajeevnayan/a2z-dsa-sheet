/*
 * Platform: LeetCode
 * Problem: 722. Remove Comments
 * URL: https://leetcode.com/problems/remove-comments/description/?envType=problem-list-v2&envId=string
 * Language: C
 * Difficulty: Medium
 * Topics: Array, String
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-02T11:37:39.320Z
 */

Input: source = ["/*Test program */", "int main()", "{ ", "  // variable declaration ", "int a, b, c;", "/* This is a test", "   multiline  ", "   comment for ", "   testing */", "a = b + c;", "}"]
Output: ["int main()","{ ","  ","int a, b, c;","a = b + c;","}"]
Explanation: The line by line code is visualized as below:
/*Test program */
int main()
{ 
  // variable declaration 
int a, b, c;
/* This is a test
   multiline  
   comment for 
   testing */
a = b + c;
}
The string /* denotes a block comment, including line 1 and lines 6-9. The string // denotes line 4 as comments.
The line by line output code is visualized as below:
int main()
{ 
  
int a, b, c;
a = b + c;
}
