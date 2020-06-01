package vaibhav.practice.repo.springfundamentals.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import vaibhav.practice.repo.springfundamentals.spring.beans.SomeBusiness;

@Configuration
@ComponentScan
public class SpringApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringApplication.class);

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringApplication.class);

        SomeBusiness someBusiness = context.getBean(SomeBusiness.class);

        LOGGER.info("{}", someBusiness);
        LOGGER.info("{}", someBusiness.getSomeDao());
    }
}
