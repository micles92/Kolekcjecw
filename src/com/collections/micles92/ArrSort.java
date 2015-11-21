package com.collections.micles92;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Bolesław on 2015-11-21.
 */
public class ArrSort {
    public static void main(String[] args) {
        //In this tutorial we have shared the examples of sorting an String ArrayList and Integer ArrayList.

        //Sorting arraylist STRING

        ArrayList<String> listofcountries = new ArrayList<String>();

        listofcountries.add("India");
        listofcountries.add("US");
        listofcountries.add("China");
        listofcountries.add("Denmark");

        /*unsorted list */

        for(String tmp: listofcountries){
            System.out.println(tmp);
        }
        /* sort statement. */

        Collections.sort(listofcountries);

        /* sorted list */
        System.out.println("Posortowane------------------------------");

        for(String tmp: listofcountries){
            System.out.println(tmp);
        }

        ArrayList<Integer>liczby = new ArrayList<Integer>(){{
            add(1);
            add(6);
            add(9999);
            add(2);
        }};
        System.out.println("--------------Lista integer: ------------------------");
        for(int i=0;i<liczby.size();i++){
            System.out.println(liczby.get(i));
        }
        System.out.println("--------------Lista posortowanych integer: ------------------------");

        Collections.sort(liczby);

        for(int tmp: liczby){
            System.out.println(tmp);
        }
    }
}
