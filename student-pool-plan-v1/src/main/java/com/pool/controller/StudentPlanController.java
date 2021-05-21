package com.pool.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pool.model.PlanDetails;

@RestController
public class StudentPlanController {
	private Logger logger=LoggerFactory.getLogger(StudentPlanController.class);
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/plandetails")
	public ResponseEntity<?> getPlanDEtails() {
		String port = environment.getProperty("local.server.port");
		logger.info("{}", port);
		return new ResponseEntity<>(new PlanDetails().setChargePerEachNumber(2000.0).setNumberOfPeople(8).setPlanId(508)
				.setPlanStartingAddress("Hydarabad").setPlanDestinationAddress("Manaali").setPlanTitle("To Manaaki").setEnvironmentDEtails(port),
				HttpStatus.OK);
	}
}
