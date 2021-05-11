package com.pool.modal;


public class PlanModel {
	private Integer planId;
	private String planName;
	private Double planAmount;

	public PlanModel() {

	}

	public Integer getPlanId() {
		return planId;
	}

	public PlanModel setPlanId(Integer planId) {
		this.planId = planId;
		return this;
	}

	public String getPlanName() {
		return planName;
	}

	public PlanModel setPlanName(String planName) {
		this.planName = planName;
		return this;
	}

	public Double getPlanAmount() {
		return planAmount;
	}

	public PlanModel setPlanAmount(Double planAmount) {
		this.planAmount = planAmount;
		return this;
	}

}
