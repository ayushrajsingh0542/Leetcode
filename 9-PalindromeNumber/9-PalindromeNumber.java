// Last updated: 15/08/2026, 20:11:07
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        ;
        String temp=Integer.toString(x);
        String temp2="";
        for(int i=0;i<temp.length();i++){
            temp2=temp.charAt(i)+temp2;
        }
        double y=Double.valueOf(temp2);
        double x2=x;
        if(x2==y)
        return true;
        else
        return false;
        
        
    }
}