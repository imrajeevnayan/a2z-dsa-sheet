class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        long totalOps = (long) k1 + (long) k2;
        int n = nums1.length;
        
        long[] diffs = new long[n];
        long maxDiff = 0;
        long sumDiffs = 0;
        
        for (int i = 0; i < n; i++) {
            diffs[i] = Math.abs((long) nums1[i] - (long) nums2[i]);
            maxDiff = Math.max(maxDiff, diffs[i]);
            sumDiffs += diffs[i];
        }
        
        // Edge case: Agar saare differences 0 kar sakte hain
        if (totalOps >= sumDiffs) return 0L;
        
        // Binary Search on final max difference
        long left = 0, right = maxDiff;
        
        while (left < right) {
            long mid = left + (right - left) / 2;
            
            long opsNeeded = 0;
            for (long d : diffs) {
                if (d > mid) {
                    opsNeeded += (d - mid);
                }
            }
            
            if (opsNeeded <= totalOps) {
                right = mid; 
            } else {
                left = mid + 1;
            }
        }
        
        long threshold = left;
        long remainingOps = totalOps;
        long result = 0;
        
        // ✅ FINAL FIX: Ab UN elements ko bhi include karo jo EXACTLY threshold par hain
        // Kyunki bachi hui ops inpar bhi lagani padengi uniform distribution ke liye
        List<Long> candidates = new ArrayList<>();
        
        for (long d : diffs) {
            if (d > threshold) {
                // Jo threshold se upar hain, unhe pehle threshold tak lao
                remainingOps -= (d - threshold);
                candidates.add(threshold); // Ab ye threshold level par aa gaya
            } else if (d == threshold) {
                // ✅ YE LINE MISSING THI! Exactly threshold wale elements bhi add karo
                candidates.add(threshold);
            } else {
                // Jo already threshold se kam hain, unka square add karo
                result += d * d;
            }
        }
        
        // Ab 'candidates' list mein wo saare elements hain jo currently 'threshold' value par hain
        // Aur inpar 'remainingOps' apply karni hain uniformly
        if (!candidates.isEmpty()) {
            long fullReductions = remainingOps / candidates.size();
            long remainder = remainingOps % candidates.size();
            
            for (int i = 0; i < candidates.size(); i++) {
                long val = threshold - fullReductions;
                if (i < remainder) val--; // Pehle 'remainder' elements ko 1 extra reduction
                
                val = Math.max(0, val); // Negative check (safety)
                result += val * val;
            }
        }
        
        return result;
    }
}