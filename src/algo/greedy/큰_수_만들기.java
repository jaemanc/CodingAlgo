package algo.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class 큰_수_만들기 {
    public static void main(String[] args) {

        // greedy
        String number = "4177252841";
        int k = 4;

        // 정렬
        // Integer[] digits = Stream.of(number.split("")).map(Integer::valueOf).toArray(Integer[]::new);
        // Arrays.sort(digits, Collections.reverseOrder());

        solution(number, k);
    }

    static String[] digits;

    public static void solution (String number, int k) {

        digits = Stream.of(number.split("")).map(String::valueOf).toArray(String[]::new);

        for (int i=0; i < digits.length; i++) {
            greedy(digits[i], k, 0);
        }

    }

    public static String greedy(String number, int k, int depth) {
        if (depth==k) {
            return number;
        } else {
            return null;
            // return greedy(digits)
        }
    }

}
