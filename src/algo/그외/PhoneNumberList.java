package algo.그외;

import java.util.*;

public class PhoneNumberList {

    public static void main(String[] args){

        String[] prb =  {"119", "97674223", "115524421","1195524421","88", "12", "123", "567", "1235"};
//        String[] prb =  {"456","123","789"};

        System.out.println("answer :: " + solution(prb));
    }

//    public static boolean solution (String[] phone_book) {
//        boolean flag = true;
//
//        for (int i = 0 ; i < phone_book.length; i ++ ){
//            for (int j = i+1; j < phone_book.length; j ++ ){
//                if (phone_book[j].indexOf(phone_book[i]) > -1) {
//                    System.out.println(phone_book[i] + " ## 뭐야 : " + phone_book[j]  );
//                    flag = false;
//                    break;
//                }
//            }
//        }
//        return flag;
//    }

    public static boolean solution (String[] phone_book) {
        boolean flag = true;
        Arrays.sort(phone_book);

        for (int k = 1; k < phone_book.length-1 ; k ++ ) {

            String mid = phone_book[k];
            String bef = phone_book[k-1];
            String aft = phone_book[k+1];
           // System.out.println(" mid :: "+mid +" / bef :: " + bef) ;

            if ( mid.startsWith(bef) || mid.startsWith(aft) || bef.startsWith(mid) || aft.startsWith(mid)) {
                return false;
            }
        }
        return flag;
    }
}




















