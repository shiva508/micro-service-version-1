package com.pool.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import com.pool.modal.PlanDetails;


//@FeignClient(name="student-pool-plan", url="localhost:8000/student-pool-plan")//Hard-coding approach
@FeignClient(name="student-pool-plan",path = "/student-pool-plan/")
//@FeignClient(name="zuul-api-gateway-v1")
@RibbonClient(name = "student-pool-plan")//FOR LOAD BALANACING
public interface StudentPoolToursProxy {
	
	@GetMapping("/plandetails")
	public PlanDetails getAllPlanDetails();

}
