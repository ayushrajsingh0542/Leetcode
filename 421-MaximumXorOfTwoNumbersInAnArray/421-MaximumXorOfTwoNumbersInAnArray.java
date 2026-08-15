// Last updated: 15/08/2026, 20:02:29
class Trie
{
    static class Node
    {
        Node child[]=new Node[2];
        Node()
        {
            for(int i=0;i<2;i++)
            child[i]=null;
        }

        public boolean containsKey(int bit)
    {
       
       return child[bit]!=null;
    }

    }
    static Node root;
    Trie()
    {
        root=new Node();
    }
    public void insert(int num)
    {
        Node curr=root;
        for(int i=31;i>=0;i--)
        {
            int idx=(num>>i)&1;
            if(curr.child[idx]==null)
            curr.child[idx]=new Node();
            curr=curr.child[idx];
        }
    }
    
    public int getMax(int num)
    {
        Node curr=root;
        int maxNum=0;
        for(int i=31;i>=0;i--)
        {
          int bit=(num>>i)&1;
          int idx=(1-bit);
          if(curr.containsKey(idx))
          {
            maxNum=maxNum|1<<i;
            curr=curr.child[idx];
          }
          else
          {
            curr=curr.child[bit];
          }
        }

        return maxNum;
    }
}

class Solution {
    public int findMaximumXOR(int[] nums) {
        
         Trie trie = new Trie();
       
        for (int num : nums) {
            trie.insert(num);
        }

        int maxi = 0;

       
        for (int num : nums) {
            
            maxi = Math.max(maxi, trie.getMax(num));
        }

        
        return maxi;

    }
}