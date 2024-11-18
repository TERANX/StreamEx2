package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        addAndFilterHuman();

    }
    public static   void addAndFilterHuman ( ){
        List<Human> list = new ArrayList<>();
        list.add(new Human("ser",12,"proger"));
        list.add(new Human("sar",28,"dom"));
        list.add(new Human("sao",16,"electr"));
        List <Human> oldProger =
                list.stream()
                        .filter(human -> human.getAge() > 18)
                        .filter(human -> !human.getProf().equals("proger"))
                        .toList();
        System.out.println("first array"+ list);
        System.out.println("second array" + oldProger);
    }
}