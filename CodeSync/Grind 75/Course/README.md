# Course

- Platform: LintCode
- Language: Java
- Difficulty: Unknown
- Topics: Hash TableSort, Hash Table, Sort, Test Data Test Output
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.lintcode.com/problem/1883/description
- Synced: 2026-07-15T09:43:57.503Z

## Problem Description

Description Given a list of reviews, a list of keywords and an integer k . Find out the top k keywords that appear most frequently in different comments, and the k keywords are sorted according to the number of times. The comparison of strings is case-insensitive. If the mentioned times of keywords are the same in different reviews, list the keywords in alphabetical order. LintCode - Online Judge Solution Candidate Written Test Screening, Team Competency Assessment, Programming Teaching Exercises, Online Exam Grading WeChat for information 1 ≤ 𝑘 𝑒 𝑦 𝑤 𝑜 𝑟 𝑑 𝑠 . 𝑙 𝑒 𝑛 𝑔 𝑡 ℎ ≤ 100 1≤keywords.length≤100 1 ≤ 𝑟 𝑒 𝑣 𝑖 𝑒 𝑤 𝑠 . 𝑙 𝑒 𝑛 𝑔 𝑡 ℎ ≤ 1000 1≤reviews.length≤1000 keywords[i] consists of lowercase letters only reviews[i] consists of upper and lower case letters as well as the symbols "["、"\\"、"!"、"?"、","、";"、"."、"]" and the space " " If k is greater than the length of the list keywords, it means that all the keywords are sorted by the number of times they are in the comment Translated with DeepL.com (free version) Example Example 1: Input: k = 2 keywords = ["anacell", "cetracular", "betacellular"] reviews = [ "Anacell provides the best services in the city", "betacellular has awesome services", "Best services provided by anacell, everyone should use anacell", ] Output: ["anacell", "betacellular"] Explanation: "anacell" is occuring in 2 different reviews and "betacellular" is only occuring in 1 review. Example 2: Input: k = 2 keywords = ["anacell", "betacellular", "cetracular", "deltacellular", "eurocell"] reviews = [ "I love anacell Best services; Best services provided by anacell", "betacellular has great services", "deltacellular provides much better services than betacellular", "cetracular is worse than anacell", "Betacellular is better than deltacellular.", ] Output: ["betacellular", "anacell"] Explanation: "betacellular" is occuring in 3 different reviews. "anacell" and "deltacellular" are occuring in 2 reviews, but "anacell" is lexicographically smaller. Tags Related Problems 471 Top K Frequent Words Medium 550 Top K Frequent Words II Hard Recommend Courses ACM金牌逐行带刷班 最适合懒人的刷题课--躺平看算法大神在线coding，讲解思路+现场debug，手撕面试高频题

## Explanation

This solution was accepted on LintCode using Java. The detected topics are Hash TableSort, Hash Table, Sort, Test Data Test Output. Review the synced source file for the implementation details.
