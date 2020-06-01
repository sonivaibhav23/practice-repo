package vaibhav.practice.repo.springfundamentals.springboot.autowiringbyname.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vaibhav.practice.repo.springfundamentals.springboot.common.SortAlgorithm;

@Component
public class BinarySearchImpl {

    /**
     * example Autowiring by name
     * here we are using parameter name as bubbleSortAlgorithm, which is the name of the bean BubbleSortAlgorithm
      */
    @Autowired
    private SortAlgorithm bubbleSortAlgorithm;

    public BinarySearchImpl(SortAlgorithm bubbleSortAlgorithm) {
        this.bubbleSortAlgorithm = bubbleSortAlgorithm;
    }

    public int search(int[] array, int value) {
        // first sort the array
        int[] sort = bubbleSortAlgorithm.sort(array);

        // retuning a dummy value
        System.out.println(bubbleSortAlgorithm);
        return 3;
    }

}
