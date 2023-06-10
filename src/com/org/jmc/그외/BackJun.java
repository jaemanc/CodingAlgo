package com.org.jmc.그외;
import java.util.Scanner;

// Scanner를 사용하기 위해서 java.util.Scanner 클래스를 import 한다.
public class BackJun {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        money = 1000 - money;
        int answer = 0;
        int coins = 0;

        System.out.println(money);


        int[] money_kind = {500, 100, 50, 10, 5, 1};
        for (int moeny_k : money_kind) {
            while ( money >= moeny_k ) {
                money-=moeny_k;
                answer++;
            }
            if (money ==0) {
                System.out.println(answer);
                break;
            }
        }
        System.out.println(answer);


    }
}