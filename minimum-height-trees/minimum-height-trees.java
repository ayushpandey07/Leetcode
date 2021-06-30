class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
     if (n < 2) {
            ArrayList<Integer> centroids = new ArrayList<>();
            for (int i = 0; i < n; i++)
                centroids.add(i);
            return centroids;
        }
        
        ArrayList<Set<Integer>> neighbors = new ArrayList<>();
        for(int i = 0 ;  i < n ; i++){
            neighbors.add(new HashSet<Integer>());
        }
        for(int[] e : edges){
            int s = e[0],en = e[1];
            neighbors.get(s).add(en);
            neighbors.get(en).add(s);
        }
        
        //last wale nodes jinke sirf ek hi connection h
        
        ArrayList<Integer> leaves = new ArrayList<>();
        for(int i =0;i<n ;i++){
            if(neighbors.get(i).size()==1) leaves.add(i);
        }
        
        //hata do sare ek edge walo ko and agar hatane k baad kisi or k b ek edge bane to unko leaves me daal do
        
        int remaining = n;
        
        while(remaining > 2){
            remaining -= leaves.size();
            ArrayList<Integer> newLeaves = new ArrayList<>();
            for(Integer leaf : leaves){
                Integer ne = neighbors.get(leaf).iterator().next();
                neighbors.get(ne).remove(leaf);
                if(neighbors.get(ne).size()==1){
                    newLeaves.add(ne);
                }
            }
            leaves = newLeaves;
        }
        return leaves;
    }
}