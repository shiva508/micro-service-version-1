package com.pool.modal;

public class Tour {
	private Integer tourId;
	private String location;
	private PlanModel planModel;

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

	public PlanModel getPlanModel() {
		return planModel;
	}

	public Tour setPlanModel(PlanModel planModel) {
		this.planModel = planModel;
		return this;
	}

}
