/* DB to store Scan Center Details */
package com.adhvay;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class ScanDetails {

	@Persistent
	private String Name;

	@Persistent
	private String Mobile;
	
	@PrimaryKey
	@Persistent	
	private String Email;
	
	@Persistent
	private String Password;

	public ScanDetails(String name, String mobile, String email, String password) {
		
		Name = name;
		Mobile = mobile;
		Email = email;
		Password = password;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

}
