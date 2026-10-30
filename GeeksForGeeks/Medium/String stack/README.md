# String stack

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/string-stack--165812/1)

## Solved On
30 Oct 2026 at 11:26 pm

<h2><a href="https://www.geeksforgeeks.org/problems/string-stack--165812/1">String stack</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 18.6667px;">Given two strings <strong>pat</strong> and <strong>tar</strong> consisting of lowercase English characters. You can construct a new string <strong>s</strong> by performing any one of the following operation for each character in pat:</span></p>
<ul>
<li><span style="font-size: 18.6667px;">Append the character pat[i] to the string s.</span></li>
<li><span style="font-size: 18.6667px;">Delete the last character of s (if s is empty do nothing).</span></li>
</ul>
<p><span style="font-size: 18.6667px;">After performing operations on every character of pat exactly once, determine if it is possible to make the string s equal to string tar.</span></p>
<p><strong><span style="font-size: 18.6667px;">Examples:</span></strong></p>
<pre><span style="font-size: 18.6667px;"><strong>Input:</strong> pat = "geuaek", tar = "geek"</span><br><span style="font-size: 18.6667px;"><strong>Output:</strong> true</span><br><span style="font-size: 18.6667px;"><strong>Explanation:</strong> Append the first three characters of pat to s, resulting in s = "geu". Delete the last character for 'a', leaving s = "ge". Then, append the last two characters 'e' and 'k' from pat to s, resulting in s = "geek", which matches tar.</span></pre>
<pre><span style="font-size: 18.6667px;"><strong>Input: </strong>pat = "agiffghd", tar = "gfg"</span><br><span style="font-size: 18.6667px;"><strong>Output:</strong> true</span><br><span style="font-size: 18.6667px;"><strong>Explanation:</strong> Skip the first character 'a' in pat. Append 'g' and 'i' to s, resulting in s = "gi". Delete the last character for 'f', leaving s = "g". Append 'f', 'g', and 'h' to s, resulting in s = "gfgh". Finally, delete the last character for 'd', leaving s = "gfg", which matches tar.</span></pre>
<pre><span style="font-size: 18.6667px;"><strong>Input:</strong> pat = "ufahs", tar = "aus"</span><br><span style="font-size: 18.6667px;"><strong>Output:</strong> false</span><br><span style="font-size: 18.6667px;"><strong>Explanation:</strong> It is impossible to construct the string tar from pat with the given operations.</span></pre>
