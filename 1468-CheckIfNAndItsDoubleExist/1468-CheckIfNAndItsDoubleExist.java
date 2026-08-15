// Last updated: 15/08/2026, 19:55:08
class Solution {
    public boolean checkIfExist(int[] arr) {

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            
            map.put(arr[i],i);
        }
        for(int i=0;i<arr.length;i++)
        {
            
            int num=2*arr[i];
            if(map.containsKey(num) && map.get(num)!=i)
            {
                return true;
            }
            
        }
        return false;
        
    }
}