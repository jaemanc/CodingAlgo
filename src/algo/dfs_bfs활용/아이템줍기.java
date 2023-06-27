package algo.dfs_bfs활용;

import java.util.*;

public class 아이템줍기 {
    String 제한사항 = """
    rectangle의 세로(행) 길이는 1 이상 4 이하입니다.
    rectangle의 원소는 각 직사각형의 [좌측 하단 x, 좌측 하단 y, 우측 상단 x, 우측 상단 y] 좌표 형태입니다.
    직사각형을 나타내는 모든 좌표값은 1 이상 50 이하인 자연수입니다.
    서로 다른 두 직사각형의 x축 좌표, 혹은 y축 좌표가 같은 경우는 없습니다.
    문제에 주어진 조건에 맞는 직사각형만 입력으로 주어집니다.
            charcterX, charcterY는 1 이상 50 이하인 자연수입니다.
    지형을 나타내는 다각형 테두리 위의 한 점이 주어집니다.
    itemX, itemY는 1 이상 50 이하인 자연수입니다.
    지형을 나타내는 다각형 테두리 위의 한 점이 주어집니다.
    캐릭터와 아이템의 처음 위치가 같은 경우는 없습니다.
    """;

    // 캐릭터 -> 아이템 가장 짧은 경로 찾을 것.

    public static void main(String[] args) {
        /*
        rectangle	                                characterX	characterY	itemX	itemY	result
        [[1,1,7,4],[3,2,5,5],[4,3,6,9],[2,6,8,8]]	    1	        3      	  7	      8	      17
        [[1,1,8,4],[2,2,4,9],[3,6,9,8],[6,3,7,7]]	    9	        7         6       1	      11
        [[2,2,5,5],[1,3,6,4],[3,1,4,6]],                1,          4,        6,      3       10
         */
//        int[][] rectangle = {{1,1,7,4},{3,2,5,5},{4,3,6,9},{2,6,8,8}};
//        int characterX = 1;
//        int characterY = 3;
//        int itemX = 7;
//        int itemY = 8;

        int[][] rectangle = {{2,2,5,5},{1,3,6,4},{3,1,4,6}};
        int characterX = 1;
        int characterY = 4;
        int itemX = 6;
        int itemY = 3;

        solution(rectangle, characterX, characterY, itemX, itemY);
    }

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};
    static int[][] dist = new int[50][50];
    static boolean[][] is_visited = new boolean[50][50];
    public static int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int answer = 0;
        Queue<itemQueue> queue = new LinkedList<>();
        // 캐릭터 시작점 :
        queue.offer(new itemQueue(characterX, characterY));

        // bfs로 푼다. 최단거리 찾는거라서.
        // 아이템이 캐릭터보다 0,0에 더 가까이 있는 경우도 체크해야한다.

        while (!queue.isEmpty()) {
            itemQueue here = queue.poll();
            int hereX = here.x;
            int hereY = here.y;
            System.out.println(" 현재 위치 : " + hereX + " , " + hereY + " 이동 거리 : " + dist[hereX][hereY] );

            // 도착했다면 return
            if (hereX == itemX && hereY == itemY) {
              //  System.out.println(" 거리는 : " + dist[hereX][hereY] );
                return dist[hereX][hereY];
            }

            // 4방향 탐색
            for (int i=0; i< 4; i++) {
                int tempX = hereX+dx[i];
                int tempY = hereY+dy[i];

                // 사각형의 경로 + 사각형 내부에 있지는 않은지 확인.
                if ( !is_visited[tempX][tempY]&& tempX > 0 && tempY > 0 && is_insideCoordinate(tempX, tempY, hereX, hereY, rectangle)){

                    itemQueue nextQueue = new itemQueue(tempX, tempY);
                    is_visited[tempX][tempY] = true;
                    dist[tempX][tempY] = dist[hereX][hereY] +1;
                    queue.offer(nextQueue);
                }
            }
        }
        return answer;
    }

    public static boolean is_insideCoordinate(int x, int y, int hereX, int hereY, int[][] rectangle) {
        boolean flag = false;
        for (int i=0; i< rectangle.length; i++) {

            // 왼쪽 아래.
            int recStartX = rectangle[i][0];
            int recStartY = rectangle[i][1];

            // 오른 위
            int recEndX = rectangle[i][2];
            int recEndY = rectangle[i][3];

            for (int j=0; j< rectangle[i].length; j++) {
                // 특정 사각형의 라인 위에 있을 경우.
                if (  (recStartX <= x && x <= recEndX && recStartY<=y && y<= recEndY) ) {
                    // 현재위치가 다음 타겟의 사각형 라인 위.
                    if (hereX>= recStartX && hereX <= recEndX && hereY >= recStartY && hereY <= recEndY ) {
                        flag = true;
                    }

                    // 건너 뛰는 (뚫고 지나 가는 문제는 좌표계를 2배로 하면 해결 할 수 있음


                    // 후.. 다른 방법 생각 딱히 안납니다.. ㅜ





                }
                // 라인 위에 있지만 특정 사각형의 내부에 있을 경우를 제외
                for (int k=0; k< rectangle.length; k++) {

                    // 왼쪽 아래.
                    int kStartX = rectangle[k][0];
                    int kStartY = rectangle[k][1];

                    // 오른 위
                    int kEndX = rectangle[k][2];
                    int kEndY = rectangle[k][3];

                    if ( x >= kStartX+1 && x <= kEndX-1 && y >= kStartY+1 && y <= kEndY-1) {
                        //  System.out.println(" x : " + x + " y : " + y +" 사각형 내부에 있습니다. ");
                        flag = false;
                        break;
                    }

                }
            }
        }
        return flag;
    }

}

class itemQueue{
    int x;
    int y;
    public itemQueue(int x, int y){
       this.x = x;
       this.y = y;
    }
}
