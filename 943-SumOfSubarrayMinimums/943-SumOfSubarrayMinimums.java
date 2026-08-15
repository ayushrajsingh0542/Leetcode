// Last updated: 15/08/2026, 19:58:33
class Solution {
    public static int[] nextSm(int arr[])
    {
        Stack<Integer> s=new Stack<>();
        int nse[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!s.isEmpty() && arr[s.peek()]>=arr[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nse[i]=arr.length;
            }
            else
            {
                nse[i]=s.peek();
            }
            s.push(i);
        }
        return nse;
    }
    public static int[] preSmee(int arr[])
    {
        Stack<Integer> s=new Stack<>();
        int psee[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            while(!s.isEmpty() && arr[s.peek()]>arr[i])
            {
               s.pop();
            }
            if(s.isEmpty())
            {
                psee[i]=-1;
            }
            else
            {
                psee[i]=s.peek();
            }
            s.push(i);
        }
        return psee;
    }
    public int sumSubarrayMins(int[] arr) {
        int nse[]=new int[arr.length];
        int psee[]=new int[arr.length];
        int MOD=(int)(1e9+7);
        nse=nextSm(arr);
        psee=preSmee(arr);
        long ans=0;
        for(int i=0;i<arr.length;i++)
        {
            long left=i-psee[i];
            long right=nse[i]-i;
            ans = (ans + ((long) left * right % MOD) * arr[i] % MOD) % MOD;


        }
        return (int)ans;
        
    }
}