package uc23;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectDemo {

    public static void main(String[] args) {

        // UC 2.3: Store transformed values into a new List using collect()

        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println("UC 2.3 Output:");
        System.out.println(squaredNumbers);
    }
}