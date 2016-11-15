/* DB to store entered Medicines */

package com.adhvay;


import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable
public class MedicineDB {
	
	@Persistent(defaultFetchGroup="true")
	private String AadharNo;

	@Persistent
	private String DrugName;
	
	@Persistent
	private String Quantity;
	
	@Persistent
	private String date;
	
	public MedicineDB(){
		
	}

	public MedicineDB(String aadharNo, String drugName, String quantity, String date) {
		
		this.AadharNo = aadharNo;
		this.DrugName = drugName;
		this.Quantity = quantity;
		this.date = date;
	}

	public String getAadharNo() {
		return AadharNo;
	}

	public void setAadharNo(String aadharNo) {
		AadharNo = aadharNo;
	}

	public String getDrugName() {
		return DrugName;
	}

	public void setDrugName(String drugName) {
		DrugName = drugName;
	}

	public String getQuantity() {
		return Quantity;
	}

	public void setQuantity(String quantity) {
		Quantity = quantity;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	 
}
