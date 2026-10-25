# Count Distinct Substrings

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/count-of-distinct-substrings/1)

## Solved On
26 Oct 2026 at 12:09 am

<h2><a href="https://www.geeksforgeeks.org/problems/count-of-distinct-substrings/1">Count Distinct Substrings</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 14pt;">Given a string <strong data-start="205" data-end="210">s</strong> consisting of lowercase English letters, find the<strong> </strong>total number of distinct non-empty <strong>substrings</strong> of s.</span></p>
<p><span style="font-size: 14pt;"><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;"><strong>Note:&nbsp;</strong></span></span><span style="font-size: 18.6667px;">A substring is a contiguous sequence of characters within a string. Two substrings are considered distinct if they have different character sequences, regardless of their positions in the string.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>s = "ababa"
<strong>Output: </strong>9
<strong>Explanation</strong>: All distinct substrings of "ababa" are: "a", "b", "ab", "ba", "aba", "bab", "abab", "baba", "ababa".
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>s = "aaa"
<strong>Output: </strong>3<br><strong><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">Explanation</span></strong><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;"><strong>:</strong> </span>The distinct substrings of "aaa" are: "a", "aa", "aaa".</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ s.size() ≤ 3000<br></span></p>