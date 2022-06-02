package vaibhav.practice.repo.springfundamentals.springboot.autowiringusingqualifier.beans;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import vaibhav.practice.repo.springfundamentals.springboot.common.SortAlgorithm;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {

	@Override
	public int[] sort(int[] array) {
		Arrays.sort(array);
		return array;
	}
}
