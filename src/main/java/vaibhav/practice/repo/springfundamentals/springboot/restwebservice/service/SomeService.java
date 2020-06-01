package vaibhav.practice.repo.springfundamentals.springboot.restwebservice.service;

import org.springframework.stereotype.Service;
import vaibhav.practice.repo.springfundamentals.springboot.restwebservice.model.Cycle;

import java.util.Arrays;
import java.util.List;

@Service
public class SomeService {

    public List<Cycle> getCycleDetails() {
        return Arrays.asList(new Cycle("Cycle 1", "2019", 5000),
                new Cycle("Cycle 2", "2020", 6500),
                new Cycle("Cycle 3", "2021", 8000));
    }
}
