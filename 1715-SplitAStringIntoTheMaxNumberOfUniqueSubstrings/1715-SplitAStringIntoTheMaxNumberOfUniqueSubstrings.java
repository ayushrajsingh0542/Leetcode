// Last updated: 15/08/2026, 19:54:03
class Solution {
    private int maxSS = 0;
    public int maxUniqueSplit(String s) {
        Set<String> unqStrings = new HashSet<>();
        mkUnqStr(0, s, unqStrings);
        return maxSS;
    }
    private void mkUnqStr(int startendIndx, String s, Set<String>unqStrings){
        int size = s.length();
        if(startendIndx == size){
            maxSS = Math.max(maxSS, unqStrings.size());
        }  
        for(int endIndx = startendIndx + 1; endIndx <= size; endIndx++){
            String currStr = s.substring(startendIndx, endIndx);
            if(!unqStrings.contains(currStr)){
                 unqStrings.add(currStr);
                 mkUnqStr(endIndx, s, unqStrings);
                 unqStrings.remove(currStr);
            }
        }
    }
}