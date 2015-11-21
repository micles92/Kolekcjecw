package com.collections.micles92;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Bolesław on 2015-11-20.
 */
public class ArrayLoop {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<Integer>();

        arrlist.add(14);
        arrlist.add(7);
        arrlist.add(39);
        arrlist.add(40);

        for(int i=0;i < arrlist.size();i++){
            System.out.println(arrlist.get(i));
        }

        //foreach
        System.out.println("For Each: ");

        for(int tmp: arrlist){
            System.out.println(tmp);
        }

        System.out.println("Petla While:");
        int counter = 0;
        while(counter<arrlist.size()){
            System.out.println(arrlist.get(counter));
            counter++;
        }
        //looping array List using Iterator
        System.out.println("Iterator:");
        Iterator iter = arrlist.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
