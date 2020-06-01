package vaibhav.practice.repo.springfundamentals.springboot.autowiringbytype.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vaibhav.practice.repo.springfundamentals.springboot.common.SortAlgorithm;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int search(int[] array, int value) {
        // first sort the array
        int[] sort = sortAlgorithm.sort(array);

        // retuning a dummy value
        System.out.println(sortAlgorithm);
        return 3;
    }

}
