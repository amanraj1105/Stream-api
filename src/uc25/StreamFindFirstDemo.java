package uc25;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFindFirstDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 3, 5, 6, 8, 10);

        Optional<Integer> firstEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .findFirst();

        System.out.println("UC 2.5 Output:");
        firstEven.ifPresent(System.out::println);
    }
}