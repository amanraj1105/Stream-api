package uc24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterDemo {

    public static void main(String[] args) {

        // UC 2.4: Filter even numbers from the stream

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("UC 2.4 Output:");
        System.out.println(evenNumbers);
    }
}