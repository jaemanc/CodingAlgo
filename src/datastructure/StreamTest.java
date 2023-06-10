package com.org.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {
        List<String> sList = new ArrayList<>();
        sList.add("min-su");
        sList.add("chul-su");
        sList.add("gyung-su");


        // 내부적으로 sList의 모든 요소를 가지고 있게 된다.
        Stream<String> stream = sList.stream();

        // forEach()를 쓴다면 모든 요소를 하나씩 가져와서 처리한다.
        // 차례대로 가져와서 변수 s에 대입되고 이를 매개변수로 받아 출력문이 호출.
        stream.forEach(s -> System.out.println(s));

        //Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
        //	at java.util.stream.AbstractPipeline.sourceStageSpliterator(AbstractPipeline.java:279)
        //	at java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.java:580)
        //	at com.org.datastructure.StreamTest.main(StreamTest.java:24)
        // 소모 되어서 쓸 수 없다.
        stream.forEach(s -> System.out.println(s + " 소모? "));

        // 스트림 생성 + 정렬 + 요소를 하나씩 꺼내서 출력.
        sList.stream().sorted().forEach(s -> System.out.println(s));


        // 모든 요소의 합을 구할 떄에, 두 번째 매개변수에 람다식이 들어간 케이스
        // Arrays.stream(arrayss).reduce(0, (a,b) -> a + b);

        // 람다식을 직접 구현한다면.
        String[] greetings = {"안녕하세요?", "hello" , "good Morning" ,};
        System.out.println( Arrays.stream(greetings).reduce("", (s1, s2) -> {
            if (s1.getBytes().length >= s2.getBytes().length)
                return s1;
            else
                return s2;
        }));

        // 바이너리 오퍼레이터를 구현한 클래스를 쓴다면. 쓰고자 하는 클래스가 바이너리 오퍼레이터를 상속받아 구현해야 한다.

        // filter - 조건을 넣고 그 조건에 맞는 참인 경우 추출,
        // 문자열 배열이 있을 때 문자열의 길이가 5이상인 경우를 추출한다면 다음과 같다.
        sList.stream().filter(s -> s.length() >= 5).forEach(s -> System.out.println(s));

        // map - 클래스가 가진 자료 중 이름만 출력하는 경우에 사용.
        Customer customer = new Customer();
        List<Customer> customerList = new ArrayList<>();
        customerList.stream().map( c -> c.getName()).forEach(s -> System.out.println());
        // filter / map 모두 함수를 수행하면서 해당 조건, 함수에 맞는 결과를 추출해 내는 중간 역할임.
        // 최종 연산으로 중간연산 결과를 출력하도록 했음.

        // >>> 순서는 스트림을 생성하고, 중간 연산 조건을 지정하고, 최종 연산에서 출력한다.



        int[] arr = {1,2,3,4,5};
        int sumVal = Arrays.stream(arr).sum();
        int count = (int)Arrays.stream(arr).count();



        Integer sumValue = Arrays.stream(arr).reduce(0, Integer::sum);

        /*
            최종연산 : stream 자료를 소모하면서, 연산을 수행한다. 따라서 최종 연산이 수행된 시점에서는
            해당 스트림을 더 이상 사용 할 수 없다.
            최종 연산은 결과를 만드는데 사용.
         */
        // forEach() <- 요소 하나씩 꺼내기, count() <- 통계용, sum() <- 통계용, reduce()

    }

}

class Customer {

    String name;
    String num;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNum() {
        return num;
    }
    public void setNum(String num) {
        this.num = num;
    }
}