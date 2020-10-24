package com.lti.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Applicant {
	@Id
	@SequenceGenerator(name="appSeq",initialValue=1001, allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="appSeq")
	@Column(name="app_id")
	int appId;
	@Column(name="app_fname")
	String appFname;
	@Column(name="app_lname")
	String appLname;
	@Column(name="app_email")
	String appEmail;
	@Column(name="app_password")
	String appPassword;
	@Column(name="app_mobile")
	String appMobile;
	@Column(name="app_dateOfBirth")
	LocalDate appDob;
	@OneToOne(mappedBy = "applicant",cascade = CascadeType.ALL)
	HomeLoan loan;
	@OneToOne(mappedBy = "applicant",cascade = CascadeType.ALL)
	DocumentsUpload document;
	
	public DocumentsUpload getDocument() {
		return document;
	}
	public void setDocument(DocumentsUpload document) {
		this.document = document;
	}
	public HomeLoan getLoan() {
		return loan;
	}
	public void setLoan(HomeLoan loan) {
		this.loan = loan;
	}
	public LocalDate getAppDob() {
		return appDob;
	}
	public void setAppDob(LocalDate appDob) {
		this.appDob = appDob;
	}
	public int getAppId() {
		return appId;
	}
	public void setAppId(int appId) {
		this.appId = appId;
	}
	public String getAppFname() {
		return appFname;
	}
	public void setAppFname(String appFname) {
		this.appFname = appFname;
	}
	public String getAppLname() {
		return appLname;
	}
	public void setAppLname(String appLname) {
		this.appLname = appLname;
	}
	public String getAppEmail() {
		return appEmail;
	}
	public void setAppEmail(String appEmail) {
		this.appEmail = appEmail;
	}
	public String getAppPassword() {
		return appPassword;
	}
	public void setAppPassword(String appPassword) {
		this.appPassword = appPassword;
	}
	public String getAppMobile() {
		return appMobile;
	}
	public void setAppMobile(String appMobile) {
		this.appMobile = appMobile;
	}
	
}
