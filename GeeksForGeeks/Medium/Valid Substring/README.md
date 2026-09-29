# Valid Substring

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/valid-substring0624/1)

## Solved On
29 Sept 2026 at 11:08 pm

<h2><a href="https://www.geeksforgeeks.org/problems/valid-substring0624/1">Valid Substring</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 14pt;">Given a string <strong><code>s</code></strong> consisting only of opening and closing parentheses <strong><code>'('</code></strong> and <code><strong>')'</strong></code>, find the length of the <strong>longest valid</strong> (well-formed) parentheses <strong>substring</strong>.</span></p>
<p><span style="font-size: 14pt;"><strong>Note: </strong>The length of the smallest valid substring <code>"()"</code> is 2.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>s = "(()("
<strong>Output:</strong> 2
<strong>Explanation:</strong> The longest valid substring is <code>"()"</code><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">. Its length is 2.</span> </span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>s = "()(())("
<strong>Output:</strong> 6
<strong>Explanation: </strong>The longest valid substring is <code>"()(())"</code><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">. Its length is 6.</span></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>s = "(()())"
<strong>Output:</strong> 6
<strong>Explanation: </strong>The longest valid substring is <code>"(()())"</code><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">. Its length is 6.</span></span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ s.size() ≤ 10<sup>5</sup><br>s[i] ∈ { '(' , ')' }</span></p>