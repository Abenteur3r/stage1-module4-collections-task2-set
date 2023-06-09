package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        if (sourceList.size() == 1) {
            int num = sourceList.get(0);
            System.out.println(num);
            result.add(num);
            if (num % 2 == 0) {
                int x = num;
                while (x >= 1) {
                    result.add(x);
                    x /= 2;
                }
            } else {
                result.add(num * 2);
            }

        }
        else {
            for (int num : sourceList) {
                result.add(num);
                if (num % 2 == 0) {
                    result.add(num / 2);
                } else {
                    result.add(num * 2);
                }
            }
        }
        return result;
    }
}
