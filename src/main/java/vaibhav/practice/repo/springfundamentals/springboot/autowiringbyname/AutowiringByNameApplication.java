package vaibhav.practice.repo.springfundamentals.springboot.autowiringbyname;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import vaibhav.practice.repo.springfundamentals.springboot.autowiringbyname.beans.BinarySearchImpl;

@SpringBootApplication
public class AutowiringByNameApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(AutowiringByNameApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(AutowiringByNameApplication.class);

        BinarySearchImpl binarySearch = run.getBean(BinarySearchImpl.class);

        binarySearch.search(new int[] {1, 4, 5, 6}, 3);
    }
}
