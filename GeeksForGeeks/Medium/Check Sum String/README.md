# Check Sum String

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/additive-sequence/1)

## Solved On
29 Oct 2026 at 11:24 pm

<h2><a href="https://www.geeksforgeeks.org/problems/additive-sequence/1">Check Sum String</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 14pt;">Given a string <strong>s</strong>, determine whether it represents a sum string<strong> </strong>or not.&nbsp;</span><span style="font-size: 14pt;">A string is said to be a sum string if its digits can form a sequence of numbers where each number is equal to the sum of the previous two numbers.</span></p>
<p><span style="font-size: 14pt;"><strong>Note: </strong></span><span style="font-size: 14pt;">A valid sum string must contain at least three numbers.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>n = "1235813"
<strong>Output:</strong> true
<strong>Explanation:</strong> <br>The given string can be splited into a series of numbers  <br>where each number is the sum of the previous two numbers: <br>1 + 2 = 3, 2 + 3 = 5, 3 + 5 = 8, and 5 + 8 = 13. Hence, the output would be true.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>n = "11235815"
<strong>Output:</strong> false
<strong>Explanation:</strong> <br>We can start with the first two digits: "11".
First number: 1, Second number: 1, Sum: 1 + 1 = 2
Now, we have "2" as the next number.
First number: 1, Second number: 2, Sum: 1 + 2 = 3
Now, we have "3" as the next number.
First number: 2, Second number: 3, Sum: 2 + 3 = 5
Now, we have "5" as the next number.
First number: 3, Second number: 5, Sum: 3 + 5 = 8
Now, we have "8" as the next number.
First number: 5, Second number: 8, Sum: 5 + 8 = 13
At this point, there is no "13" present in the remaining digits "815". Hence, the output would be false.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>3 ≤ s.size() ≤ 200<br>1 ≤ digits of string ≤ 9</span></p>