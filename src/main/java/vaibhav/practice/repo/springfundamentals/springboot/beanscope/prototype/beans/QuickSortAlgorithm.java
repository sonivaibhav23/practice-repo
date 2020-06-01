package vaibhav.practice.repo.springfundamentals.springboot.beanscope.prototype.beans;

import org.springframework.stereotype.Component;
import vaibhav.practice.repo.springfundamentals.springboot.common.SortAlgorithm;

@Component
public class QuickSortAlgorithm implements SortAlgorithm {

    @Override
    public int[] sort(int[] array) {
        return array;
    }

}
