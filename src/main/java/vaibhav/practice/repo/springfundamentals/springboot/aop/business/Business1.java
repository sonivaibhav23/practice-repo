package vaibhav.practice.repo.springfundamentals.springboot.aop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vaibhav.practice.repo.springfundamentals.springboot.aop.annotation.TrackTime;
import vaibhav.practice.repo.springfundamentals.springboot.aop.data.Dao1;

@Service
public class Business1 {

    @Autowired
    private Dao1 dao1;

    @TrackTime
    public String calculateSomething() {
        return dao1.retrieveData();
    }

//    public String divideNumbers() throws NumberFormatException {
//        throw new NumberFormatException();
//    }
}
