package com.org.jmc.동적계획법;

import java.util.*;

public class 가장높은탑쌓기LIS {

    static int answer;
    static int[] dy;
    public static int solution (List<Block> arr) {

        for (int i=1; i<arr.size(); i++) {
            int max =0;

            for ( int j=i-1; j>=0; j--){
                if (arr.get(j).w > arr.get(i).w && dy[j] > max) {
                    max = dy[j];
                }
            }
            dy[i] = max +arr.get(i).h;
            answer = Math.max(answer, dy[i]);
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Block> arr = new ArrayList<>();

        for (int i=0; i<n; i++) {
            int btm = sc.nextInt();
            int h = sc.nextInt();
            int w = sc.nextInt();
            arr.add(new Block(btm, h, w));

        }
        dy = new int[arr.size()+1];
        dy[0] = arr.get(0).h;
        answer = dy[0];

        Collections.sort(arr);

        System.out.println(solution(arr));

    }
}

class Block implements Comparable<Block> {
    int b;
    int h;
    int w;

    public Block (int b, int h, int w) {
        this.b = b;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Block o) {
        if (this.b == o.b) {
            return o.w - this.w;
        } else {
            return o.b - this.b;
        }
    }
}