package vaibhav.practice.repo.mockitoexample;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessImplMockTest {

    @Test
    public void findTheGreatestFromAllDataTest() {

        DataService mockDataService = mock(DataService.class);
        when(mockDataService.retrieveAllData()).thenReturn(new int[] {24, 20, 22});

        SomeBusinessImpl someBusiness = new SomeBusinessImpl(mockDataService);
        int result = someBusiness.findTheGreatestFromAllData();

        assertEquals(24, result);
    }

    @Test
    public void findTheGreatestFromAllDataTest_ForOneValue() {

        DataService mockDataService = mock(DataService.class);
        when(mockDataService.retrieveAllData()).thenReturn(new int[] {20});

        SomeBusinessImpl someBusiness = new SomeBusinessImpl(mockDataService);
        int result = someBusiness.findTheGreatestFromAllData();

        assertEquals(20, result);
    }
}
