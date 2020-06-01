package vaibhav.practice.repo.springfundamentals.springboot.autowiringbytype.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import vaibhav.practice.repo.springfundamentals.springboot.common.SortAlgorithm;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {
    @Override
    public int[] sort(int[] array) {
        return array;
    }
}
