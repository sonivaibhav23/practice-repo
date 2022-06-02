package vaibhav.practice.repo.springfundamentals.springboot.beanscope.defaultsingleton.beans;

import java.util.Arrays;

import org.springframework.stereotype.Component;

import vaibhav.practice.repo.springfundamentals.springboot.common.SortAlgorithm;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm {

	@Override
	public int[] sort(int[] array) {
		Arrays.sort(array);
		return array;
	}
}
