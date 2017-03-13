 package com.cchuaspaces.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
/*
@FeignClient("Server-Service")
public interface ComputeClient {

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);

}
compute-service
*/

import com.cchuaspaces.hystrix.CommodityInfoHystrix;
import com.cchuaspaces.hystrix.ComputeClientHystrix;
import com.cchuaspaces.hystrix.OrderInfoHystrix;
import com.cchuaspaces.hystrix.TableUserClientHystrix;
import com.cchuaspaces.model.CommodityInfo;
import com.cchuaspaces.model.OrderInfo;
import com.cchuaspaces.model.PaginationVo;
import com.cchuaspaces.model.TableUser;


@FeignClient(value = "Server-Service", fallback = OrderInfoHystrix.class)
public interface OrderInfoClient {



	
	
	@RequestMapping(method = RequestMethod.POST, value = "/OrderInfo/DeleteByNumber")
	ResponseEntity<PaginationVo> DeleteByNumber(String DeleteCommodityByNumber);
	
	@RequestMapping(method = RequestMethod.POST, value = "/OrderInfo/DeleteById")
	ResponseEntity<PaginationVo> DeleteById(String DeleteCommodityById);

	
	@RequestMapping(method = RequestMethod.POST, value = "/OrderInfo/DeleteById")
	ResponseEntity<PaginationVo> SelectByNumber(String deleteByNumber);
	
	
	
	
	
	
}



