package tiger;

import java.util.*;


public class Solution2 {
    public static void main(String[] args) {
        Solution2 s=new Solution2();
        int[] prices={1,2,3,4,5,6,7};
        int m=8;
//        int[] prices={3,8,6,11,5};
//        int m=19;
        ArrayList<ArrayList<Integer>> results=s.combinationSum(prices,m);
        for(ArrayList<Integer> item:results)
            System.out.println(item);
    }
    /**
     * 合适的股票每手价格组合
     * @param prices int整型一维数组 股票数量
     * @param m int整型 资产值
     * @return int整型ArrayList<ArrayList<>>
     */
    public ArrayList<ArrayList<Integer>> combinationSum (int[] prices, int m) {
        // write code here
        ArrayList<ArrayList<Integer>> results=new ArrayList<ArrayList<Integer>>();
//        int[] labels=new int[prices.length];
        ArrayList<Integer> list=new ArrayList<>();
        select(prices,m,0,results,list);
        m=m-prices[0];
        list.add(prices[0]);
        select(prices,m,0,results,list);
        return results;
    }
    public void select(int[] prices,int m,int i,ArrayList<ArrayList<Integer>> results,ArrayList<Integer> list){

        if(m==0){
            Collections.sort(list);
            ArrayList<Integer> alist=new ArrayList<>();
            for(Integer item:list){
                alist.add(item);
            }
            results.add(alist);
        }else if(m<0||i>=prices.length-1){
            return;
        }
        else{
            select(prices,m,i+1,results,list);
            m=m-prices[i+1];
            list.add(prices[i+1]);
            select(prices,m,i+1,results,list);
            list.remove(list.size()-1);
//            m=m+prices[i];
        }
    }
}
