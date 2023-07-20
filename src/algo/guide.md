## 자주 사용 되는 문법 등 정리.


#### 이중 배열 정렬

   ```Java
# comparator 구현    

    tickets
    [["ICN", "SFO"], ["ICN", "ATL"], ["SFO", "ATL"],["ATL", "ICN"], ["ATL","SFO"]]
    와 같은 경우 순서를 위해 정렬한다면 다음과 같이 사용 가능.

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
 ```
#### compareTo 구현
```Java
   # compareTo
    Arrays.sort(str, new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return (o2+o1).compareTo(o1+o2);
        }
    });

    # 문자형 비교 :
        StrA.compareTo(StrB);
            A != B -> return 다른 문자 개수;
        
        동일한 문자로 시작 하지 않을 경우 + 중간은 같은 문자일 경우.
        각각의 문자열에서 가장 낮은 아스키 코드이 차이값 리턴.
            A != B -> return 아스키 코드의 차이값;
    
    # 숫자형 비교 :
        A.compareTo(B);
            A == B -> return 0;
            A > B -> return 1;
            A < B -> return -1;
```
     
#### ArrayList -> [] 배열 변환     
```Java
 # Arraylist to answer[] 변환
 String[] answer = answers.toArray(new String[answers.size()]);
```

#### List< Integer >   <- ->   Integer[]
```Java
List<Integer> IntegerList = new ArrayList<>();
IntegerList.add(1);
IntegerList.add(13);

List<Integer> IntegerLis2 = new ArrayList<>();
IntegerLis2.add(55);

// Integer array <- -> Integer list
Integer[] IntegerArr = IntegerList.toArray(Integer[]::new);

List<Integer> IntegerArrToIntegerList = Arrays.asList(IntegerArr);

// 정렬
        Arrays.sort(IntegerArr, Collections.reverseOrder());

/// int array <- -> Integer list
int[] arrInt = IntegerLis2.stream().mapToInt(i->i).toArray();

int[] arrInt2 = IntegerLis2.stream().mapToInt(Integer::intValue).toArray();

// filter로 한번 거를때.
int[] arrInt3 = IntegerLis2.stream().filter(i -> i != null).mapToInt(Integer::intValue).toArray();
```


String[] strArr = {"aa","bb","cc","dd","ee"};


// String array <- -> String List
List<String> strList = Arrays.asList(strArr);

String[] listToArray = strList.toArray(new String[strList.size()]);

String[] listToArray2 = strList.stream().toArray(String[]::new);

// filter로 거를 때
String[] temp = strList.stream().filter(str -> str.contains("ee")).toArray(String[]::new);

// 정렬
Arrays.sort(temp, Collections.reverseOrder());
```


