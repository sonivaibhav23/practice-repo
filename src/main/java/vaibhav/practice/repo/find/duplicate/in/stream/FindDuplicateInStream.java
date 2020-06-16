package vaibhav.practice.repo.find.duplicate.in.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicateInStream {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(10, 20, 12, 15, 16, 15, 20);

//        System.out.println(findDuplicates(stream));
//        System.out.println(findDuplicatesApproach2(stream));
        System.out.println(findDuplicatesApproach3(stream));
    }

    private static <T> Set<T> findDuplicates(Stream<T> stream) {
        Set<T> hashSet = new HashSet<>();
        return stream.filter(e -> !hashSet.add(e)).collect(Collectors.toSet());
    }

    private static <T> Set<T> findDuplicatesApproach2(Stream<T> stream) {
        return stream
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(m -> m.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }

    private static <T> Set<T> findDuplicatesApproach3(Stream<T> stream) {
        List<T> list = stream.collect(Collectors.toList());

        return list.stream().filter(element -> Collections.frequency(list, element) > 1).collect(Collectors.toSet());
    }
}

