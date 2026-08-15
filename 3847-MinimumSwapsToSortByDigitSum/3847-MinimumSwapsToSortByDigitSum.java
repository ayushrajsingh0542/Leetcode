// Last updated: 15/08/2026, 19:49:27
class Solution {

        private static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int minSwaps(int[] nums) {
        int n = nums.length;

        // Step 1: Build a list of objects holding digit sum, number value, and original index
        List<int[]> items = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            items.add(new int[]{digitSum(nums[i]), nums[i], i});
        }

        // Step 2: Sort based on digit sum, then value
        items.sort((a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]); // Compare digit sums
            return Integer.compare(a[1], b[1]);                   // If equal, compare values
        });

        // Step 3: Create a mapping from original index to sorted index
        int[] indexMap = new int[n]; // indexMap[originalIndex] = sortedIndex
        for (int sortedIndex = 0; sortedIndex < n; sortedIndex++) {
            int originalIndex = items.get(sortedIndex)[2];
            indexMap[originalIndex] = sortedIndex;
        }

        // Step 4: Count cycles in indexMap to compute minimum number of swaps
        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || indexMap[i] == i) continue;

            int cycleSize = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = indexMap[j];
                cycleSize++;
            }

            if (cycleSize > 1) {
                swaps += (cycleSize - 1);
            }
        }

        return swaps;

        
    }
}