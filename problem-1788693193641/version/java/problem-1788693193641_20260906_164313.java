// Last updated: 06/09/2026, 16:43:13
1class Solution {
2    public int countSpecialIntegers(int[] nums) {
3         HashMap<Integer, int[]> map = new HashMap<>();
4
5        for (int i = 0; i < nums.length; i++) {
6            int x = nums[i];
7
8            if (!map.containsKey(x)) {
9                
10                map.put(x, new int[]{1, i, 0, 1});
11            } else {
12                int[] arr = map.get(x);
13
14                int cdiff = i - arr[1];
15
16                if (arr[0] == 1) {
17                    arr[2] = cdiff;
18                } else if (cdiff != arr[2]) {
19                    arr[3] = 0;
20                }
21
22                arr[0]++;
23                arr[1] = i;
24            }
25        }
26
27        int ans = 0;
28
29        for (int[] arr : map.values()) {
30            if (arr[0] >= 3 && arr[3] == 1) {
31                ans++;
32            }
33        }
34
35        return ans;
36    }
37}