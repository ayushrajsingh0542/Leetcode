// Last updated: 15/08/2026, 20:03:19
class MedianFinder {
    PriorityQueue<Integer> maxHeap; 
    PriorityQueue<Integer> minHeap; 
    public MedianFinder() {
        maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        minHeap=new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(maxHeap.isEmpty() || maxHeap.peek()>num)
        maxHeap.add(num);
        else
        minHeap.add(num);
        if(maxHeap.size()-minHeap.size()>1)
        minHeap.add(maxHeap.remove());
        else if(minHeap.size()-maxHeap.size()>1)
        maxHeap.add(minHeap.remove());
        
    }
    
    public double findMedian() {
        
        if(maxHeap.size()==minHeap.size())
        return (maxHeap.peek()+minHeap.peek())/2.0;
        else
        {
            if(minHeap.size()>maxHeap.size())
            return minHeap.peek();
            return maxHeap.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */