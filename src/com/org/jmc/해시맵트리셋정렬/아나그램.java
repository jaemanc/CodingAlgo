package com.org.jmc.해시맵트리셋정렬;

import java.util.*;

public class 아나그램 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String array = sc.next();
        String brray = sc.next();

        String[] aaa = array.split("");
        String[] bbb = brray.split("");

        Map<String,Integer> amap = new HashMap<String,Integer>();
        Map<String,Integer> bmap = new HashMap<String,Integer>();
        for (int i=0; i<aaa.length; i++) {
            amap.put(aaa[i],amap.getOrDefault(aaa[i],0)+1);
        }

        for (int i=0; i<bbb.length; i++) {
            bmap.put(bbb[i],bmap.getOrDefault(bbb[i],0)+1);
        }

        if (amap.equals(bmap)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
