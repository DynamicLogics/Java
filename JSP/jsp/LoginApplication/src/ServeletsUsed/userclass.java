package ServeletsUsed;

import java.io.Serializable;

public class userclass implements Serializable
{
	String name;
	String password;
	String confirm_passwprd;
	
	
	
	public userclass() {
		super();
	}



	public userclass(String name, String password, String confirm_passwprd) {
		super();
		this.name = name;
		this.password = password;
		this.confirm_passwprd = confirm_passwprd;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getConfirm_passwprd() {
		return confirm_passwprd;
	}



	public void setConfirm_passwprd(String confirm_passwprd) {
		this.confirm_passwprd = confirm_passwprd;
	}

	
	
	
}
