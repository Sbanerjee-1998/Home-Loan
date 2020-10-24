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
public class HomeLoan { //loan application details-->> home loan table
	@Id
	@SequenceGenerator(name="loanSeq",initialValue=1001, allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="loanSeq")
	@Column(name="loan_id")
	int loanId;
	@Column(name="loan_amount")
	int loanAmount;
	@Column(name="loan_tenure")
	int loanTenure;
	@Column(name="loan_interest")
	double loanInterest;
	@OneToOne
	@JoinColumn(name="app_id")
	Applicant applicant;
	
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public int getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getLoanTenure() {
		return loanTenure;
	}
	public void setLoanTenure(int loanTenure) {
		this.loanTenure = loanTenure;
	}
	public double getLoanInterest() {
		return loanInterest;
	}
	public void setLoanInterest(double loanInterest) {
		this.loanInterest = loanInterest;
	}
	
}
