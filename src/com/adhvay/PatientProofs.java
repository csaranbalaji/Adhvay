/*
 * DB to store additional proofs of Patient
 */
package com.adhvay;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class PatientProofs {

    @Persistent
    @PrimaryKey
    private String Aadharno;

    @Persistent
    private String Name;

    @Persistent
    private String Age;

    @Persistent
    private String Gender;

    @Persistent
    private String BloodGroup;

    @Persistent
    private String Address;

    @Persistent
    private String Mobileno;

    @Persistent
    private String Emergencyno;


    @Persistent
    private String Licence;

    @Persistent
    private String VoterID;

    @Persistent
    private String PANCard;

    @Persistent
    private String Passport;

    public String getAadharno() {
        return Aadharno;
    }


    public String getName() {
        return Name;
    }


    public String getAge() {
        return Age;
    }


    public String getGender() {
        return Gender;
    }


    public String getBloodGroup() {
        return BloodGroup;
    }


    public String getAddress() {
        return Address;
    }


    public String getMobileno() {
        return Mobileno;
    }


    public String getEmergencyno() {
        return Emergencyno;
    }


    public String getLicence() {
        return Licence;
    }


    public String getVoterID() {
        return VoterID;
    }


    public String getPANCard() {
        return PANCard;
    }


    public String getPassport() {
        return Passport;
    }


    public PatientProofs(String aadharno, String name, String age, String gender, String bloodGroup, String address,
                         String mobileno, String emergencyno, String licence, String voterID, String pANCard, String passport) {
        Aadharno = aadharno;
        Name = name;
        Age = age;
        Gender = gender;
        BloodGroup = bloodGroup;
        Address = address;
        Mobileno = mobileno;
        Emergencyno = emergencyno;
        Licence = licence;
        VoterID = voterID;
        PANCard = pANCard;
        Passport = passport;
    }

}
