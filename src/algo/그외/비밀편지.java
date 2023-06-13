package algo.그외;

import java.util.Scanner;

// 이진수 변환 -> 십진수 변환 - > 캐릭터 변환
public class 비밀편지 {
    // 4
    //#****###**#####**#####**##**

    // -> COOL
    // 런타임 에러가 나는데 문제를 모르겠네..?  --> nextLine 함수 쓰면 나는듯.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String secretStr = sc.next();
        secretStr = secretStr.replace("#", "1").replace("*","0");
        String answer = "";
        for (int i=0; i<secretStr.length(); i++ ) {

            if (i%7==0) {
                String te = secretStr.substring(i,i+7);
                int t = Integer.parseInt(te,2);
                answer += ((char)t);
            }
        }

        System.out.println(answer);
    }

}
