package vaibhav.practice.repo.mockitoexample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMultipleReturnMockTest {

	@Mock
	DataService dataServiceMock;

	@InjectMocks
	SomeBusinessImpl someBusiness;

	@Test
	public void singleReturn() {
		Mockito.when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 24, 14, 20 });
		int result = someBusiness.findTheGreatestFromAllData();

		assertEquals(result, 24);
	}

	@Test
	public void multipleReturns() {
		Mockito.when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 24, 14, 20 })
				.thenReturn(new int[] { 10, 20 });

		// when it's called first time
		int firstRun = someBusiness.findTheGreatestFromAllData();
		// when it's called second time
		int secondRun = someBusiness.findTheGreatestFromAllData();

		assertEquals(firstRun, 24);
		assertEquals(secondRun, 20);
	}

}
