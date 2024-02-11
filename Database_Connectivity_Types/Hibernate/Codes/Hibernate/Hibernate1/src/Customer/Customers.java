package Customer;

import javax.persistence.Entity;
import javax.persistence.Id;
@ Entity//to this step compulsary
public class Customers
{
	@Id
	private int customerid;
	private String customername;
	private String address;
	private long phonenumber;
	
	
	
	public Customers() {
		super();
	}



	public Customers(int customerid, String customername, String address, long phonenumber) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.address = address;
		this.phonenumber = phonenumber;
	}



	public int getCustomerid() {
		return customerid;
	}



	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}



	public String getCustomername() {
		return customername;
	}



	public void setCustomername(String customername) {
		this.customername = customername;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public long getPhonenumber() {
		return phonenumber;
	}



	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	
	
	
}
