public class NumberOfProvinces {

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean vis[] = new boolean[n];
        int provinces = 0;

        for (int i = 0; i < n; i++) {
            if (vis[i] == false) {
                dfs(isConnected, vis, i);
                provinces++;
            }
        }
        return provinces;
    }

    public void dfs(int[][] isConnected, boolean[] vis, int i) {
        vis[i] = true;
        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[i][j] == 1 && vis[j] == false) {
                dfs(isConnected, vis, j);
            }
        }
    }

    public static void main(String[] args) {
        NumberOfProvinces solution = new NumberOfProvinces();
        
        int[][] isConnected ={
            {1,1,0},
            {1,1,0},
            {0,0,1}
        };

        System.out.println(solution.findCircleNum(isConnected));
    }
}
