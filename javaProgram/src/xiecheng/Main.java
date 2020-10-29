package xiecheng;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    需要可乐的数量为 m
    10元的张数为 a
    50元的张数为 b
    100元的张树为 c
    1瓶可乐的价格为 x
    ******************************开始写代码******************************/
    static int buyCoke(int m, int a, int b, int c, int x) {
        int count=0;
        int money=m*x;
        int y=x;
        int i=0;
        while(i<m){
            x=y;
            if(c*100>=x){
                if(x%100==0){
                    int q=x/100;
                    count+=q;
                    c=c-q;

                }else{
                    if(x>=50){
                        int q=x/100+1;
                        c=c-q;
                        count+=q;
                        int left=q*100-x;
                        b+=left/50;
                        a+=(left%50)/10;
                    }else{
                        count+=x/10;
                    }

                }
            }else{
                count+=c;
                x=x-c*100;
                c=0;
                if(b*50>=x&&x>=50){
                    if(x%50==0){
                        int q=x/50;
                        count+=q;
                        b=b-q;

                    }else{
                        if(x>=10){
                            int q=x/50+1;
                            b=b-q;
                            count+=q;
                            int left=q*50-x;
                            a+=left/10;
                            count+=(x-(q-1)*50)/10;
                        }else{
                            count+=x/10;
                        }

                    }
                } else if(b*50<x){
                    count+=b;
                    x=x-b*50;
                    b=0;
                    count+=x/10;
                }else{
                    count+=x/10;
                }
            }
            i++;
        }

        return count;
    }

    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _m;
        _m = Integer.parseInt(in.nextLine().trim());

        int _a;
        _a = Integer.parseInt(in.nextLine().trim());

        int _b;
        _b = Integer.parseInt(in.nextLine().trim());

        int _c;
        _c = Integer.parseInt(in.nextLine().trim());

        int _x;
        _x = Integer.parseInt(in.nextLine().trim());

        res = buyCoke(_m, _a, _b, _c, _x);
        System.out.println(String.valueOf(res));

    }
}
