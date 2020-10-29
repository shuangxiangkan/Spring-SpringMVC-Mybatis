package baidu;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int p=scan.nextInt();
        int[][] a=new int[n][2];
        int[] label=new int[n+1];
        for(int i=0;i<m;i++){
            a[i][0]=scan.nextInt();
            a[i][1]=scan.nextInt();
            label[a[i][0]]++;
        }
        int niu=label[p];
        int g=0;
        int e=0;
        for(int i=1;i<n+1;i++){
            if(niu==label[i])
                e++;
            else if(niu<label[i])
                g++;
        }
        for(int i=1;i<=e;i++){
            System.out.println(g+i);
        }
    }
}
