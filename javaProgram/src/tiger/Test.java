package tiger;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
        lists.add(list);
        lists.add(list);
        for(ArrayList<Integer> item:lists){
            System.out.println(item);
        }
    }
}
