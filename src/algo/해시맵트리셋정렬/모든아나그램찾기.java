package algo.해시맵트리셋정렬;

import java.util.HashMap;
import java.util.Scanner;

// 해시맵 amap.equals(bmap) --> 키값과 키의 밸류를 비교한다. 순서 상관 당연히 X
public class 모든아나그램찾기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.next();
        String tgt = sc.next();

        HashMap<Character,Integer> srcMap = new HashMap<Character, Integer>();
        HashMap<Character,Integer> tgtMap = new HashMap<Character, Integer>();

        for (Character x : tgt.toCharArray()) {
            tgtMap.put(x, tgtMap.getOrDefault(x,0)+1);
        }

        for (int i=0; i<tgt.length()-1; i++) {
            srcMap.put(src.charAt(i),srcMap.getOrDefault(src.charAt(i), 0)+1);
        }

        int answer=0;
        int lt=0;
        for (int rt = tgt.length()-1; rt<src.length(); rt++) {
            srcMap.put(src.charAt(rt),srcMap.getOrDefault(src.charAt(rt),0 )+1);
            if (srcMap.equals(tgtMap)) {
                answer ++;
            }
            srcMap.put(src.charAt(lt), srcMap.get(src.charAt(lt))-1);

            if (srcMap.get(src.charAt(lt))==0) {
                srcMap.remove(src.charAt(lt));
            }
            lt++;
        }

        System.out.println(answer);
    }

}
