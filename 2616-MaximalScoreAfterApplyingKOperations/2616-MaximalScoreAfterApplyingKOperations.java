// Last updated: 15/08/2026, 19:51:20
// class Solution {
//     public long maxKelements(int[] nums, int k) {
//         if(nums.length==1)
//         {
//             return nums[0];
//         }
//        double nums2[]=new double[nums.length];
//         for(int i=0;i<nums.length;i++)
//         nums2[i]=nums[i];
//         Arrays.sort(nums2);
//         int j=nums2.length-1;
//         long score=0;
//        for(int i=1;i<=k;i++)
//         {
            
           
//             score+=nums2[j];
//             nums2[j]=Math.ceil(nums2[j]/3);
//             if(nums2[j-1]>nums2[j])
//             {
//                 j=j-1;
//             }
//             if(j==0)
//             {
//                 score+=nums2[j];
//                 break;
//             }
          
           
//         }
//         return score;
        
//     }
// }

class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int num : nums) {
            maxHeap.add(num);
        }
        
        long score = 0;

        for (int i = 0; i < k; i++) {
            int maxElement = maxHeap.poll();

            score += maxElement;

            int newElement = (int) Math.ceil(maxElement / 3.0);

            maxHeap.add(newElement);
        }
        
        return score;
    }
}