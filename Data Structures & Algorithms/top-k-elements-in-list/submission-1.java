class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numF = new HashMap<Integer, Integer>();
        for(int num: nums) {
            numF.put(num, numF.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq = 
            new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for(Map.Entry<Integer, Integer> entry : numF.entrySet()) {
            pq.offer(entry);
            if(pq.size() > k) {
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
