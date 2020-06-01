package vaibhav.practice.repo.mockitoexample;


import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class SomeBusinessImplStubTest {

    @Test
    public void findTheGreatestFromAllDataTest() {
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(new DataServiceStub());
        int result = someBusiness.findTheGreatestFromAllData();

        assertEquals(24, result);

    }
}

class DataServiceStub implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[] {24, 13, 16};
    }
}



