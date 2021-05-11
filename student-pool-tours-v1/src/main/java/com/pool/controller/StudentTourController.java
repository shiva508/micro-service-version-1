package com.pool.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.pool.modal.PlanModel;
import com.pool.modal.Tour;
import com.pool.proxy.StudentPoolToursProxy;

@RestController
public class StudentTourController {
	
	@Autowired
	private StudentPoolToursProxy proxy;
	
	@Autowired
	private RestTemplate restTemplate;
	
	private Logger logger=LoggerFactory.getLogger(StudentTourController.class);
	
	@GetMapping("/tours")
	public ResponseEntity<?> calculateCurrencyConversion() {
		
		ResponseEntity<PlanModel> responseEntity = restTemplate.getForEntity("http://localhost:8000/student-pool-plan/getplandetails", PlanModel.class);
		PlanModel planModel = responseEntity.getBody();
		Tour tour=new Tour();
		tour.setTourId(508).setLocation("Ladak").setPlanModel(planModel);
		return new ResponseEntity<>(tour, HttpStatus.OK);
		
	}

	@GetMapping("/tours-feign")
	public ResponseEntity<?> calculateCurrencyConversionFeign() {
		PlanModel planModel = proxy.getAllPlanDetails();
		logger.info("{}",planModel);
		Tour tour=new Tour();
		tour.setTourId(508).setLocation("Ladak").setPlanModel(planModel);
		return new ResponseEntity<>(tour, HttpStatus.OK);
		
	}


}
