class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] res = new int[numCourses];
        int base = 0;
        if(numCourses <= 0) return new int[0];
        
        Map<Integer , List<Integer>> graph = new HashMap<>();
        Map<Integer,Integer> incoming = new HashMap<>();
        for(int i =0;i <numCourses ;i++){
            incoming.put(i,0);
            graph.put(i,new ArrayList<Integer>());
        }
        
        for(int[] p : prerequisites){
            int to = p[0] , from = p[1];
            incoming.put(to , incoming.get(to)+1);
            graph.get(from).add(to);
        }
        Queue<Integer> s = new LinkedList<Integer>();
        for(Map.Entry<Integer,Integer> entry : incoming.entrySet()){
            if(entry.getValue() ==0){
                s.add(entry.getKey());
            }
        }
        
        while(!s.isEmpty()){
            Integer i = s.poll();
            res[base++] = i;
            List<Integer> c = graph.get(i);
            for(Integer cc : c){
                incoming.put(cc , incoming.get(cc)-1);
                if(incoming.get(cc)==0){
                    s.add(cc);
                }
            }
        }
        
        if(base < numCourses){
            return new int[0];
        }
        return res;
    }
}