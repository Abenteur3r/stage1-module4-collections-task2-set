package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {

        Set<String> res = new HashSet<>();
        for (String elem : thirdSet) {
            if (!firstSet.contains(elem) && !secondSet.contains(elem)) {
                res.add(elem);
            }
        }
        for (String elem : firstSet){
            if (secondSet.contains(elem) && !thirdSet.contains(elem)){
                res.add(elem);
            }
        }


        return res;
    }
}
