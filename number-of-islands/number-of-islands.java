class Solution {
    int n;
    int m;
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length ==0) return 0;
        n = grid.length;
        m = grid[0].length;
        int count=0;
        for(int i =0 ;i <n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    DFS(grid,i,j);
                    count++;
                }
            }
        }
        return count;
        
    }
    private void DFS(char[][] g ,int i ,int j){
        if(i<0 ||j<0 || i >=n || j >=m || g[i][j]=='0') return;
        g[i][j] = '0';
        DFS(g,i+1,j);
        DFS(g,i-1,j);
        DFS(g,i,j+1);
        DFS(g,i,j-1);
    }
}