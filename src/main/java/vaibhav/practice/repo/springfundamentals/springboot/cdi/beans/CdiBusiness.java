package vaibhav.practice.repo.springfundamentals.springboot.cdi.beans;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CdiBusiness {

    @Inject
    private CdiDao cdiDao;

    public CdiDao getCdiDao() {
        return cdiDao;
    }
}
