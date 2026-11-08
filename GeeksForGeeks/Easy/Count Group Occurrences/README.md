# Count Group Occurrences

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/count-the-characters1821/1)

## Solved On
09 Nov 2026 at 12:39 am

<h2><a href="https://www.geeksforgeeks.org/problems/count-the-characters1821/1">Count Group Occurrences</a></h2><h3>Difficulty Level: Easy</h3><hr><p data-pm-slice="1 1 []"><span style="font-size: 14pt;">Given a string <strong>s</strong> and an integer <strong>k</strong>, count the number of distinct characters that appear in exactly <strong>k groups</strong> in the string.</span></p><p><span style="font-size: 14pt;">A group is defined as one or more consecutive occurrences of the same character. For example, in the string "aaabbcca", the groups are "aaa", "bb", "cc" and "a".</span></p><p><span style="font-size: 18px;"><strong>Examples:</strong></span></p><pre data-pm-slice="1 1 []"><span style="font-size: 14pt;"><strong>Input:</strong> s = "abc", k = 1</span><br><span style="font-size: 14pt;"><strong>Output:</strong> 3</span><br><span style="font-size: 14pt;"><strong>Explanation:</strong> The characters 'a', 'b' and 'c' each appear in exactly one group.</span></pre><pre data-pm-slice="1 1 []"><span style="font-size: 14pt;"><strong>Input:</strong> s = "geeksforgeeks", k = 2</span><br><span style="font-size: 14pt;"><strong>Output:</strong> 4</span><br><span style="font-size: 14pt;"><strong>Explanation:</strong> The characters 'g', 'e', 'k' and 's' each appear in exactly two groups.</span></pre><pre data-pm-slice="1 1 []"><span style="font-size: 14pt;"><strong>Input:</strong> s = "aaaaa", k = 2</span><br><span style="font-size: 14pt;"><strong>Output:</strong> 0</span><br><span style="font-size: 14pt;"><strong>Explanation:</strong> The character 'a' appears in only one group, so no character appears in exactly two groups.</span></pre>