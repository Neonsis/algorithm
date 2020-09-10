package org.neonsis.easy;

import java.util.ArrayList;
import java.util.List;

/*
    Find product of sum, if element is sub-array count sum of this array and multiply by depth
    Array: [5,2,[7,-1],3,[6,[-13,8],4]]
    Result = 12
 */

public class ProductSum {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(5);
        list.add(2);
        list.add(List.of(7, -1));
        list.add(3);
        list.add(List.of(6, List.of(-13, 8), 4));
        int i = countProductSum(list);
        System.out.println(i);
    }

    public static int countProductSum(List<Object> list) {
        return countProductSum(list, 1);
    }

    // Recursion solution (n) - time, (1) - space
    public static int countProductSum(List<Object> list, int depth) {
        int count = 0;
        for (Object o : list) {
            if (o.getClass().equals(Integer.class)) {
                count += (Integer) o;
            } else {
                count += countProductSum((List<Object>) o, depth + 1);
            }
        }
        return count * depth;
    }
}
