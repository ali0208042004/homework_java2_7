package com.company;

import java.util.*;

public class Main {
    public static ArrayList<String> list3 = new ArrayList<>();

    public static void main(String[] args) {

        //ListA
        System.out.println("Ввод листа A");
        ArrayList<String> namesA = new ArrayList<>();

        ForList forList = new ForList();
        forList.input(namesA);
        Collections.sort(namesA);

        //List B
        System.out.println("\nВвод листа B");
        ArrayList<String> namesB = new ArrayList<>();

        forList.input(namesB);
        Collections.sort(namesB);
        Collections.reverse(namesB);

        forList.Output(namesA, namesB);
        System.out.println(list3);

    }
}
