// Last updated: 15/08/2026, 19:54:41
class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] word=sentence.split(" ");
        int n=word.length;
        for(int i=0;i<n;i++)
        {
            if(word[i].startsWith(searchWord))
            {
                return i+1;
            }
        }
        return -1;
    }
}