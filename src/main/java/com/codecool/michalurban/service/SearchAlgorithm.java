package com.codecool.michalurban.service;

import java.util.List;

public interface SearchAlgorithm<T extends Comparable> {

    boolean search(List<T> orderedList, T toFind);
}