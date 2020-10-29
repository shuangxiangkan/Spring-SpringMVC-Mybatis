package baidu;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[][] M={{1,1,0},{1,1,0},{0,0,1}};
//        int[][] M={{1,1,0},{1,1,1},{0,1,1}};
        Main m=new Main();
        System.out.println(m.findFriendNum(M));
    }
    public int findFriendNum1 (int[][] M) {
        // write code here
        int n=M.length;
        int[] label=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(M[i][j]==1&&label[i]==0&&label[j]==0){
                    count++;
                    friend(M,j,label);
                }
            }
        }
        return count;
    }
    public void friend(int[][] M,int j,int[] label) {
        for(int k=0;k<M.length;k++){
            if(M[j][k]==1){
                label[k]=1;
                friend(M,k,label);
            }
//            if(M[j][k]==1){
//                label[k]=1;
//                friend(M,j,k,label);
//            }
        }
    }
    public int findFriendNum (int[][] M) {
        // write code here
        UnionFind uf=new UnionFind(M.length);
        for(int i=0;i<M.length;i++){
            int[] cur=M[i];
            for(int j=0;j<M.length;j++){
                if(cur[j]==1)
                    uf.union(i,j);
            }
        }
        return uf.amount;
    }

    static class UnionFind{
        int[] parent;
        int[] size;
        private int amount;
        public UnionFind(int k){
            parent=new int[k];
            size=new int[k];
            for(int i=0;i<k;i++){
                parent[i]=i;
                size[i]=1;
            }
            amount=k;
        }
        public int root(int k){
            while (parent[k]!=k){
                parent[k]=parent[parent[k]];
                k=parent[k];
            }
            return k;
        }
        public void union(int i,int j){
            int rootA=root(i);
            int rootB=root(j);
            if(rootA==rootB)
                return;
            amount--;
            if(size[rootA]>size[rootB]){
                parent[rootB]=rootA;
                size[rootA]+=size[rootB];
            }else{
                parent[rootA]=rootB;
                size[rootB]+=size[rootA];
            }
        }
    }
}
