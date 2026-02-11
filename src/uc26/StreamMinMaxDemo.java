package uc26;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 6, 2, 8, 10, 5);

        Optional<Integer> minEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .min(Integer::compareTo);

        Optional<Integer> maxEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .max(Integer::compareTo);

        System.out.println("UC 2.6 Output:");
        minEven.ifPresent(min -> System.out.println("Min Even: " + min));
        maxEven.ifPresent(max -> System.out.println("Max Even: " + max));
    }
}