package com.org.jmc.그외;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Best_album {


    public static void main(String[] args ) {
        String[] genres= {"classic", "pop", "classic", "classic", "pop"};
        int[] plays= {500, 600, 150, 800, 2500};

        System.out.println(solution(genres,plays));
    }


    public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        // 맨처음 인덱스는 밖에서 가지고 있어야 한다.



        Map<Map<String,Integer>,Integer> midMap = new HashMap<>();
        Map<String,Integer> bttmMap = new HashMap<String,Integer>();

        Map<Integer,String> genresMap = new TreeMap<>();

        Set<String> keySett = bttmMap.keySet();

        for (int i = 0 ; i < genres.length ; i ++ ){
            int countNum = 1;
            String genress = genres[i];

            Integer keysss=0;
            Set<Map.Entry<Integer, String>> entrySet = genresMap.entrySet();
            for (Map.Entry<Integer, String> entry : entrySet) {
                if (entry.getValue().equals(genress)) {
                     keysss = (entry.getKey()); // 1, 3
                }
            }
            if (genresMap.get(keysss).equals(genress) ){
                genresMap.put(countNum+=1,genress);
            } else {
                genresMap.put(countNum,genress);
            }

        }

        // 장르가 많은 순서대로 소팅.
        // Iterator<String> tt = genresMap.keySet().iterator();

        // 정렬해서 넣고 밖에서 가지고온 인덱스로 순서를 결정한다.
        // 장르가 몇개 들어있는 지, 개수를 체크했다.
        System.out.println(genresMap.toString());

        // 속한 노래 중에 장르가 많은 순서가 앞에 오고,
        // 장르 중에 재생된 순서가 많은 게 앞으로 오게 한다.


        Map<String,Integer> playsMap = new HashMap<>();


        return answer;
    }

}
