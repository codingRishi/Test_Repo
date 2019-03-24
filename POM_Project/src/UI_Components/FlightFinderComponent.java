package UI_Components;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightFinderComponent {
	
	@FindBy(name="tripType")
	static List<WebElement> tripTypeRadios;
	
	
	
	
	public boolean verifyRadioSize() {
		if(tripTypeRadios.size()==2)
		    return true;
		else 
			return false;  
	}

}
