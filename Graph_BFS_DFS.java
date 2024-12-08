import java.util.LinkedList;
import java.util.Queue;

public class Graph_BFS_DFS {
    public static void main(String[] args) {
        int visited[] = {0,0,0,0,0,0,0};
        int a [][]= {
                {0,1,1,1,0,0,0},
                {1,0,1,0,0,0,0},
                {1,1,0,1,1,0,0},
                {1,0,1,0,1,0,0},
                {0,0,1,1,0,1,1},
                {0,0,0,0,1,0,0},
                {0,0,0,0,1,0,0}
        };
        //BFD(a,2);
        DFD(a,3,visited);
    }
    private static void BFD(int a[][],int i){
        int visited[] = {0,0,0,0,0,0,0};
        Queue<Integer> q=new LinkedList<>();
        System.out.println(i);
        visited[i]=1;
        q.add(i);
        int node;
        while (!q.isEmpty()){
            node= q.poll();
            for (int j = 0; j < visited.length; j++) {
                if (a[node][j]==1&&visited[j]==0){
                    System.out.println(j);
                    visited[j]=1;
                    q.add(j);
                }
            }
        }
    }
    private static void DFD(int a[][],int i,int visited[]){
        System.out.println(i);
        visited[i]=1;
        for (int j = 0; j < visited.length; j++) {
            if (a[i][j]==1&&visited[j]==0){
                DFD(a,j,visited);
            }
        }
    }
}
