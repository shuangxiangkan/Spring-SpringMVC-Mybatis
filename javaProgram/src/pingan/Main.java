package pingan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        String[] sa = s.split(" ");
        ArrayList<Integer> alist=new ArrayList<>();
        for(int i=0;i<sa.length;i++){
            int c=Integer.parseInt(sa[i]);
            if(!alist.contains(c)){
                alist.add(c);
            }
        }
        Collections.sort(alist);
        for(int i=alist.size()-1;i>=0;i--){
            System.out.print(alist.get(i)+" ");
        }
    }
}
