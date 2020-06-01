package vaibhav.practice.repo.springfundamentals.springboot.restwebservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vaibhav.practice.repo.springfundamentals.springboot.restwebservice.model.Cycle;
import vaibhav.practice.repo.springfundamentals.springboot.restwebservice.service.SomeService;

import java.util.List;

@RestController
public class SomeController {

    @Autowired
    private SomeService someService;

    @GetMapping("/hello")
    public List<Cycle> getCycles() {
        return someService.getCycleDetails();
    }
}
