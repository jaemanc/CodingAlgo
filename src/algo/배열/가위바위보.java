package algo.배열;

import java.util.Scanner;

public class 가위바위보 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numbOfGame = Integer.parseInt(sc.next());
        int[] a = new int[numbOfGame];
        int[] b = new int[numbOfGame];


        String[] sb=new String[numbOfGame];
        for (int i=0; i<numbOfGame; i++) {
            a[i] = sc.nextInt();
        }
        for (int i=0; i<numbOfGame; i++) {
            b[i] = sc.nextInt();
        }

        for (int i=0; i<numbOfGame; i++) {
            if (a[i] == b[i]) {
                sb[i] = "D";
            } else if (a[i] ==1 && b[i] == 3) {
                sb[i] = "A";
            } else if (a[i] ==2 && b[i] == 1) {
                sb[i] = "A";
            } else if (a[i] ==3 && b[i] == 2) {
                sb[i] = "A";
            } else {
                sb[i] = "B";
            }
            System.out.println(sb[i]);
        }
    }

}
