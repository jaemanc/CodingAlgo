package com.org.jmc.스택큐;

import java.util.*;

class Person {
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class 응급실스택 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peopleNum = sc.nextInt();
        int id = sc.nextInt();

        int answer = 1;
        Queue<Person> queue = new LinkedList<>();

        for (int i=0; i<peopleNum; i++) {
            queue.offer(new Person(i,sc.nextInt()));
        }

        while (!queue.isEmpty()) {
            Person temp = queue.poll();
            for (Person person : queue) {
                if (person.priority > temp.priority) {
                    queue.offer(temp);
                    temp = null;
                    break;
                }
            }
            if (temp != null) {
                if (temp.id == id) {
                    System.out.println(answer);
                } else {
                    answer++;
                }
            }
        }
    }
}
