package algo.brute_force;
import java.util.ArrayList;

public class 소수_찾기 {

    static String[] arr;
    static boolean[] chk;
    static ArrayList<String> lists= new ArrayList<>();
    public static void main(String[] args) {
        String numbers = "011";
        System.out.println(solution(numbers));
    }

    public static int solution(String numbers) {
        int answer = 0;

        arr = numbers.split("");
        chk = new boolean[arr.length];
        makeList("");

        // 소수 구하기. 1 부터 num 까지 중에 나눠지는(떨어지는) 수가있으면 소수가 아니다.
        for (int i=0;i<lists.size();i++) {
            int target = Integer.parseInt(lists.get(i));
            boolean flag = false;
            for (int j=2; j<target; j++) {

                if (target % j == 0 && target != 1) {
                    flag = true;
                    break;
                }
            }
            if (!flag && target > 1) {
                answer+=1;
            }

        }

        return answer;
    }

    public static void makeList(String words){
        if (words.length() == arr.length){
            return;
        }

        for (int i=0; i< arr.length; i++){

            if (!chk[i]) {
                String sumWord = words+arr[i];

                if(sumWord.startsWith("0")){
                    sumWord = sumWord.substring(1);
                }

                if (!lists.contains(sumWord) && !sumWord.equals("")) {
                    lists.add(sumWord);
                    chk[i] = true;
                    makeList(sumWord);
                    chk[i] = false;
                }
            }

        }

    }
}
