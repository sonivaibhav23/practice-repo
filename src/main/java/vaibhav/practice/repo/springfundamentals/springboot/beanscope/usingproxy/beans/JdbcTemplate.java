package vaibhav.practice.repo.springfundamentals.springboot.beanscope.usingproxy.beans;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class JdbcTemplate {

	public JdbcTemplate() {
		// I am a JdbcTemplate Bean
	}
}
