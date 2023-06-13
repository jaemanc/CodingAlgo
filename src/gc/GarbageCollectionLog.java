package gc;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollectionLog {

    public static void main(String[] args) {

        String temp = "tempString";
        int tempInt =  1234567890;

        List<Integer> tempList = new ArrayList<>();
        tempList.add(1);
        tempList.add(2);
        tempList.add(3);
        tempList.add(4);

        for (int i=0; i<90000000; i++) {
            tempList.add(1);
            tempList.add(2);
            tempList.add(3);
            tempList.add(4);
        }
        System.out.println(temp);
        System.out.println(tempInt);

    }

}
