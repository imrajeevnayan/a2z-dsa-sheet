/*
 * Platform: GeeksforGeeks
 * Problem: Basic Information
 * URL: https://www.geeksforgeeks.org/profile/imrajeevnayan
 * Language: Java
 * Difficulty: Unknown
 * Topics: Uncategorized
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-09-09T12:40:34.126Z
 */

🔥 Graph DSA: Cycle Detection Pattern


Graph mein Cycle Detection ka matlab hai check karna ki graph mein koi aisa path hai ya nahi jahan hum ghoom kar wapas kisi already visited node par aa jaate hain.


🧠 Undirected Graph

Cycle detect karne ke liye BFS/DFS + Visited + Parent use kar sakte hain.

visited[] batata hai ki node pehle visit hua hai ya nahi.

parent batata hai ki hum current node par kis node se aaye hain.

Agar koi neighbor already visited hai aur woh parent nahi hai, toh cycle present hai.

🔥 Golden Rule

visited[neighbor] == true

        +

neighbor != parent

        ↓

      CYCLE


Example

    0

   / \

  1---2


Yahan:


0 → 1 → 2 → 0


Cycle hai ✅


Lekin simple graph:


0 --- 1 --- 2


mein cycle nahi hai ❌


🚨 Important


Sirf visited[] se undirected cycle detection nahi kar sakte.


Kyunki:


0 → 1


ke baad 1 ko 0 already visited milega.


Lekin 0 uska parent hai, isliye ye cycle nahi hai.


💡 Pattern Recognition


Agar question mein aaye:


"Detect cycle"

"Does graph contain a cycle?"

"Redundant connection"

"Circular connection"


→ Cycle Detection pattern ke baare mein socho.


📌 Common Problems

GFG — Detect Cycle in an Undirected Graph

LeetCode 684 — Redundant Connection

LeetCode 261 — Graph Valid Tree

🧠 One-Line Revision


Undirected Graph + Cycle → BFS/DFS + Visited + Parent


Already Visited Neighbor

        ↓

Is it Parent?

   ↙          ↘

 YES           NO

 ↓              ↓

Ignore         Cycle 🔥
