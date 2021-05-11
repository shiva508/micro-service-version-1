package com.pool.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.pool.modal.PlanModel;


//@FeignClient(name="student-pool-plan", url="localhost:8000")
//@FeignClient(name="student-pool-plan")
@FeignClient(name="zuul-api-gateway-v1")
@RibbonClient(name = "student-pool-plan")
public interface StudentPoolToursProxy {
	
	@GetMapping("/getplandetails")
	public PlanModel getAllPlanDetails();

}
