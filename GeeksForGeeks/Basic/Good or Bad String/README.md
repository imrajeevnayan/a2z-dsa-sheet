# Good or Bad String

## Difficulty: Basic

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/good-or-bad-string1417/1)

## Solved On
08 Nov 2026 at 09:11 am

<h2><a href="https://www.geeksforgeeks.org/problems/good-or-bad-string1417/1">Good or Bad String</a></h2><h3>Difficulty Level: Basic</h3><hr><p><span style="font-size: 12pt;">Given a string s composed of lowercase alphabets and the wildcard character '?', where '?' can be replaced by any lowercase alphabet, classify the string as "BAD" if it is possible to replace every '?' with some lowercase letter such that the resulting string contains more than 3 consonants together or more than 5 vowels together. Otherwise, the string is classified as "GOOD".</span></p>
<p><span style="font-size: 12pt;">Return true if the string is GOOD, and false if the string is BAD.</span></p>
<p><strong><span style="font-size: 12pt;">Examples:</span></strong></p>
<pre><span style="font-size: 12pt;"><strong>Input:</strong> s = "aeioup??"</span><br><span style="font-size: 12pt;"><strong>Output:</strong> true</span><br><span style="font-size: 12pt;"><strong>Explanation:</strong> No matter how the '?' characters are replaced, the string can never contain more than 3 consonants together or more than 5 vowels together, so it is GOOD.</span></pre>
<pre><span style="font-size: 12pt;"><strong>Input:</strong> s = "bcd?"</span><br><span style="font-size: 12pt;"><strong>Output:</strong> false</span><br><span style="font-size: 12pt;"><strong>Explanation:</strong> Replacing '?' with any consonant (for example, "bcdb") creates 4 consonants together, exceeding the limit of 3. Since such a replacement exists, the string is BAD.<br></span></pre>
