/* 
 * DB to store Scan report
 */

package com.adhvay;



import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable
public class ScanReportsDB {
	
	@Persistent(defaultFetchGroup="true")
	private String AadharNo;

	@Persistent
	private String ScanPart;
	
	@Persistent
	private String Report;

	@Persistent
	private String date;
	
	public ScanReportsDB(String aadharNo, String scanPart, String report, String date) {
		
		this.AadharNo = aadharNo;
		this.ScanPart = scanPart;
		this.Report = report;
		this.date = date; 
	}

	public String getAadharNo() {
		return AadharNo;
	}

	public void setAadharNo(String aadharNo) {
		AadharNo = aadharNo;
	}

	public String getScanPart() {
		return ScanPart;
	}

	public void setScanPart(String scanPart) {
		ScanPart = scanPart;
	}

	public String getReport() {
		return Report;
	}

	public void setReport(String report) {
		Report = report;
	}

		
	public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
	

}
