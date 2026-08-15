// Last updated: 15/08/2026, 19:50:20
class Solution {

    public static void adj(int n, String str, List<String> list) {
        if (str.length() == n) {
            list.add(str);
            return;
        }

        // Always can add '1'
        adj(n, str + "1", list);

        // Add '0' only if previous char is not '0'
        if (str.isEmpty() || str.charAt(str.length() - 1) != '0') {
            adj(n, str + "0", list);
        }
    }

    public List<String> validStrings(int n) {
        List<String> list = new ArrayList<>();
        adj(n, "", list);
        return list;
    }
}
