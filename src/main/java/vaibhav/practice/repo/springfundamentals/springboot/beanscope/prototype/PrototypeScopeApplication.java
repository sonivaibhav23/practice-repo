package vaibhav.practice.repo.springfundamentals.springboot.beanscope.prototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import vaibhav.practice.repo.springfundamentals.springboot.beanscope.prototype.beans.BinarySearchImpl;

@SpringBootApplication
public class PrototypeScopeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(PrototypeScopeApplication.class);

		BinarySearchImpl binarySearch = run.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = run.getBean(BinarySearchImpl.class);

		System.out.println("HashCode of binarySearch " + binarySearch.hashCode());
		System.out.println("HashCode of binarySearch1 " + binarySearch1.hashCode());
	}
}

// private static Logger LOGGER = LoggerFactory.getLogger(PrototypeScopeApplication.class);
//LOGGER.info("*************** Printing Both the beans hashcode ***************");
//LOGGER.info("{}", binarySearch);
//LOGGER.info("{}", binarySearch1);
//LOGGER.info("****************************************************************");
