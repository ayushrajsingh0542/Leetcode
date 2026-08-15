// Last updated: 15/08/2026, 20:09:24
class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        // Initialize result list to store elements in spiral order
        ArrayList<Integer> list = new ArrayList<>();

        // sr: starting row index, sc: starting column index
        int sr = 0, sc = 0;

        // ec: ending column index, er: ending row index
        int ec = m[0].length - 1;
        int er = m.length - 1;

        // j is used for left boundary in the bottom-to-top traversal
        // But using both sc and j is slightly redundant; still, we retain your logic
        int j = 0;

        // Total number of elements to collect
        int s = m.length * m[0].length;

        // Keep looping until all elements are added to the list
        while (true) {
            if (list.size() == s)
                break;

            // Traverse the top row from left to right
            for (int i = sc; i <= ec; i++) {
                list.add(m[sr][i]);
            }
            sr += 1;  // Move starting row down, as it's already traversed

            if (list.size() == s)
                break;

            // Traverse the right column from top to bottom
            for (int i = sr; i <= er; i++) {
                list.add(m[i][ec]);
            }
            ec -= 1;  // Move ending column left

            if (list.size() == s)
                break;

            // Traverse the bottom row from right to left
            for (int i = ec; i >= j; i--) {
                list.add(m[er][i]);
            }
            er -= 1;  // Move ending row up

            if (list.size() == s)
                break;

            // Traverse the left column from bottom to top
            for (int i = er; i >= sr; i--) {
                list.add(m[i][j]);
            }

            // Move the left boundary right for next inner layer
            sc += 1;

            // j is incremented with sc to move the left boundary inward
            j += 1;

            if (list.size() == s)
                break;
        }

        // Return the final spiral ordered list
        return list;
    }
}
