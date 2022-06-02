package vaibhav.practice.repo.springfundamentals.springboot.beanscope.defaultsingleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import vaibhav.practice.repo.springfundamentals.springboot.beanscope.defaultsingleton.beans.BinarySearchImpl;

@SpringBootApplication
public class SingletonScopeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SingletonScopeApplication.class);

		BinarySearchImpl binarySearch = run.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = run.getBean(BinarySearchImpl.class);

		System.out.println("HashCode of binarySearch " + binarySearch.hashCode());
		System.out.println("HashCode of binarySearch1 " + binarySearch1.hashCode());
	}
}

// private static Logger LOGGER = LoggerFactory.getLogger(SingletonScopeApplication.class);
//LOGGER.info("*************** Printing Both the beans hashcode ***************");
//LOGGER.info("{}", binarySearch);
//LOGGER.info("{}", binarySearch1);
//LOGGER.info("****************************************************************");

//for (String name : run.getBeanDefinitionNames()) {
//	System.out.println(name);
//}
