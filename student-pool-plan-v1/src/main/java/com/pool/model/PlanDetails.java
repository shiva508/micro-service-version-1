package com.pool.model;

public class PlanDetails {
	private Integer planId;
	private String planTitle;
	private String planStartingAddress;
	private String planDestinationAddress;
	private Double chargePerEachNumber;
	private Integer numberOfPeople;
	private Double totalTourAmmount;
	private String environmentDEtails;

	public PlanDetails() {

	}

	public Integer getPlanId() {
		return planId;
	}

	public PlanDetails setPlanId(Integer planId) {
		this.planId = planId;
		return this;
	}

	public String getPlanTitle() {
		return planTitle;
	}

	public PlanDetails setPlanTitle(String planTitle) {
		this.planTitle = planTitle;
		return this;
	}

	public String getPlanStartingAddress() {
		return planStartingAddress;
	}

	public PlanDetails setPlanStartingAddress(String planStartingAddress) {
		this.planStartingAddress = planStartingAddress;
		return this;
	}

	public String getPlanDestinationAddress() {
		return planDestinationAddress;
	}

	public PlanDetails setPlanDestinationAddress(String planDestinationAddress) {
		this.planDestinationAddress = planDestinationAddress;
		return this;
	}

	public Double getChargePerEachNumber() {
		return chargePerEachNumber;
	}

	public PlanDetails setChargePerEachNumber(Double chargePerEachNumber) {
		this.chargePerEachNumber = chargePerEachNumber;
		return this;
	}

	public Integer getNumberOfPeople() {
		return numberOfPeople;
	}

	public PlanDetails setNumberOfPeople(Integer numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
		return this;
	}

	public Double getTotalTourAmmount() {
		return totalTourAmmount;
	}

	public PlanDetails setTotalTourAmmount(Double totalTourAmmount) {
		this.totalTourAmmount = totalTourAmmount;
		return this;
	}

	public String getEnvironmentDEtails() {
		return environmentDEtails;
	}

	public PlanDetails setEnvironmentDEtails(String environmentDEtails) {
		this.environmentDEtails = environmentDEtails;
		return this;
	}

}
