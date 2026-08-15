// Last updated: 15/08/2026, 19:53:42
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        Queue<Integer> std=new LinkedList<>();
        Queue<Integer> sand=new LinkedList<>();

        for(int i=0;i<students.length;i++)
        {
            std.add(students[i]);
            sand.add(sandwiches[i]);
        }
        int count=0;
        int i=0;
        while(std.size()!=0 && count!=std.size())
        {
            if(std.peek()==sand.peek())
            {
                count=0;
                std.remove();
                sand.remove();
            }
            else
            {
                count++;
                std.add(std.remove());
            }
        }
        return std.size();

        
    }
}