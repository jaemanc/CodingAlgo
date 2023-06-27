package algo.dfs_bfs활용;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 여행경로 {
    String 주석 = """
    모든 공항은 알파벳 대문자 3글자로 이루어집니다.
    주어진 공항 수는 3개 이상 10,000개 이하입니다.
    tickets의 각 행 [a, b]는 a 공항에서 b 공항으로 가는 항공권이 있다는 의미입니다.
    주어진 항공권은 모두 사용해야 합니다.
    만일 가능한 경로가 2개 이상일 경우 알파벳 순서가 앞서는 경로를 return 합니다.
    모든 도시를 방문할 수 없는 경우는 주어지지 않습니다.""";
    public static void main(String[] args) {
        /*

        tickets
        [["ICN", "SFO"], ["ICN", "ATL"], ["SFO", "ATL"],["ATL", "ICN"], ["ATL","SFO"]]

        return
        ["ICN", "ATL", "ICN", "SFO", "ATL", "SFO"] // 알파벳 순이라 icn sfo 가 아닌 icn atl 로 시작.

         */

        String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"},{"ATL", "ICN"}, {"ATL","SFO"}};

        // tc 1 번 체크용 :
        // String[][] tickets = {{"ICN","A"} , {"ICN","B"} , {"B","ICN"}};
        solution(tickets);
        System.out.println();
    }

    static List<String> ans;
    static boolean[] chk;
    public static String[] solution(String[][] tickets) {
        Arrays.sort(tickets, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if (o1[0].equals(o2[0])) {
                    return o1[1].compareTo(o2[1]);
                } else {
                    return o1[0].compareTo(o2[0]);
                }
            }
        });

        chk = new boolean[tickets.length];

        List<String> arr = new ArrayList<>();
        arr.add("ICN");
        dfs(0,tickets,arr);

        // Arraylist to answer[] 변환
        String[] answer = ans.toArray(new String[ans.size()]);
        // System.out.println(Arrays.toString(answer));
        return answer;
    }

    static boolean stop = false;
    public static void dfs(int L, String[][] tickets, List<String> answers) {

        if (stop) {
            return;
        }

        if (answers.size() == tickets.length+1) {
            // System.out.println("총 여정 : " +L +" "+ answers.toString());
            ans = new ArrayList<>(answers);
            stop = true;
            return;
        }

        for (int i=0; i< tickets.length; i++) {
            if (!chk[i] && answers.get(L).equals(tickets[i][0])) {
                chk[i]=true;
                List<String> arr2 = new ArrayList<>(answers);
                arr2.add(tickets[i][1]);
                dfs(L+1,tickets, arr2);
                chk[i]=false;
            }
        }
    }
}

