/*
 * Platform: TakeUForward
 * Problem: Balanced Paranthesis
 * URL: https://takeuforward.org/practice/dsa/balanced-paranthesis
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Explore, My Spaces, Dashboard, Prep Hub, DSA, SQL, Planly
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-09-25T07:53:09.172Z
 */

char top=st.pop();
                if(ch==')'&& top  !='(' ||
                   ch=='}'&& top !='{' ||
                   ch==']'&& top  !='['
                ) return false;
                if(st.isEmpty()) return false;
            }
            else{
        }
        return st.isEmpty();
    }
}
