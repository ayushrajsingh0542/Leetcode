// Last updated: 28/08/2026, 18:59:55
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int ans[] = new int[2];
4        ans[0] = ans[1] = -1;
5
6        int n = nums.length;
7        if (n == 0)
8            return ans;
9
10        int l = 0, r = n - 1;
11
12        // Find any occurrence
13        while (l <= r) {
14            int mid = l + (r - l) / 2;
15
16            if (nums[mid] == target) {
17                ans[0] = mid;
18                break;
19            } else if (nums[mid] > target) {
20                r = mid - 1;
21            } else {
22                l = mid + 1;
23            }
24        }
25
26        if (ans[0] == -1)
27            return ans;
28
29        // Find last occurrence
30        l = ans[0];
31        r = n - 1;
32
33        while (l <= r) {
34            int mid = l + (r - l) / 2;
35
36            if (nums[mid] == target) {
37                ans[1] = mid;
38                l = mid + 1; // keep searching right
39            } else if (nums[mid] > target) {
40                r = mid - 1;
41            } else {
42                l = mid + 1;
43            }
44        }
45
46        // Find first occurrence
47        l = 0;
48        r = ans[0];
49
50        while (l <= r) {
51            int mid = l + (r - l) / 2;
52
53            if (nums[mid] == target) {
54                ans[0] = mid; // ans[0], not ans[1]
55                r = mid - 1;  // keep searching left
56            } else if (nums[mid] > target) {
57                r = mid - 1;
58            } else {
59                l = mid + 1;
60            }
61        }
62
63        return ans;
64    }
65}