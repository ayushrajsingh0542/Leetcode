// Last updated: 15/08/2026, 21:05:09
1class Solution {
2    public int kthDigit(long k) {
3        if (k <= 9) {
4            return (int) k;
5        }
6
7        k -= 9;
8
9        long power = 1;
10
11        for (int d = 1; ; d++) {
12            long count = 9 * power;
13            long blockLength = 10L * (d + 1);
14            long total = count * blockLength;
15
16            if (k > total) {
17                k -= total;
18                power *= 10;
19            } else {
20                long blockIndex = (k - 1) / blockLength;
21                long insideBlock = (k - 1) % blockLength;
22
23                long b = power + blockIndex;
24
25                long numberIndex = insideBlock / (d + 1);
26                int digitIndex = (int) (insideBlock % (d + 1));
27
28                long number;
29
30                if (b % 2 == 0) {
31                    number = 10 * b + numberIndex;
32                } else {
33                    number = 10 * b + 9 - numberIndex;
34                }
35
36                String str = String.valueOf(number);
37
38                return str.charAt(digitIndex) - '0';
39            }
40        }
41    }
42}