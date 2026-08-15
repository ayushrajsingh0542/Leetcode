// Last updated: 15/08/2026, 20:09:37
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String arr[][]=new String[strs.length][2];
        int n=strs.length;
        for(int i=0;i<n;i++)
        {
            arr[i][0]=strs[i];
            arr[i][1]=Integer.toString(i);
        }

        for(int i=0;i<n;i++)
        {
            char c[]=arr[i][0].toCharArray();
            Arrays.sort(c);
            arr[i][0]=new String(c);
        }

        
        Arrays.sort(arr,(a,b)->{
            return a[0].compareTo(b[0]);
        });


        List<List<String>>ans=new ArrayList<>();
        List<String>list=new ArrayList<>();
        String last=arr[0][0];
        for(int i=0;i<n;i++)
        {
            if(last.equals(arr[i][0]))
            {
                int idx=Integer.valueOf(arr[i][1]);
                list.add(strs[idx]);
            }
            else
            {
                ans.add(list);
                list=new ArrayList<>();
                int idx=Integer.valueOf(arr[i][1]);
                list.add(strs[idx]);
                last=arr[i][0];
            }
        }
        ans.add(list);
        return ans;

    }
}