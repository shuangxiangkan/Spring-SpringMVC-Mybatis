package baidu;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] a=new int[n];
        String s=scan.next();
        for(int i=0;i<s.length();i++){
            a[i]=Integer.parseInt(s.substring(i,i+1));
        }
        int count=min(a,0);

        System.out.println(count);
    }
    public static int min(int[] a,int i){
        int n=a.length;
        if(i==n-1)
            return 0;
        int count=1+min(a,i+1);
        int temp=count;
        int j=i+1;
        for(;j<n;j++){
            if(a[i]==a[j]){
                int s=1+min(a,j);
                if(s<count)
                    count=s;
            }
        }
        return count;
    }
}
