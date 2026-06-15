# Optimal Greedy Approach !

- Platform: GeeksforGeeks
- Language: from heapq import heappush, heappop class Solution: def activitySelection(self, start, finish): #code here heap = [] # stores [(finish[i], start[i]), ...] for i in range(len(start)): heappush(heap, (finish[i], start[i])) count = 0 last_finish_time = -1 while heap: f, s = heappop(heap) if s > last_finish_time: count += 1 last_finish_time = f # print(f'added {(s, f)}') return count ''' constraints: start.size() = finish.size() Input: start[] = [1, 3, 0, 5, 8, 5] finish[] = [2, 4, 6, 7, 9, 9] Output: 4 explanation 1 -> 2 3 -> 4 5 -> 7 8 -> 9 logs: added (1, 2) added (3, 4) added (5, 7) added (8, 9) result: 4 '''
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Flipkart, Morgan Stanley, Facebook, NPCI, Cisco, Microsoft
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/activity-selection-1587115620/1
- Synced: 2026-06-15T02:32:38.158Z

## Problem Description

Given a set of activities, each with a start time and a finish time, represented by the arrays start[] and finish[], respectively. A single person can perform only one activity at a time, meaning no two activities can overlap. Your task is to determine the maximum number of activities that a person can complete in a day. Note: Start time and finish time cannot overlap, i.e., if a person finishes an activity at time x, then they cannot start another activity at time x. Examples: Input: start[] = [1, 3, 0, 5, 8, 5], finish[] = [2, 4, 6, 7, 9, 9] Output: 4 Explanation: A person can perform at most four activities. The maximum set of activities that can be executed is {0, 1, 3, 4} Input: start[] = [10, 12, 20], finish[] = [20, 25, 30] Output: 1 Explanation: A person can perform at most one activity. Input: start[] = [1, 3, 2, 5], finish[] = [2, 4, 3, 6] Output: 3 Explanation: A person can perform activities 0, 1 and 3. Constraints: 1 ≤ start.size() = finish.size() ≤ 2*105 0 ≤ start[i] ≤ finish[i] ≤ 109

## Explanation

This solution was accepted on GeeksforGeeks using from heapq import heappush, heappop class Solution: def activitySelection(self, start, finish): #code here heap = [] # stores [(finish[i], start[i]), ...] for i in range(len(start)): heappush(heap, (finish[i], start[i])) count = 0 last_finish_time = -1 while heap: f, s = heappop(heap) if s > last_finish_time: count += 1 last_finish_time = f # print(f'added {(s, f)}') return count ''' constraints: start.size() = finish.size() Input: start[] = [1, 3, 0, 5, 8, 5] finish[] = [2, 4, 6, 7, 9, 9] Output: 4 explanation 1 -> 2 3 -> 4 5 -> 7 8 -> 9 logs: added (1, 2) added (3, 4) added (5, 7) added (8, 9) result: 4 '''. The detected topics are Expected Complexities, Company Tags, Flipkart, Morgan Stanley, Facebook, NPCI, Cisco, Microsoft. Review the synced source file for the implementation details.
