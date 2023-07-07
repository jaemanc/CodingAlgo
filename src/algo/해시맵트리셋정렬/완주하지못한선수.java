package algo.해시맵트리셋정렬;

import java.util.*;

public class 완주하지못한선수 {

    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        // -> return mislav
        System.out.println(solution(participant, completion));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> participantMap = new HashMap<>();
        for (int i=0; i<participant.length; i++) {
            participantMap.put(participant[i], participantMap.getOrDefault(participant[i], 0)+1);
        }

        for (int i=0; i<completion.length; i++) {
            participantMap.put(completion[i], participantMap.getOrDefault(completion[i], 0)-1);
            if (participantMap.get(completion[i])==0) {
                participantMap.remove(completion[i]);
            }
        }

        for (String key : participantMap.keySet()) {
            return key;
        }

        return answer;
    }

}
