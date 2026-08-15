// Last updated: 15/08/2026, 19:46:16
class Solution {
    public boolean canMakeSubsequence(String s, String t) {
        int n=s.length(),m=t.length();

        int pre[]=new int[n];
        int suff[]=new int[n];

        int j=0;
        for(int i=0;i<n;i++)
            {
                while(j<m && t.charAt(j)!=s.charAt(i))
                    j++;
                pre[i]=j;
                if(j<m)
                    j++;
            }
        j=m-1;
        for (int i = n - 1; i >= 0; i--) {
            while (j >= 0 && t.charAt(j) != s.charAt(i)) j--;
            suff[i] = j;
            if (j >= 0) j--;
        }

        if(pre[n-1]<m)
        return true;

        for (int i = 0; i < n; i++) {
            int left = (i == 0) ? -1 : pre[i - 1];
            int right = (i == n - 1) ? m : suff[i + 1];

            if (left < m && right >= 0 && left + 1 < right)
                return true;
        }

        return false;
    }
}