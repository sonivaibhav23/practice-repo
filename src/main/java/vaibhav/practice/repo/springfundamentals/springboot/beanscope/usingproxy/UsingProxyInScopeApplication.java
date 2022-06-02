package vaibhav.practice.repo.springfundamentals.springboot.beanscope.usingproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import vaibhav.practice.repo.springfundamentals.springboot.beanscope.usingproxy.beans.PersonDao;

@SpringBootApplication
public class UsingProxyInScopeApplication {

	public static void main(String[] args) {
		ApplicationContext run = SpringApplication.run(UsingProxyInScopeApplication.class);

		PersonDao personDao = run.getBean(PersonDao.class);
		PersonDao personDao1 = run.getBean(PersonDao.class);

		System.out.println(personDao);
		System.out.println(personDao.getJdbcTemplate());
		System.out.println(personDao1);
		System.out.println(personDao1.getJdbcTemplate());
	}
}
