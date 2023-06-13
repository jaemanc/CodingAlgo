package algo.그외;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/*

collections.frequency 는 편리하지만 어차피 내부에서 반복문 돌리는 거는 똑같다..

    public static int frequency(Collection<?> c, Object o) {
        int result = 0;
        if (o == null) {
            for (Object e : c)
                if (e == null)
                    result++;
        } else {
            for (Object e : c)
                if (o.equals(e))
                    result++;
        }
        return result;
    }

 */

public class FailureRate {

    public static void main ( String[] args ) {
        int size[][] = {{60,50},{30,70},{60,30},{80,40}};

        int answer = 0;

        int width = 0;
        int height = 0;


        System.out.println(Arrays.toString(size));

        Arrays.sort(size,(o1, o2) -> {
            if (o1[0] == o2[0]) {
                return Integer.compare(o1[1],o2[1]);
            } else {
                return Integer.compare(o1[0],o2[0]);
            }
        });

        for (int j = 0; j < size.length;j ++ ) {
            for (int i = 0; i < size[j].length; i ++ ) {
                if (size[j][0] > width) {
                    width = size[j][0];
                }

                // 높이 구할 경우.
                if (size[j][1] >height) {

                    height = size[j][i];


                }
            }





        }
        System.out.println( " 넓이 구함 ?? " + width);
        System.out.println( " 높이 구함 ?? " + height);
        

    }
}




  /*  public static void main (String[] args) {
        int [] numbers = {2,1,3,4,1};


        // 모든 더해질 가능성이 있는 수를 오름 차순으로 배열에 담아서 리턴
        int[] answer = {};
        Arrays.sort(numbers);

        List<Integer> answer_chk = new ArrayList<Integer>();
        for (int i = 0 ; i < numbers.length; i ++ ) {
            for (int j = i+1; j < numbers.length; j ++  ) {
                answer_chk.add(numbers[i] + numbers[j]);
            }
        }
        answer_chk =  answer_chk.stream().distinct().collect(Collectors.toList());

        answer = answer_chk.stream().mapToInt(i -> i).toArray();

        System.out.println(Arrays.toString(answer));

    }

}
*/



   /* public static void main(String[] args) {
        int[] d = {1,3,2,5,4};

        Integer[] dd = Arrays.stream(d).boxed().toArray(Integer[]::new);

        int budget = 9;

        // 예시 답안 : 9  --> 최대 9 개의 부서만 지원이 가능 하기 떄문임.

        List<Integer> arraysss = new ArrayList<Integer>(Arrays.asList(dd));
        Collections.sort(arraysss);
        System.out.println(" 정렬 되었는지 체크 합니다. : " + arraysss);


        int answer = 0;

        for (int i = 0 ; i < arraysss.size(); i ++ ) {
            budget -= arraysss.get(i).intValue();
            if (budget >= 0 ) {
                answer++;
            } else if (budget < 0 ) {
                System.out.println(" 답 : " + answer);
            }
        }


    }*/

//}














