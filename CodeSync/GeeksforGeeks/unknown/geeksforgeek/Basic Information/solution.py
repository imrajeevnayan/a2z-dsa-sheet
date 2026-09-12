# Platform: GeeksforGeeks
# Problem: Basic Information
# URL: https://www.geeksforgeeks.org/profile/imrajeevnayan
# Language: Python
# Difficulty: Unknown
# Topics: GeeksForGeeks, GFG, DSA, Java, 2DArray, Matrix, DSAJourney, CodingJourney
# Runtime: N/A
# Memory: N/A
# Synced: 2026-09-11T17:42:28.278Z

🚀 Sliding Window Pattern — Quick Master Guide

➤Sliding Window is one of the most important DSA patterns for LeetCode, GFG and interviews.

Goal: Question dekho → pattern identify karo → window maintain karo → expand/shrink karo.

🧠 How to Identify?

Sliding Window ka strong signal:

🔹Subarray / Substring

🔹Contiguous / Consecutive

🔹Longest / Shortest

🔹Maximum / Minimum Count

🔹 At most K / Exactly K

Ask:"Can I represent the answer as one continuous window [l...r]?"

🟢 1. Fixed Size Window

Window size = K.

Pattern:
➡️ Add right

🎯 Size == K → answer

⬅️ Remove left

for (int r = 0; r < n; r++) {

    add(arr[r]);

if (r-l+1 == k) {

        update();
remove(arr[l]);

        l++;

    }

}

🔹Maximum Sum Subarray of Size K

🔹Maximum Average Subarray

🔹Maximum Vowels in K-length Window

🔹First Negative in Every Window

🔹Sliding Window Maximum


🟡 2. Longest Valid Window


Window invalid hone par shrink karo.


for (int r = 0; r < n; r++) {

    add(arr[r]);


    while (invalid()) {

        remove(arr[l]);

        l++;

    }


    ans = max(ans, r-l+1);

}


Practice:


Longest Substring Without Repeating Characters

Fruit Into Baskets

At Most K Distinct Characters

Max Consecutive Ones III


🔴 3. Shortest Valid Window


Valid hote hi answer update + shrink.


for (int r = 0; r < n; r++) {

    add(arr[r]);


    while (valid()) {

        ans = min(ans, r-l+1);


        remove(arr[l]);

        l++;

    }

}


Practice:


Minimum Size Subarray Sum

Minimum Window Substring


🔵 4. Frequency Map Window


String problems mein:


freq[s[r]]++;


while (freq.size() > k) {

    freq[s[l]]--;


    if (freq[s[l]] == 0)

        freq.erase(s[l]);


    l++;

}


Practice:


Longest Substring Without Repeating Characters

Fruit Into Baskets

Find All Anagrams

Permutation in String


🔥 5. At Most K / Exactly K


Very important trick:


Exactly K

= AtMost(K) - AtMost(K-1)


Example:


Exactly 3

= AtMost(3) - AtMost(2)


Practice:


Subarrays with K Different Integers

Binary Subarrays With Sum

Number of Nice Subarrays


🧮 6. Counting Windows


Agar current window valid hai:


[l ........ r]


Valid subarrays ending at r:


r - l + 1


So:


ans += r-l+1;


Useful for counting problems.


⚡ 7. Advanced


Sliding Window + Deque:


Sliding Window Maximum

Sliding Window Minimum

Shortest Subarray with Sum at Least K


⚠️ When NOT to use normal Sliding Window?


Negative numbers + exact sum often breaks normal sum-based window.


Think:


Prefix Sum + HashMap


🏆 Must-Solve Order


Maximum Sum Subarray of Size K

First Negative in Every Window

Minimum Size Subarray Sum

Longest Substring Without Repeating Characters

Fruit Into Baskets

At Most K Distinct

Max Consecutive Ones III

Longest Repeating Character Replacement

Binary Subarrays With Sum

Subarrays with K Different Integers

Find All Anagrams

Permutation in String

Minimum Window Substring

Sliding Window Maximum


🧠 Final Cheat Sheet


Fixed K:

➡️ Add → Answer → Remove


Longest:

➡️ Expand → Invalid → Shrink → Max


Shortest:

➡️ Expand → Valid → Min → Shrink


Count:

➡️ Valid → ans += window length


Exactly K:

➡️ AtMost(K) - AtMost(K-1)


🔥 Master the pattern, not the problem!
