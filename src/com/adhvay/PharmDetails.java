/* DB to store Pharmacy details */

package com.adhvay;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class PharmDetails {

	
	@Persistent
	private String Name;

	@Persistent
	private String Mobile;
	
	@PrimaryKey
	@Persistent	
	private String Email;
	
	@Persistent
	private String Password;

	public PharmDetails(String name, String mobile, String email, String password) {
		
		this.Name = name;
		this.Mobile = mobile;
		this.Email = email;
		this.Password = password;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		this.Mobile = mobile;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		this.Password = password;
	}

	@Override
	   public String toString() {
	        return ("Name:"+this.getName()+
	                    " Mobile No: "+ this.getMobile() +
	                    " Email: "+ this.getEmail() +
	                    " Password : " + this.getPassword());
	   }
}
