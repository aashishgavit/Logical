package DSA;

import java.util.*;

public class SecondHighest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 5, 20, 8, 20, 15);

        int secondHighest = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow();

        System.out.println("Second Highest: " + secondHighest);
    }
}
