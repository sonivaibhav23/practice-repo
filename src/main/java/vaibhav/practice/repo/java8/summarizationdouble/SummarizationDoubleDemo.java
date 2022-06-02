package vaibhav.practice.repo.java8.summarizationdouble;

import java.math.BigDecimal;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SummarizationDoubleDemo {

	public static void main(String[] args) {
		Stream<BigDecimal> bigDecimalStream = Stream
				.iterate(BigDecimal.ONE, bigDecimal -> bigDecimal.add(BigDecimal.ONE)).limit(10)
				.peek(System.out::println);

		DoubleSummaryStatistics doubleSummaryStatistics = bigDecimalStream
				.collect(Collectors.summarizingDouble(BigDecimal::doubleValue));

		System.out.println(doubleSummaryStatistics);

		Stream<Integer> integerStream = Stream.iterate(1, i -> i + 1).limit(10).peek(System.out::println);

		IntSummaryStatistics intSummaryStatistics = integerStream.collect(Collectors.summarizingInt(i -> i));

		System.out.println(intSummaryStatistics);
	}
}
