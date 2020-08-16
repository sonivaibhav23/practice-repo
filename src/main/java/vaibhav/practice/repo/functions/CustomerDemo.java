package vaibhav.practice.repo.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

public class CustomerDemo {

	public static void main(String[] args) {
		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("Your message consumed : " + t.toUpperCase());
			}
		};

		Consumer<String> thankYouConsumer = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("Thank you for choosing us.");
			}
		};

		List<String> vegitables = new ArrayList<>();
		vegitables.add("potato");
		vegitables.add("spanish");
		vegitables.add("green chilly");
		vegitables.add("capsicum");

		vegitables.stream().forEach(consumer.andThen(thankYouConsumer));

		TrashPaper tp = new TrashPaper();
		tp.accept(10);
	}
}

class TrashPaper implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println("Papers thrased count : " + t);
	}

}

class MoneySaver implements DoubleConsumer {

	@Override
	public void accept(double value) {

	}

}
