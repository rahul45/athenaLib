package com.athenLib.model;

import java.util.Date;

import com.athenLib.utils.AthenaemConstant.SHIFT;


public class Student {
	
	private String serialId;
	private String firstName;
	private String lastName;
	private String fatherName;
	private String contactNumber;
	private String typeOfProofId;
	private SHIFT slot;
	private boolean isFeeDeposit;
	private String feeDepositionStatus;
	private Date dateOfJoining;
	private Date expirationDate;
	private int seatNumber;
	
	
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
	public String getFeeDepositionStatus() {
		return feeDepositionStatus;
	}
	public void setFeeDepositionStatus(String feeDepositionStatus) {
		this.feeDepositionStatus = feeDepositionStatus;
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
	@Override
	public String toString() {
		return "Student [serialId=" + serialId + ", firstName=" + firstName + ", lastName=" + lastName + ", fatherName="
				+ fatherName + ", contactNumber=" + contactNumber + ", typeOfProofId=" + typeOfProofId + ", slot="
				+ slot + ", isFeeDeposit=" + isFeeDeposit + ", feeDepositionStatus=" + feeDepositionStatus
				+ ", dateOfJoining=" + dateOfJoining + ", expirationDate=" + expirationDate + ", seatNumber="
				+ seatNumber + ", isFeeDeposit()=" + isFeeDeposit() + ", getSerialId()=" + getSerialId()
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getFatherName()="
				+ getFatherName() + ", getContactNumber()=" + getContactNumber() + ", getTypeOfProofId()="
				+ getTypeOfProofId() + ", getSlot()=" + getSlot() + ", getFeeDepositionStatus()="
				+ getFeeDepositionStatus() + ", getDateOfJoining()=" + getDateOfJoining() + ", getExpirationDate()="
				+ getExpirationDate() + ", getSeatNumber()=" + getSeatNumber() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
