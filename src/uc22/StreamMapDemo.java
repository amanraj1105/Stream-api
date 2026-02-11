package uc22;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapDemo {

    public static void main(String[] args) {

        // UC 2.2: Transform each element using map()

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> doubledNumbers = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println("UC 2.2 Output:");
        System.out.println(doubledNumbers);
    }
}