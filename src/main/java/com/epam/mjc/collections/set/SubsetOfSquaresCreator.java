package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator{
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> res = new TreeSet<>();
        for (int value : sourceList) {
            res.add(value * value);

        }
        return res.subSet(lowerBound,true,upperBound,true);
    }
}
