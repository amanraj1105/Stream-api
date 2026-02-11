package uc27;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class StreamSumAverageDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        OptionalDouble average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average();

        System.out.println("UC 2.7 Output:");
        System.out.println("Sum: " + sum);
        average.ifPresent(avg -> System.out.println("Average: " + avg));
    }
}