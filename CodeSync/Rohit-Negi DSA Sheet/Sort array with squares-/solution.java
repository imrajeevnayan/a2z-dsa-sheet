/*
 * Platform: InterviewBit
 * Problem: Sort array with squares!
 * URL: https://www.interviewbit.com/problems/sort-array-with-squares/
 * Language: Java
 * Difficulty: Easy
 * Topics: Programming, Arrays, Description, Discussion, Submissions, Hints, Pick from both sides! Very Easy, Solutions Thread in Discussions
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-18T03:58:57.910Z
 */

while (left <= right) {
            int leftSquare = A.get(left) * A.get(left);
            int rightSquare = A.get(right) * A.get(right);
            
            // Jo square bada hai, ushe result ke current index pe daalo
            if (leftSquare > rightSquare) {
                result.set(index, leftSquare);
                left++;
            } else {
                result.set(index, rightSquare);
                right--;
            }
            index--;
        }
        
        return result;
    }
}
