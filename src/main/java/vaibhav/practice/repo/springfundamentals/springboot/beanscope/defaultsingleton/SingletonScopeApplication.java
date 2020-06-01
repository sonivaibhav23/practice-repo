package vaibhav.practice.repo.springfundamentals.springboot.beanscope.defaultsingleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import vaibhav.practice.repo.springfundamentals.springboot.beanscope.defaultsingleton.beans.BinarySearchImpl;

@SpringBootApplication
public class SingletonScopeApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SingletonScopeApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SingletonScopeApplication.class);

        BinarySearchImpl binarySearch = run.getBean(BinarySearchImpl.class);
        BinarySearchImpl binarySearch1 = run.getBean(BinarySearchImpl.class);

//        LOGGER.info("*************** Printing Both the beans hashcode ***************");
//        LOGGER.info("{}", binarySearch);
//        LOGGER.info("{}", binarySearch1);
//        LOGGER.info("****************************************************************");

        for (String name : run.getBeanDefinitionNames()) {
            System.out.println(name);
        }
    }
}
