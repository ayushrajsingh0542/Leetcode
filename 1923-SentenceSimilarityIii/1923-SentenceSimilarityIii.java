// Last updated: 15/08/2026, 19:53:08
class Solution {
    public boolean areSentencesSimilar(String s1, String s2) {

       
        String arr1[]=s1.split(" ");
        String arr2[]=s2.split(" ");
        int s1s=0;
        int s2s=0;
        int s1e=arr1.length-1;
        int s2e=arr2.length-1;
        while(s1s<=s1e && s2s<=s2e && arr1[s1s].equals(arr2[s2s]))
        {
            s1s++;
            s2s++;
        }
        while(s1e>=s1s && s2e>=s2s && arr1[s1e].equals(arr2[s2e]))
        {
            s1e--;
            s2e--;
        }

        return s1e<s1s || s2e<s2s;

        
    }
}