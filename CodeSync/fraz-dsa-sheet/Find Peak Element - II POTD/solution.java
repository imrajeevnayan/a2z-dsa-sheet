/*
 * Platform: TakeUForward
 * Problem: Find Peak Element - II POTD
 * URL: https://takeuforward.org/practice/dsa/find-peak-element-ii
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Explore, My Spaces, Dashboard, Prep Hub, DSA, SQL, Planly
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-09-24T19:23:26.494Z
 */

// Right bada hai → right side jao
            else {
                left = mid + 1;
            }
        }

        return new int[]{-1, -1};
    }
}
