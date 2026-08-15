// Last updated: 15/08/2026, 20:05:46
class MinStack {
   class Pair
   {
    int val,min;
    Pair(int v,int min)
    {
        this.val=v;
        this.min=min;
    }
   }
   Stack<Pair>st;
    public MinStack() {
        st=new Stack<>();
    }

    public void push(int val) {
     if(st.isEmpty())
     {
        st.push(new Pair(val,val));
     }
     else
     {
        Pair curr=st.peek();
        int min=Math.min(val,curr.min);
        st.push(new Pair(val,min));
     }
    }

    public void pop() {
        if(!st.isEmpty())
        st.pop();
    }

    public int top() {
         Pair curr=st.peek();
         return curr.val;
    }

    public int getMin() {
        Pair curr=st.peek();
        return curr.min;
    }
}