package com.company;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ForList {
    public void input (List<String>list){
        for (int i = 0; i <5; i++) {
            list.add(new Scanner(System.in).next());

        }
    }

    public void Output(List<String>list1, List<String>list2){
        Iterator<String> iter1= list1.iterator();
        Iterator<String> iter2 = list2.iterator();
        while (iter1.hasNext() && iter2.hasNext()) {
           Main.list3.add(iter1.next());
           Main.list3.add(iter2.next());
        }

    }
}
