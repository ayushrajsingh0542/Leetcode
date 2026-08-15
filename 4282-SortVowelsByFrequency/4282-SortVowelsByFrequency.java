// Last updated: 15/08/2026, 19:46:59
class Solution {
    boolean isVowel(char c) {
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }

    public String sortVowels(String s) {
        int n = s.length();

        Map<Character, Integer> f = new HashMap<>();
        Map<Character, Integer> first = new HashMap<>();

        for(int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(isVowel(c)) {
                f.put(c, f.getOrDefault(c, 0) + 1);
                first.putIfAbsent(c, i);
            }
        }

        List<Character> keys = new ArrayList<>(f.keySet());

        Collections.sort(keys, (a, b) -> {
            if(!f.get(a).equals(f.get(b))) return f.get(b) - f.get(a);
            return first.get(a) - first.get(b);
        });

       
        List<Character> v = new ArrayList<>();
        for(char c : keys) {
            int cnt = f.get(c);
            while(cnt-- > 0) v.add(c);
        }

        char[] arr = s.toCharArray();
        int j = 0;

        for(int i = 0; i < n; i++) {
            if(isVowel(arr[i])) {
                arr[i] = v.get(j++);
            }
        }

        return new String(arr);
    }
}