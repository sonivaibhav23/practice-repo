package vaibhav.practice.repo.springfundamentals.springboot.autowiringbyname.beans;

import org.springframework.stereotype.Component;
import vaibhav.practice.repo.springfundamentals.springboot.common.SortAlgorithm;

import java.util.Arrays;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm {

    @Override
    public int[] sort(int[] array) {
        // dummy implementation of bubble sorting
        Arrays.sort(array);
        return array;
    }
}
