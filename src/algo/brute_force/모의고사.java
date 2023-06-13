package algo.brute_force;

import java.util.*;

public class 모의고사 {

    public static void main(String[] args) {
        int[] answer ={1,3,2,4,2};
        System.out.println(Arrays.toString(solution(answer)));
    }

    public static int[] solution(int[] answers) {
        int[] one = {1,2,3,4,5}; // 5
        int[] two = {2,1,2,3,2,4,2,5}; // 8
        int[] three = {3,3,1,1,2,2,4,4,5,5}; // 10

        int[] score = {0,0,0};
        ArrayList<Integer> maxScore = new ArrayList<Integer>();
        for (int i=0; i<answers.length; i++) {
            int a = i%5;
            int b = i%8;
            int c = i%10;
            if (answers[i] == one[a]) {
                score[0]++;
            }
            if (answers[i] == two[b]) {
                score[1]++;
            }
            if (answers[i] == three[c]) {
                score[2]++;
            }
        }

        int [] sortScore = score.clone();
        Arrays.sort(sortScore);
        int max = sortScore[2];
        for(int i = 0; i < score.length; i++) {
            if(score[i]==max) {
                maxScore.add(i+1);
            }
        }

        int[] answer = new int[maxScore.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = maxScore.get(i);
        }
        return answer;
    }

}

