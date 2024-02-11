package Customer;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address
{
	private String Country;
	private String Area;
	private String State;
	private String Road;
	@Id
	private String Pin;
	
	public  Address()
	{
		super();
	}

	public Address(String country, String area, String state, String road, String pin) 
	{
		
		Country = country;
		Area = area;
		State = state;
		Road = road;
		Pin = pin;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getRoad() {
		return Road;
	}

	public void setRoad(String road) {
		Road = road;
	}

	public String getPin() {
		return Pin;
	}

	public void setPin(String pin) {
		Pin = pin;
	}
	
}
