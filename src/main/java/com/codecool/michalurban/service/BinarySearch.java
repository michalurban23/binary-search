package com.codecool.michalurban.service;

import java.util.List;

public class BinarySearch<T extends Comparable> implements SearchAlgorithm<T> {

    private boolean searchResult;

    @Override
    public boolean search(List<T> orderedList, T toFind) {

        int size = orderedList.size();
        int middleIndex = size / 2;
        T middleElem = orderedList.get(middleIndex);

        if (middleElem.compareTo(toFind) == 0) {
            searchResult = true;
        } else {
            if (size == 1) {
                searchResult = false;
            } else if (middleElem.compareTo(toFind) < 0) {
                search(orderedList.subList(middleIndex, size), toFind);
            } else {
                search(orderedList.subList(0, middleIndex), toFind);
            }
        }
        return searchResult;
    }
}