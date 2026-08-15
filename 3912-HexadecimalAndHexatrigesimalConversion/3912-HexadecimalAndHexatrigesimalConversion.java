// Last updated: 15/08/2026, 19:49:01
class Solution {
    public String concatHex36(int n) {
        int n2 = n*n;
        int n3 = n2*n;

        String hex1 = Integer.toString(n2, 16).toUpperCase(); 
        String hex36To = Integer.toString(n3, 36).toUpperCase();

        return hex1 + hex36To;
    }
}