package com.First;

import java.util.ArrayList;
import java.util.List;

//邓俊辉老师-数据结构-第一章（上）01A-5
public class Algorithms_Finiteness {
    public static List<Integer> hailstones = new ArrayList<>();
    public static List<Integer> hailstone(int n){
        if(n > 1){
            if(n%2 == 0){
                n = n / 2;
                hailstones.add(n);
            }else{
                n = (3*n)+1;
                hailstones.add(n);
            }
            return hailstone(n);
        }else{
            n =1;
        }return hailstones;
    }
    public static void main(String[] args) {
        System.out.println(hailstone(42));
        System.out.println(hailstone(27));
    }
}
