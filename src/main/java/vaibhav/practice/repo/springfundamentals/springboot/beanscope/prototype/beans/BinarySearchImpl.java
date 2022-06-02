package vaibhav.practice.repo.springfundamentals.springboot.beanscope.prototype.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import vaibhav.practice.repo.springfundamentals.springboot.common.SortAlgorithm;

@Component
@Scope("prototype")
public class BinarySearchImpl {

	@Autowired
	private SortAlgorithm bubbleSortAlgorithm;

	public int search(int[] array, int value) {
		int[] sort = bubbleSortAlgorithm.sort(array);
		System.out.println(bubbleSortAlgorithm);
		return 3;
	}

}
