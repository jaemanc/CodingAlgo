package algo.문자열;


import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {

    // leet code
    // https://leetcode.com/problems/longest-common-prefix/description/
    public static void main(String[] args) {
        String one = "flot";
        String two = "flow";

        // String[] strs = {"dog","racecar","car", "flower","flow", "flight"};
        String[] strs = {"ab","a","ac","abc"};

        String prefix="";
        if(strs.length == 0){
            System.out.println(prefix);
        }

        prefix = strs[0];

        for(int i=1; i<strs.length; i++){
            String cur = strs[i];
            while(cur.indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        System.out.println( prefix);
    }

}
