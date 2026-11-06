class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> fMap = new HashMap<>();
        for(int num: nums) {
            fMap.put(num, fMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        for(Map.Entry<Integer, Integer> entry: fMap.entrySet()) {
            pq.offer(entry);
            if(pq.size() > k){
                pq.poll();
            }
        }

        int[] result = new int[k];
        int index = 0;
        while(!pq.isEmpty()) {
            result[index] = pq.poll().getKey();
            index++;
        }
       return result;
    }
}
