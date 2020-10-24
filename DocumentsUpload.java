package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class DocumentsUpload {
	@Id
	@SequenceGenerator(name="docSeq",initialValue=1001, allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="docSeq")
	@Column(name="docs_id")
	int docsNo;
	@Column(name="aadhar_no")
	int aadharNo;
	@Column(name="pan_no")
	int panNo;
	@Column(name="voter_no")
	int voterNo;
	@Column(name="salary_no")
	int salarySlipNo;
	@Column(name="noc_no")
	int nocNo;
	@Column(name="agreement_no")
	int agreementno;
	@OneToOne
	@JoinColumn(name="app_id")
	Applicant applicant;
	
	public Applicant getApplicant() {
		return applicant;
	}
	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}
	public int getDocsNo() {
		return docsNo;
	}
	public void setDocsNo(int docsNo) {
		this.docsNo = docsNo;
	}
	public int getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(int aadharNo) {
		this.aadharNo = aadharNo;
	}
	public int getPanNo() {
		return panNo;
	}
	public void setPanNo(int panNo) {
		this.panNo = panNo;
	}
	public int getVoterNo() {
		return voterNo;
	}
	public void setVoterNo(int voterNo) {
		this.voterNo = voterNo;
	}
	public int getSalarySlipNo() {
		return salarySlipNo;
	}
	public void setSalarySlipNo(int salarySlipNo) {
		this.salarySlipNo = salarySlipNo;
	}
	public int getNocNo() {
		return nocNo;
	}
	public void setNocNo(int nocNo) {
		this.nocNo = nocNo;
	}
	public int getAgreementno() {
		return agreementno;
	}
	public void setAgreementno(int agreementno) {
		this.agreementno = agreementno;
	}
	
	
}
