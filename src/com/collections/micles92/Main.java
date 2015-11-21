package com.collections.micles92;

import java.util.ArrayList;

/**
 * Created by Bolesław on 2015-11-13.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        /*This is how elements should be added to the array list*/

        list.add("Mike");
        list.add("Andrew");
        list.add("Sophia");
        list.add("Drone");
        list.add("Sztyg");

        list.set(0, "Sztyg");

        int pos = list.indexOf("Drone");
        String str = list.get(3);

        System.out.println("Na pozycji 3: " +str);
        System.out.println("Pozycja: " + pos);

        System.out.println("Obecne elementy array listy:"+list);

        //add element at the given index.

        list.add(0, "Zed");
        list.add(1, "Xeon");

        System.out.println("Obecne elementy array listy:"+list);

        //remove elements from array list like this.

        list.remove("Drone");
        list.remove("Adnrew");

        list.remove(5);


        System.out.println("Obecne elementy array listy:"+list);

        //size of.
        int numberofitems = list.size();
        System.out.println("Wielkosc listy: " +numberofitems);
        boolean zaw = list.contains("Zed");
        System.out.println(zaw);

        list.clear();

        System.out.println(list);


    }
}
