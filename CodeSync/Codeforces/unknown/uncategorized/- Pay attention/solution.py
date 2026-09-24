# Platform: Codeforces
# Problem: → Pay attention
# URL: https://codeforces.com/top
# Language: Python 3
# Difficulty: Unknown
# Topics: Uncategorized
# Runtime: N/A
# Memory: N/A
# Synced: 2026-09-24T04:05:24.958Z

#include <bits/stdc++.h>
using namespace std;

void solve() {
    int N; cin >> N;
    int a, b, c; cin >> a >> b >> c;
    int m = min({a,b,c});
    cout << N-m << endl;
}

int main() {
    int T; cin >> T;
    while (T--) {solve();}
}
