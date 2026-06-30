# Sieve of Eratosthenes

- Platform: GeeksforGeeks
- Language: #include <iostream> #include <vector> using namespace std; bool isPrime(int num) { if (num < 2) return false; for (int i = 2; i * i <= num; i++) { if (num % i == 0) return false; } return true; } vector<int> sieve(int n) { vector<int> res; for (int i = 2; i <= n; i++) { if (isPrime(i)) { res.push_back(i); } } return res; } int main() { int n = 35; vector<int> res = sieve(n); for (auto ele : res) { cout << ele << ' '; } return 0; }
- Difficulty: Unknown
- Topics: Qualcomm, VMWare, MAQ Software, GE, sieve, Prime Number, number-theory, Summer SkillUp Explore
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/dsa/sieve-of-eratosthenes/
- Synced: 2026-06-30T09:05:44.249Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using #include <iostream> #include <vector> using namespace std; bool isPrime(int num) { if (num < 2) return false; for (int i = 2; i * i <= num; i++) { if (num % i == 0) return false; } return true; } vector<int> sieve(int n) { vector<int> res; for (int i = 2; i <= n; i++) { if (isPrime(i)) { res.push_back(i); } } return res; } int main() { int n = 35; vector<int> res = sieve(n); for (auto ele : res) { cout << ele << ' '; } return 0; }. The detected topics are Qualcomm, VMWare, MAQ Software, GE, sieve, Prime Number, number-theory, Summer SkillUp Explore. Review the synced source file for the implementation details.
