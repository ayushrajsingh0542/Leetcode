// Last updated: 15/08/2026, 20:05:38
class Solution {

    
    public int[] twoSum(int[] numbers, int target) {
        
        int lp=0;
        int rp=numbers.length-1;

        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[lp]+numbers[rp]==target)
            {
                break;
            }
            if(numbers[lp]+numbers[rp]<target)
            {
                lp++;
            }
            else
            {
                rp--;
            }
        }

       int arr[]=new int[2];
       arr[0]=lp+1;
       arr[1]=rp+1;
       return arr;
    }
}