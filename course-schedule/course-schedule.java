class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(numCourses <= 0) return true;
        List<Integer> sorted = new ArrayList<>();
        Map<Integer , Integer> incoming = new HashMap<>();
        Map<Integer , List<Integer>> graph  = new HashMap<>();
        
        for(int i =  0;i<numCourses ;i++){
            incoming.put(i,0);
            graph.put(i,new ArrayList<>());
        }
        
        for(int[] p : prerequisites){
            incoming.put(p[0],incoming.get(p[0])+1);
           graph.get(p[1]).add(p[0]);
        }
     Queue<Integer> q = new LinkedList<>();
        for(Map.Entry<Integer , Integer> entry : incoming.entrySet()){
            if(entry.getValue()==0){
                q.add(entry.getKey());
            }
        }
        
        while(!q.isEmpty()){
            int v = q.poll();
            sorted.add(v);
            List<Integer> ls = graph.get(v);
            for(int j : ls){
                incoming.put(j,incoming.get(j)-1);
                if(incoming.get(j)==0){
                    q.add(j);
                }
            }
        }
        
        return sorted.size() == numCourses;
    }
}