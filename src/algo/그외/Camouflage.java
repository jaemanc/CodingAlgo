package com.org.jmc.그외;

import java.util.*;

public class Camouflage {

    public static void main(String[] args) {

        // String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        // 헤드기어 : 엘로우햇 / 그린 터번 / none 총 3개로 보아야 하는게 옳다. 이게 키포인트이다.

        // 63 나와야함. 다른 사람의 테스트 케이스만 가져옴.
        String[][] clothes = {{"a", "aa"}, {"b", "aa"}, {"c", "aa"}, {"aa", "bb"}, {"bb", "bb"}, {"c_c", "bb"}, {"aaa", "cc"}, {"bbb", "cc"}, {"ccc", "cc"}};
        System.out.println( Solution(clothes) );
    }

    public static int Solution (String[][] clothes) {

        int answer = 0;

        String[] tt = new String[clothes.length];

        Map<String, Integer> tempMap = new HashMap<>();
        for (int i = 0 ; i < clothes.length; i ++ ) {
           tempMap.put( clothes[i][1] , tempMap.getOrDefault(clothes[i][1],0)+1);
        }

        List<Integer> ArrayLs = new ArrayList<>();

        int temp = 1;
        for (String keys : tempMap.keySet()) {
            //아무것도 입지 않는 경우가 존재함.
             temp *= tempMap.get(keys)+1  ;
        }

        // 하나도 안입는 경우는 없으므로.. 모든 경우중 전체다 아무것도 안입는 경우 == 1가지 경우를 제거한다.
        return temp -1  ;
    }

}