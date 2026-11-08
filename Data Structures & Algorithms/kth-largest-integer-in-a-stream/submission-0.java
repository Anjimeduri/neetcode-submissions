class KthLargest {
    PriorityQueue<Integer> heap;
    int k;
    public KthLargest(int k, int[] nums) {
        heap = new PriorityQueue<Integer>();
        this.k = k;
        for(int num: nums) {
            add(num);
        }
    }
    
    public int add(int val) {
        if(heap.size() < k || heap.peek() < val) {
            heap.offer(val);
            if(heap.size() > k) {
                heap.remove();
            }
        }
        return heap.peek();
    }
}
