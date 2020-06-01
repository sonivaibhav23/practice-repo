package vaibhav.practice.repo.springfundamentals.springboot.cdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import vaibhav.practice.repo.springfundamentals.springboot.cdi.beans.CdiBusiness;

@SpringBootApplication
public class CdiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext run = SpringApplication.run(CdiDemoApplication.class);

        CdiBusiness business = run.getBean(CdiBusiness.class);

        System.out.println(business);
        System.out.println(business.getCdiDao());
    }
}
