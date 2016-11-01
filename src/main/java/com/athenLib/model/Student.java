package com.athenLib.model;

import java.util.Date;

import com.athenLib.utils.AthenaemConstant.SHIFT;


public class Student {
	
	private String serialId;
	private String firstName;
	private String lastName;
	private String fatherName;
	private String contactNumber;
	private String email;
	private String typeOfProofId;
	private SHIFT slot;
	private boolean isFeeDeposit;
	private double feeAmount;
	private Date dateOfJoining;
	private Date expirationDate;
	private int seatNumber;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isFeeDeposit() {
		return isFeeDeposit;
	}
	public void setFeeDeposit(boolean isFeeDeposit) {
		this.isFeeDeposit = isFeeDeposit;
	}
	public String getSerialId() {
		return serialId;
	}
	public void setSerialId(String serialId) {
		this.serialId = serialId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getTypeOfProofId() {
		return typeOfProofId;
	}
	public void setTypeOfProofId(String typeOfProofId) {
		this.typeOfProofId = typeOfProofId;
	}
	public SHIFT getSlot() {
		return slot;
	}
	public void setSlot(SHIFT slot) {
		this.slot = slot;
	}
	
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public Date getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public double getFeeAmount() {
		return feeAmount;
	}
	public void setFeeAmount(double feeAmount) {
		this.feeAmount = feeAmount;
	}
	@Override
	public String toString() {
		return "Student [serialId=" + serialId + ", firstName=" + firstName + ", lastName=" + lastName + ", fatherName="
				+ fatherName + ", contactNumber=" + contactNumber + ", email=" + email + ", typeOfProofId="
				+ typeOfProofId + ", slot=" + slot + ", isFeeDeposit=" + isFeeDeposit + ", feeAmount=" + feeAmount
				+ ", dateOfJoining=" + dateOfJoining + ", expirationDate=" + expirationDate + ", seatNumber="
				+ seatNumber + "]";
	}
	
	
}
