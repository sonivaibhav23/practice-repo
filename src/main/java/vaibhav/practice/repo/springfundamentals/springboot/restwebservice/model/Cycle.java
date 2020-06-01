package vaibhav.practice.repo.springfundamentals.springboot.restwebservice.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Cycle {

    private String name;
    private String model;
    private long price;

}
