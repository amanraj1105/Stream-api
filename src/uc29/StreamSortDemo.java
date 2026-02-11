package uc29;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(9, 3, 7, 1, 5, 2);

        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("UC 2.9 Output:");
        System.out.println(sortedNumbers);
    }
}