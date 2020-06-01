package vaibhav.practice.repo.springfundamentals.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SomeBusiness {

    @Autowired
    private SomeDao someDao;

    public SomeDao getSomeDao() {
        return someDao;
    }
}
