package pingan;

import org.omg.CORBA.MARSHAL;

import java.util.Scanner;

public class Main2 {
    static boolean[][] map;
    static int n;
    static int count=0;
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        map=new boolean[n][n];

        getAllPossible(0);
        System.out.println(count);
    }
    public static void getAllPossible(int k){
        if(k==n){
            count++;
            return;
        }

        for(int i=0;i<n;i++){
            if(judge(k,i)){
                map[k][i]=true;
                getAllPossible(k+1);
                map[k][i]=false;
            }
        }
    }
    public static boolean judge(int k,int j){
        for(int i=0;i<k;i++){
            if(map[i][j])
                return false;
        }
        int i=k-1,r=j-1;
        while (i>=0&&r>=0){
            if(map[i][r])
                return false;
            i--;
            r--;
        }
        i=k-1;
        r=j+1;
        while (i>=0&&r<n){
            if(map[i][r])
                return false;
            i--;
            r++;
        }
        return true;
    }
}
