package vaibhav.practice.repo.springfundamentals.springboot.beanscope.defaultsingleton.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import vaibhav.practice.repo.springfundamentals.springboot.common.SortAlgorithm;

@Component
public class BinarySearchImpl {

	@Autowired
	private SortAlgorithm bubbleSortAlgorithm;

	public int search(int[] array, int value) {
		int[] sort = bubbleSortAlgorithm.sort(array);
		System.out.println(bubbleSortAlgorithm);
		return 3;
	}

}
