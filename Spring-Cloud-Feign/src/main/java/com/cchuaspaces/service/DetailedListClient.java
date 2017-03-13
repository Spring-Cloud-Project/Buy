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
import com.cchuaspaces.hystrix.DetailedListHystrix;
import com.cchuaspaces.hystrix.TableUserClientHystrix;
import com.cchuaspaces.model.CommodityInfo;
import com.cchuaspaces.model.DetailedList;
import com.cchuaspaces.model.PaginationVo;
import com.cchuaspaces.model.TableUser;


@FeignClient(value = "Server-Service", fallback = DetailedListHystrix.class)

public interface DetailedListClient {
	/*--------------- -----<----*查询*---->--- ----------------------*/
	@RequestMapping(method = RequestMethod.POST, value = "/Detailed/SelectByUserId")
	ResponseEntity<PaginationVo> SelectByUserId(String selectByUserId);

	@RequestMapping(method = RequestMethod.POST, value = "/Detailed/SelectByDetailedId")
	ResponseEntity<PaginationVo> SelectByDetailedId(String selectByDetailedId);
	/*--------------- -----<----*删除*---->--- ----------------------*/
	@RequestMapping(method = RequestMethod.POST, value = "/Detailed/DeleteByDetailedId")
	ResponseEntity<PaginationVo> DeleteByCommodity(String deleteByDetailedId);

	@RequestMapping(method = RequestMethod.POST, value = "/Detailed/DeleteBydetailedId")
	ResponseEntity<PaginationVo> DeleteBydetailedId(String deleteByNumber);

	@RequestMapping(method = RequestMethod.POST, value = "/Detailed/DeleteCommodity")
	ResponseEntity<PaginationVo> DeleteCommodity(String deleteByNumber);
	
	@RequestMapping(method = RequestMethod.POST, value = "/Detailed/DeleteAll")
	ResponseEntity<PaginationVo> DeleteAll(String deleteAll);
	/*--------------- -----<----*增加*---->--- ----------------------*/
	@RequestMapping(method = RequestMethod.POST, value = "/Detailed/InsertDetailed")
	ResponseEntity<PaginationVo> InsertDetailed(String insertDetailed);

	@RequestMapping(method = RequestMethod.POST, value = "/Detailed/UpdateByUserId")
	ResponseEntity<PaginationVo> UpdateByUserId(String updateByUserId);

	/*--------------- -----<----*修改*---->--- ----------------------*/
	@RequestMapping(method = RequestMethod.POST, value = "/Detailed/UpdateByDetailedId")
	ResponseEntity<PaginationVo> UpdateByDetailedId(String updateByDetailedId);
	



	
	
	 
	
}




