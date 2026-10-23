# Anagram

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/anagram-1587115620/1)

## Solved On
23 Oct 2026 at 10:37 pm

<h2><a href="https://www.geeksforgeeks.org/problems/anagram-1587115620/1">Anagram</a></h2><h3>Difficulty Level: Easy</h3><hr><p data-start="96" data-end="235"><span style="font-size: 14pt; font-family: 'andale mono', monospace;">Given two non-empty strings <strong>s1 </strong>and <strong>s2</strong>, consisting only of lowercase English letters, determine whether they are anagrams of each other or not.<br></span><span style="font-size: 14pt; font-family: 'andale mono', monospace;"> </span><span style="font-size: 14pt; font-family: 'andale mono', monospace;">Two strings are considered anagrams if they contain the same characters with exactly the same frequencies, regardless of their order.</span></p><p><span style="font-size: 14pt; font-family: 'andale mono', monospace;"><strong>Examples:</strong></span></p><pre dir="ltr"><span style="font-size: 18.6667px; font-family: 'andale mono', monospace;"><strong>Input:</strong> s1 = "geeks" s2 = "kseeg"<br><strong>Output:</strong> true <br><strong>Explanation:</strong> Both the string have same characters with same frequency. So, they are anagrams.</span></pre><pre dir="ltr"><span style="font-size: 18.6667px; font-family: 'andale mono', monospace;"><strong>Input:</strong> s1 = "allergy", s2 = "allergyy" <br></span><span style="font-size: 18.6667px; font-family: 'andale mono', monospace;"><strong>Output</strong>: false <br><strong>Explanation:</strong> Although the characters are mostly the same, s2 contains an extra 'y' character. Since the frequency of characters differs, the strings are not anagrams. </span></pre><pre dir="ltr"><span style="font-size: 18.6667px; font-family: 'andale mono', monospace;"><strong>Input:</strong> s1 = "listen", s2 = "lists" <br><strong>Output:</strong> false <br><strong>Explanation:</strong> The characters in the two strings are not the same — some are missing or extra. So, they are not anagrams.</span></pre>