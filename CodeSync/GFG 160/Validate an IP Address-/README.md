# Validate an IP Address:-

- Platform: GeeksforGeeks
- Language: FUNCTION isValid(str): // Step 1: Check the length constraints IF length of str < 7 OR length of str > 15 THEN RETURN false // Step 2: Split the string by '.' SPLIT str by '.' INTO parts // Step 3: Check if there are exactly 4 parts IF length of parts != 4 THEN RETURN false // Step 4: Validate each part FOR EACH part IN parts: // Check if the part is empty or exceeds 3 characters IF part is empty OR length of part > 3 THEN RETURN false // Check for leading zeros (allow '0' as a valid part with one character) IF part starts with '0' AND length of part > 1 THEN RETURN false // Check if all characters are digits FOR EACH character IN part: IF character is NOT a digit THEN RETURN false // Convert part to integer number = CONVERT part TO integer // Check if the number is in the valid range IF number < 0 OR number > 255 THEN RETURN false // If all checks pass RETURN true
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags ZohoAmazonMicrosoftQualcomm, Company Tags, Zoho, Amazon, Microsoft, Qualcomm, Topic Tags
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/validate-an-ip-address-1587115621/1
- Synced: 2026-08-06T07:08:24.475Z

## Problem Description

You are given a string s in the form of an IPv4 Address. Your task is to validate an IPv4 Address, if it is valid return true otherwise return false. IPv4 addresses are canonically represented in dot-decimal notation, which consists of four decimal numbers, each ranging from 0 to 255, separated by dots, e.g., "172.16.254.1" A valid IPv4 Address is of the form x1.x2.x3.x4 where 0 <= (x1, x2, x3, x4) <= 255. Thus, we can write the generalized form of an IPv4 address as (0-255).(0-255).(0-255).(0-255) Note: Here we are considering numbers only from 0 to 255 and any additional leading zeroes will be considered invalid. Examples : Input: s = "222.111.111.111" Output: true Explanation: Here, the IPv4 address is as per the criteria mentioned and also all four decimal numbers lies in the mentioned range. Input: s = "5555..555" Output: false Explanation: "5555..555" is not a valid IPv4 address, as the middle two portions are missing. Input: s = "0.0.0.255" Output: true Constraints: 1 ≤ |s| ≤ 15

## Explanation

This solution was accepted on GeeksforGeeks using FUNCTION isValid(str): // Step 1: Check the length constraints IF length of str < 7 OR length of str > 15 THEN RETURN false // Step 2: Split the string by '.' SPLIT str by '.' INTO parts // Step 3: Check if there are exactly 4 parts IF length of parts != 4 THEN RETURN false // Step 4: Validate each part FOR EACH part IN parts: // Check if the part is empty or exceeds 3 characters IF part is empty OR length of part > 3 THEN RETURN false // Check for leading zeros (allow '0' as a valid part with one character) IF part starts with '0' AND length of part > 1 THEN RETURN false // Check if all characters are digits FOR EACH character IN part: IF character is NOT a digit THEN RETURN false // Convert part to integer number = CONVERT part TO integer // Check if the number is in the valid range IF number < 0 OR number > 255 THEN RETURN false // If all checks pass RETURN true. The detected topics are Expected Complexities, Company Tags ZohoAmazonMicrosoftQualcomm, Company Tags, Zoho, Amazon, Microsoft, Qualcomm, Topic Tags. Review the synced source file for the implementation details.
