package vaibhav.practice.repo.springfundamentals.springboot.autowiringusingqualifier.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import vaibhav.practice.repo.springfundamentals.springboot.common.SortAlgorithm;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {

    @Override
    public int[] sort(int[] array) {
        return array;
    }

}
