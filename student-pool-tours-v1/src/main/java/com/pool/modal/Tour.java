package com.pool.modal;

public class Tour {
	private Integer tourId;
	private String location;
	private PlanDetails planDetails;

	public Tour() {

	}

	public Integer getTourId() {
		return tourId;
	}

	public Tour setTourId(Integer tourId) {
		this.tourId = tourId;
		return this;
	}

	public String getLocation() {
		return location;
	}

	public Tour setLocation(String location) {
		this.location = location;
		return this;
	}

	public PlanDetails getPlanModel() {
		return planDetails;
	}

	public Tour setPlanModel(PlanDetails planDetails) {
		this.planDetails = planDetails;
		return this;
	}

}
