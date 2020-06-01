package vaibhav.practice.repo.springfundamentals.springboot.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vaibhav.practice.repo.springfundamentals.springboot.aop.business.Business1;
import vaibhav.practice.repo.springfundamentals.springboot.aop.business.Business2;

@SpringBootApplication
public class AopApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    Business1 business1;

    @Autowired
    Business2 business2;

    public static void main(String[] args) {
        SpringApplication.run(AopApplication.class);
    }

    @Override
    public void run(String... args) throws Exception {
        business1.calculateSomething();
        business2.calculateSomething();
//        business1.divideNumbers();
    }
}
