// Last updated: 15/08/2026, 19:51:27
class Solution {
    public long dividePlayers(int[] skill) {

        Arrays.sort(skill);
        int i=0;
        int j=skill.length-1;
        long ans=0;
        int ans2=skill[0]+skill[skill.length-1];
        while(i<j)
        {
            if(ans2!=skill[i]+skill[j])
            return -1;
           ans+=skill[i]*skill[j];
           i++;
           j--;
        }
        return ans;
    }
}