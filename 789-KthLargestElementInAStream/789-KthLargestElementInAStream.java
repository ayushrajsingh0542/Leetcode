// Last updated: 15/08/2026, 19:59:25
class KthLargest {
    int K;
    ArrayList<Integer> list;
    public KthLargest(int k, int[] nums) {
        K=k;
        list=new ArrayList<>();
        for(int i:nums)
        list.add(i);
    }
    
    public int add(int val) {
        list.add(val);
        Collections.sort(list);
        return list.get(list.size()-K);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */