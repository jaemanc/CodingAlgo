package algo.그외;

import java.util.Scanner;

public class StringCompression2 {

    //KKHSSSSSSSE
    //K2HS7E

    // 생각보다 애먹었음..

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        input+=" ";
        StringBuffer sb = new StringBuffer();
        int count=1;
        for (int i=0; i<input.length()-1; i++) {

            if (input.charAt(i) == input.charAt(i+1)) {
                count++;
            } else {
                sb.append(input.charAt(i));
                if (count>1) {
                    sb.append(count);
                    count=1;
                }
            }
        }

        System.out.println(sb.toString());

    }

}
