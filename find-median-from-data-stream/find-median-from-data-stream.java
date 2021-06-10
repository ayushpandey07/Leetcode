class MedianFinder {

    /** initialize your data structure here. */
    //minRight for hollding smallest among big values
    //maxLeft for holding biggest among small values
    Queue<Integer> minRight;
    Queue<Integer> maxLeft;
    boolean odd = true;
    public MedianFinder() {
        minRight = new PriorityQueue();
        maxLeft = new PriorityQueue(Comparator.reverseOrder());
    }
    
    public void addNum(int num) {
        minRight.add(num);
        maxLeft.add(minRight.poll());
        if(maxLeft.size() - minRight.size() >1) minRight.add(maxLeft.poll());
    }
    
    public double findMedian() {
    if(maxLeft.size() - minRight.size() == 0)  return  (double) (maxLeft.peek() + minRight.peek() )/2.0;
    return (double) maxLeft.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */