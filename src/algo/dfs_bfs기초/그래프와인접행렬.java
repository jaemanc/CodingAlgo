package algo.dfs_bfs기초;


public class 그래프와인접행렬 {

    // 1.무방향 그래프
    /*   1 - 2 - 5
         ㅣ   ㅣ
         3 -  4

        와 같은 그래프라면
        1 2
        1 3
        2 4
        3 4
        2 5
        와 같이 입력을 받게됨.

        를 우리는 graph = 2차원 배열로 볼 수 있음. ( 0 초기화 )

        1, 2 = 1
        2, 1 = 1

       graph [a][b] = 1;
       graph [b][a] = 1; 과같이 표현합니다. ( 인접행렬일 경우 1로 표시 )
    */

        // 방향 그래프
        /*
        *    1 -> 2 -> 5
            ㅣ   ㅣ
            3 -> 4
         */

        /*
            graph[a][b] = 1; 로 행 -> 열번호로 해석한다.
            반면에 2~1은 못간다면
            graph[2][1] = 0; 이 된다.
        */

        // 가중치 그래프라면?
        /*
            graph[a][b] = {가중치}; 값으로 채운다.
        */

    public static void main(String[] args) {

    }


}
