// Last updated: 15/08/2026, 20:10:18
class Solution {
    public int divide(int dividend, int divisor) {
        
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
         if (dividend == Integer.MAX_VALUE-1 && divisor == -1) {
            return Integer.MIN_VALUE+1;
        }
        
        // Handle the case where dividend and divisor are equal
        if (dividend == divisor) return 1;
        
        // Determine the sign of the result
        boolean sign = (dividend >= 0 && divisor >= 0) || (dividend < 0 && divisor < 0);
        
        // Work with absolute values to simplify the division logic
        long d = Math.abs((long)divisor);
        long n = Math.abs((long)dividend);
       
        long count = 0;
        while (n >= d) {
            int ans = 0; // Reset ans for each iteration
            // Find the largest multiple of d that can be subtracted from n
            while (n >= (d << (ans + 1))) {
                ans++;
            }
            // Add the multiple to the result
            count += (1 << ans);
            // Subtract the largest multiple of d from n
            n -= (d << ans);
        }
         return sign ? (int)count : -(int)count;
    }

}