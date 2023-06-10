package com.org.jmc.그외;

import java.util.Scanner;

public class NumericalExtraction {

    // 숫자만 추출
    // tge0a1h205er = > 1205

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String target = sc.nextLine();

        for (char t : target.toCharArray()) {

            if (!Character.isAlphabetic(t)) {
                sb.append(t);
            }
        }
        boolean startWithZero = true;

        while (startWithZero) {
            if (sb.toString().startsWith("0")) {
                sb.deleteCharAt(0);
            } else {
                startWithZero=false;
            }
        }

        System.out.println(sb.toString());
    }
}
