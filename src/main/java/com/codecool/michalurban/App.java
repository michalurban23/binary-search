package com.codecool.michalurban;

import com.codecool.michalurban.service.BinarySearch;
import com.codecool.michalurban.service.SearchAlgorithm;

import java.util.*;

public class App {

    private static List<Number> orderedList;
    private static Integer toFind;

    public static void main( String[] args ) {

        SearchAlgorithm search = new BinarySearch();

        for (int i = 0; i < 100; i++) {

            fillListWithIntegers();

            boolean result = search.search(orderedList, toFind);
            System.out.println("Expected: " + orderedList.contains(toFind) + " , Actual: " + result);}
    }

    private static void fillListWithIntegers() {

        orderedList = new ArrayList<>();
        Random rand = new Random();
        int limit = 999;

        for (int i = 0; i < limit; i++) {
            orderedList.add(rand.nextInt(limit));
        }
        orderedList.sort(null);

        toFind = rand.nextInt(limit);
    }

}
