package algo.해시맵트리셋정렬;

import java.util.Arrays;

public class 전화번호목록 {

    /*
        전화번호부에 적힌 전화번호를 담은 배열 phone_book이 solution 함수의 매개변수로 주어질 때,
        어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.
        첫 번째 전화번호, “12”가 두 번째 전화번호 “123”의 접두사입니다. 따라서 답은 false입니다.

        전화번호책의 길이는 1 ~ 1,000,000 이하이다
     */

    public static void main(String[] args) {
        String[] phone_book = {"12","123","1235","567","88"}; // return false;
        System.out.println(solution(phone_book));
    }

    public static boolean solution (String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);

        for (int i=0; i< phone_book.length-1; i++) {
            if (phone_book[i+1].startsWith(phone_book[i])) {
                return false;
            }
        }

        return answer;
    }

}
