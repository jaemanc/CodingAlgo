package algo.이분검색및정렬;


import java.util.Arrays;
import java.util.Comparator;

public class 가장_큰_수 {

    public static void main(String[] args) {

        int[] numbers = {3, 30, 34, 5, 9};

        System.out.println(solution(numbers));
    }

    public static String solution(int[] numbers) {

        String[] str = new String[numbers.length];

        for (int i=0; i<numbers.length; i++) {
            str[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        StringBuffer sb = new StringBuffer();
        for (int i=0; i<str.length; i++) {
            sb.append(str[i]);
        }

        if (str[0].equals("0"))
            return "0";

        return sb.toString();
    }

}
