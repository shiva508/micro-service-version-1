package com.pool.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.pool.modal.PlanModel;


//@FeignClient(name="student-pool-plan", url="localhost:8000")
//@FeignClient(name="student-pool-plan")
@FeignClient(name="netflix-zuul-api-gateway-server")
@RibbonClient(name = "student-pool-plan")
public interface StudentPoolToursProxy {
	
	@GetMapping("/student-pool-plan/student-pool-plan/getplandetails")
	public PlanModel getAllPlanDetails();

}
