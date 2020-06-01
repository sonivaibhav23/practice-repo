package vaibhav.practice.repo.springfundamentals.springboot.autowiringbytype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import vaibhav.practice.repo.springfundamentals.springboot.autowiringbytype.beans.BinarySearchImpl;

@SpringBootApplication
public class AutowiringByTypeApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(AutowiringByTypeApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(AutowiringByTypeApplication.class);

        BinarySearchImpl binarySearch = run.getBean(BinarySearchImpl.class);

        binarySearch.search(new int[] {1, 4, 5, 6}, 3);
    }
}
