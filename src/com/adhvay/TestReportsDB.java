/*
 * DB to store Test Reports with optimal values 
 */
package com.adhvay;


import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable
public class TestReportsDB {
	

	@Persistent(defaultFetchGroup="true")
	private String AadharNo;

	@Persistent
	private String Test;
	
	@Persistent
	private String Value;

	@Persistent
	private String Range;

    @Persistent
	private String date;

	public TestReportsDB(String aadharNo, String test, String value, String range, String date) {
		
		this.AadharNo = aadharNo;
		this.Test = test;
		this.Value = value;
		this.Range = range;
		this.date = date;
	}

	public String getAadharNo() {
		return AadharNo;
	}

	public void setAadharNo(String aadharNo) {
		AadharNo = aadharNo;
	}

	public String getTest() {
		return Test;
	}

	public void setTest(String test) {
		Test = test;
	}

	public String getValue() {
		return Value;
	}

	public void setValue(String value) {
		Value = value;
	}

	public String getRange() {
		return Range;
	}

	public void setRange(String range) {
		Range = range;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
    

}
