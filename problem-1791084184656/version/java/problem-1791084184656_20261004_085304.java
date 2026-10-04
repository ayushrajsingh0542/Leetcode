// Last updated: 04/10/2026, 08:53:04
1class Solution {
2    public long maxAlternatingSum(int[] nums) {
3        long even = Long.MIN_VALUE / 2;
4        long odd = Long.MIN_VALUE / 2;
5        long deletedEven = Long.MIN_VALUE / 2;
6        long deletedOdd = Long.MIN_VALUE / 2;
7
8        long answer = Long.MIN_VALUE;
9
10        for (int num : nums) {
11            long newEven = num;
12            long newOdd = Long.MIN_VALUE / 2;
13            long newDeletedEven = Long.MIN_VALUE / 2;
14            long newDeletedOdd = Long.MIN_VALUE / 2;
15
16            newEven = Math.max(newEven, odd + num);
17            newOdd = Math.max(newOdd, even - num);
18
19            newDeletedEven = Math.max(newDeletedEven, deletedOdd + num);
20            newDeletedOdd = Math.max(newDeletedOdd, deletedEven - num);
21
22            newDeletedEven = Math.max(newDeletedEven, even);
23            newDeletedOdd = Math.max(newDeletedOdd, odd);
24
25            even = newEven;
26            odd = newOdd;
27            deletedEven = newDeletedEven;
28            deletedOdd = newDeletedOdd;
29
30            answer = Math.max(answer, even);
31            answer = Math.max(answer, odd);
32            answer = Math.max(answer, deletedEven);
33            answer = Math.max(answer, deletedOdd);
34        }
35
36        return answer;
37    }
38}