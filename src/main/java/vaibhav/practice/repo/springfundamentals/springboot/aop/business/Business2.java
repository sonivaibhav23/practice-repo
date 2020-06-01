package vaibhav.practice.repo.springfundamentals.springboot.aop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vaibhav.practice.repo.springfundamentals.springboot.aop.data.Dao2;

@Service
public class Business2 {

    @Autowired
    private Dao2 dao2;

    public String calculateSomething() {
        return dao2.retrieveData();
    }
}
