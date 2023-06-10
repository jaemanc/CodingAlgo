//package com.org.jmc;
//
//public class JoyStick {
//
//    public static void main( String[] args ) {
//        String name = "JAZ";
//        solution (name);
//    }
//
//    static int solution ( String name ) {
//
//        // 'A' = 17
//        // 'Z' = 42
//
//        // A B C D E F G H I J K L M     M = 29
//        // N O P Q R S T U V W X Y Z     N = 30
//
//        // 앞으로 가다가 뒤로가는 경우
//        // solution("ABAAAAAAAAABB") // 7
//
//        // A뒤로 먼저 한칸 갔다가 다시 앞에서부터 시작하는게 빠른 경우.
//        // solution("BBBBAAAAAB"); // 10
//
//        // solution("BBBBAAAABA") // 12
//
//        // solution("JEROEN") // 56
//
//        // 상하 조작 좌우 조작 따로 풀어라..
////        char mm = 'M';
////        int M = mm - '0';
////        char nn = 'N';
////        int N = nn - '0';
//
//      //  System.out.println("M : " + M + " N : " + N  + " A : "+ + ( 'A'-'0' ) +  " Z : " + ('Z'-'0'));
//
//        int answer = 0;
//        char[] target = name.toCharArray();
//
//        for (int i = 0; i < name.length(); i++ ) {
//            System.out.println();
//            System.out.println(" target : " + target[i] );
//            // M 보다 작으니까 더해서 올라가는게 빠름.
//            if( target[i] - '0' <= 29 ) {
//
//                answer+= ( target[i]-'A');
//                System.out.println(" M 보다 작으므로 " + ( target[i]-'A') + " 를 더합니다. result : " + answer);
//
//            } else {
//                System.out.println(" N 보다 크거나 같은 target?! : " + target[i]);
//                // 다음 알파벳이 A 인 경우?
//
//                // 위 조건에 해당하지 않는다면. Z로 넘어가서 시작한다.
//                answer += 'Z' - target[i]+1;
//                System.out.println(" N 보다 커서, " + ( 'Z' -  target[i]+1) +" 를 더합니다. result : " + answer);
//            }
//        }
//
//        // 앞으로 가다가 뒤로가는 경우
//        // solution("ABAAAAAAAAABB") // 7
//
//        // A뒤로 먼저 한칸 갔다가 다시 앞에서부터 시작하는게 빠른 경우.
//        // solution("BBBBAAAAAB"); // 10
//        // 좌우 조작을 더해보자..
//
//        // A를 그냥 압축한다고 생각하면 된다.
//        // ABABB 와 같이 생각한다고 하면, 7
//        // BBBBAB 와 같이 생각한다고 하면,
//
//
//        // 근데 이렇게 생각하면 JAZ 같은 케이스를 풀 수가 없다.
//        for (int i = 0 ; i < name.length()-1; i ++ ) {
//            if (target[i]=='A' && target[i+1]=='A') {
//
//            } else {
//                right_count++;
//            }
//
//            int k = i + 1;
//            while (k < target.length && target[k] == 'A'){
//                k++;
//            }
//             mov_count = Math.min(move_count,i + target.length - k + i );
//        }
//        //System.out.println("마지막 A : " + ( name.length() -  name.lastIndexOf("A")-1) ) ;
//        //System.out.println("첫번째 A : " +  name.indexOf("A"));
//
//
//
//    answer = answer+mov_count;
//        System.out.println("좌우 조작 횟수 : " + count);
//        System.out.println("최종 조작 횟수 : " + answer);
//
//        return answer;
//    }
//}
//
//
//// 3
//// 4
//// 7
//// 8
//// 10 12 13 14 15 18 19 20 21 22 23 25