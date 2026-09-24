/*
 * Platform: TakeUForward
 * Problem: Detect a loop in LL
 * URL: https://takeuforward.org/practice/dsa/detect-a-loop-in-ll
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Explore, My Spaces, Dashboard, Prep Hub, DSA, SQL, Planly
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-09-24T20:02:28.201Z
 */

// Slow 1 step
            slow = slow.next;
            // Fast 2 steps
            fast = fast.next.next;

            // Agar dono mil gaye to cycle hai
            if (slow == fast) {
                return true;
            }
        }

        // Fast null tak pahunch gaya
        // Matlab cycle nahi hai
