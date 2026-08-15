// Last updated: 15/08/2026, 20:02:12
class Solution {
    public String frequencySort(String s) {

        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int ans[][]=new int[map.size()][2];
        int i=0;
        for(Character k:map.keySet())
        {
            ans[i][0]=(int)k;
            ans[i][1]=map.get(k);
            i++;
        }
        String finalans="";
        Arrays.sort(ans,Comparator.comparingDouble(o->o[1]));
        for(i=ans.length-1;i>=0;i--)
        {
        //    finalans+=(char)(ans[i][0]);
            int m=ans[i][1];
            for(int j=0;j<m;j++){
                finalans+=(char)ans[i][0];
            }
        }
        return finalans;
        
    }
}