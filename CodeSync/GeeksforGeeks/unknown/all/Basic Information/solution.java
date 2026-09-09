/*
 * Platform: GeeksforGeeks
 * Problem: Basic Information
 * URL: https://www.geeksforgeeks.org/profile/imrajeevnayan
 * Language: Java
 * Difficulty: Unknown
 * Topics: Uncategorized
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-09-08T13:14:04.238Z
 */

🚀 Graph DSA — Pattern Wise Roadmap for Freshers

Agar tum Graph DSA mein bilkul beginner ho, toh random LeetCode questions solve mat karo.


Graph ko patterns mein divide karo.


                         GRAPH

                           │

             ┌─────────────┴─────────────┐

             │                           │

       Representation                Traversal

             │                           │

       ┌─────┴─────┐                ┌────┴────┐

       │           │                │         │

 Adjacency List  Matrix             DFS       BFS

                                      │         │

                         ┌────────────┘         └─────────────┐

                         │                                    │

                  Components                            Shortest Path

                         │                                    │

                 Cycle Detection                       0/1 BFS

                         │                                    │

                 Bipartite Graph                       Dijkstra

                         │                                    │

                  Topological Sort                     Bellman Ford

                         │                                    │

                    DSU / Union Find                    Floyd Warshall

                         │

                    MST / Kruskal


🧠 PHASE 0 — Graph ko samjho


Sabse pehle ye samjho:


Graph = Nodes + Edges


       1

      / \

     2   3

     |   |

     4---5


Node / Vertex = 1,2,3,4,5

Edge = connection

Directed graph = 1 → 2

Undirected graph = 1 ↔ 2

Weighted graph = edge ke saath cost

🟢 PATTERN 1 — Graph Representation

Concept


Input:


edges = [

    [0,1],

    [0,2],

    [1,3]

]


Convert into:


0 → [1,2]

1 → [0,3]

2 → [0]

3 → [1]


Java:


List<List<Integer>> adj = new ArrayList<>();


for (int i = 0; i < V; i++) {

    adj.add(new ArrayList<>());

}


Undirected edge:


adj.get(u).add(v);

adj.get(v).add(u);


Practice

GFG — Graph Adjacency List

LeetCode 1971 — Find if Path Exists in Graph

🟢 PATTERN 2 — DFS


DFS ka basic idea:


Start

  ↓

Go deep

  ↓

Neighbour

  ↓

Neighbour

  ↓

Backtrack


Example:


        0

       / \

      1   2

     / \

    3   4


DFS:


0 → 1 → 3 → 4 → 2


DFS ke 2 implementations

1️⃣ Recursive DFS

DFS(node)

   │

   ├── mark visited

   │

   └── visit neighbours


2️⃣ Iterative DFS

        Stack

          │

          ↓

        node

          │

      ┌───┴───┐

      ↓       ↓

 neighbour  neighbour


Java:


Stack<Integer> stack = new Stack<>();


stack.push(0);

visited[0] = true;


while (!stack.isEmpty()) {


    int node = stack.pop();


    for (int next : adj.get(node)) {


        if (!visited[next]) {


            visited[next] = true;

            stack.push(next);

        }

    }

}


Important


Stack mein reverse order DFS ke liye mandatory nahi hai.


Reverse tab karte hain jab expected traversal order ko recursive DFS/adjacency order ke saath match karna ho.


Practice

GFG — DFS of Graph

LeetCode 1971 — Find if Path Exists in Graph

LeetCode 200 — Number of Islands

LeetCode 733 — Flood Fill

🟢 PATTERN 3 — Grid = Graph


Ye Graph DSA ka extremely important pattern hai.


Grid:


1 1 0

1 0 0

0 0 1


Har cell ko node samjho.


(0,0) ---- (0,1)

  |

  |

(1,0)


Neighbours:


        UP

         ↑

         |

LEFT ← CELL → RIGHT

         |

         ↓

       DOWN


Usually:


int[][] directions = {

    {-1, 0},

    { 1, 0},

    { 0,-1},

    { 0, 1}

};


Practice

LeetCode 200 — Number of Islands

LeetCode 695 — Max Area of Island

LeetCode 733 — Flood Fill

LeetCode 130 — Surrounded Regions

LeetCode 994 — Rotting Oranges

🔥 PATTERN 4 — Connected Components


Question:


Kitne separate groups hain?


Graph:


  0---1       3---4

  |           |

  2           5


Components:


Component 1:

0,1,2


Component 2:

3,4,5


Answer:


2


Algorithm:


for every node:


    if not visited:


        count++


        DFS/BFS(node)


Golden template:


int components = 0;


for (int i = 0; i < n; i++) {


    if (!visited[i]) {


        components++;


        dfs(i);

    }

}


Practice

LeetCode 323 — Number of Connected Components

LeetCode 200 — Number of Islands

LeetCode 547 — Number of Provinces

LeetCode 695 — Max Area of Island

🔥 PATTERN 5 — Cycle Detection


Graph:


    0

   / \

  1---2


Yahan cycle hai:


0 → 1 → 2 → 0


Cycle detection alag hoti hai for:


Undirected Graph


and


Directed Graph


Undirected


Parent concept important:


        0

       / \

      1   2


DFS:


current

   ↓

neighbour

   ↓

if visited neighbour

AND neighbour != parent

   ↓

CYCLE


Directed


Yahan:


visited[]


alone enough nahi hota.


Use:


visited

+

recursion stack / current path


Concept:


0 → 1 → 2

    ↑   |

    └───┘


Agar current DFS path mein node dobara mil gaya:


Cycle exists


Practice

GFG — Detect Cycle in Undirected Graph

LeetCode 684 — Redundant Connection

LeetCode 207 — Course Schedule

LeetCode 210 — Course Schedule II

🟢 PATTERN 6 — BFS


DFS:


Go deep


BFS:


Go level by level


Graph:


        0

      /   \

     1     2

    / \     \

   3   4     5


BFS:


Level 0 → 0

Level 1 → 1,2

Level 2 → 3,4,5


BFS uses:


QUEUE


Java:


Queue<Integer> q = new LinkedList<>();


q.offer(0);

visited[0] = true;


while (!q.isEmpty()) {


    int node = q.poll();


    for (int next : adj.get(node)) {


        if (!visited[next]) {


            visited[next] = true;

            q.offer(next);

        }

    }

}


Practice

GFG — BFS of Graph

LeetCode 102 — Binary Tree Level Order Traversal

LeetCode 752 — Open the Lock

🔥 PATTERN 7 — Shortest Path in Unweighted Graph


Golden rule:


Unweighted Graph

       +

Minimum edges

       ↓

      BFS


Diagram:


        0

       / \

      1   2

      |   |

      3---4


From 0:


distance[0] = 0


distance[1] = 1

distance[2] = 1


distance[3] = 2

distance[4] = 2


Practice

GFG — Shortest Path from 1 to N

LeetCode 1971

LeetCode 127 — Word Ladder

LeetCode 1091 — Shortest Path in Binary Matrix

🔥 PATTERN 8 — Multi-Source BFS


Normal BFS:


One source

   ↓

BFS


Multi-source:


Source A ─┐

Source B ─┼→ Queue → BFS

Source C ─┘


Example:


1 0 0

0 0 0

0 0 1


Both 1s are sources.


Queue initially:


[all sources]


Then BFS simultaneously expands from all of them.
