package vaibhav.practice.repo.springfundamentals.springboot.aop.data;

import org.springframework.stereotype.Repository;
import vaibhav.practice.repo.springfundamentals.springboot.aop.annotation.TrackTime;

@Repository
public class Dao1 {

    public String retrieveData() {
        return "dao1";
    }
}
