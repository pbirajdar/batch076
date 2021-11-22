package org.bridgelabz.junitdemo.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CollectionDemo {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);

        int[] arrayLists = new int[10];
        int[][] twoDarray = new int[4][10];

        ArrayList<ArrayList<Integer>> arrayLists2d = new ArrayList<>();
        ArrayList<Integer> arrayCol = new ArrayList<>();
        arrayCol.add(10);
        arrayCol.add(20);
        arrayCol.add(30);
        arrayLists2d.add(arrayCol);

    }
}
