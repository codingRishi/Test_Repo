package Tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class FlightFinderTest extends AbstractTest{

	@Test(priority = 0, description="Verify Flight Finder View")
	public void verifyFlightFinder() {
		loginComponent.login();
		
		assertTrue(flightFinderComponent.verifyRadioSize(), "Verify the size of TripType radios");
	}
}
