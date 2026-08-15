// Last updated: 15/08/2026, 20:04:36
class Solution {
    public static int[] calc(int prime[]) {
        int n = prime.length;
        for (int i = 2; i  < n; i++) {
            if (prime[i] != 0) {
                for (int j = i * 2; j < n; j += i) {
                    prime[j] = 0;
                }
            }
        }
        return prime;
    }

    public int countPrimes(int n) {
        if (n <= 2) return 0;

        int[] prime = new int[n]; // count primes < n
        Arrays.fill(prime, 1);
        prime[0] = 0;
        prime[1] = 0;

        calc(prime);

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (prime[i] == 1) count++;
        }

        return count;
    }
}
