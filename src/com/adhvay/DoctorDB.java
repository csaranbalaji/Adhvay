package com.adhvay;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class DoctorDB {
	
	@PrimaryKey
	@Persistent(defaultFetchGroup="true")
	private String DoctorID;
	
	@Persistent
	private String Password;

	public String getDoctorID() {
		return DoctorID;
	}

	public String getPassword() {
		return Password;
	}

	public DoctorDB(String doctorID, String password) {
		DoctorID = doctorID;
		Password = password;
	}
	
	

}
