// Last updated: 15/08/2026, 19:49:02
class Solution {
    public List<String> partitionString(String s) {
        HashSet<String> st = new HashSet<>();
        List<String> list = new ArrayList<>();

        String ch = ""; 

        for (int i = 0; i < s.length(); i++) { 
            ch += s.charAt(i);
            if (st.contains(ch)) {
                continue;
            } else {
                st.add(ch);
                list.add(ch);
                ch = ""; 
            }
        }

        return list;
    }
}
