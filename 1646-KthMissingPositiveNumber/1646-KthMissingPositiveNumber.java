// Last updated: 15/08/2026, 19:54:24
class Solution {
    public int findKthPositive(int[] arr, int k) {
       for(int i : arr){
			if(i <= k) 
            k++; 
            
            else
            break;
		}
        return k;
    }
}