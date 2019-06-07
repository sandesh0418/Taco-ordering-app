package tacos;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.CreditCardNumber;

public class Order {
	
	@NotBlank(message="Name is required")
	private String name;
	@NotBlank(message="City is required")
	private String city;
	@NotBlank(message="Street is required")
	private String street;
	@NotBlank(message="State is required")
	private String state;
	@NotBlank(message="Zip is required")
	private String zip;
	@CreditCardNumber(message="Not a valid credit card number")
	private String creditNum;
	@Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$", message="Must be formatted MM/YY")
	private String ccExpiration;
	@Digits(integer= 3, fraction = 0, message="Invalid CCV")
	private String ccCCV;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCreditNum() {
		return creditNum;
	}
	public void setCreditNum(String creditNum) {
		this.creditNum = creditNum;
	}
	public String getCcExpiration() {
		return ccExpiration;
	}
	public void setCcExpiration(String ccExpiration) {
		this.ccExpiration = ccExpiration;
	}
	public String getCcCCV() {
		return ccCCV;
	}
	public void setCcCCV(String ccCCV) {
		this.ccCCV = ccCCV;
	}
	
}
