// Last updated: 15/08/2026, 19:48:58
class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        List<Integer>list=Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);
        set.addAll(list);
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
            {
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        for(int k:map.keySet())
            {
                if(set.contains(map.get(k)))
                {
                    return true;
                }
            }
        return false;
    }
}