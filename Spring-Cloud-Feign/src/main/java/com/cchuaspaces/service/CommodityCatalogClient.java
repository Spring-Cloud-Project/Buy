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

import com.cchuaspaces.hystrix.CommodityCatalogHystrix;
import com.cchuaspaces.hystrix.CommodityInfoHystrix;
import com.cchuaspaces.hystrix.ComputeClientHystrix;
import com.cchuaspaces.hystrix.TableUserClientHystrix;
import com.cchuaspaces.model.CommodityCatalog;
import com.cchuaspaces.model.CommodityInfo;
import com.cchuaspaces.model.PaginationVo;
import com.cchuaspaces.model.TableUser;


@FeignClient(value = "Server-Service", fallback = CommodityCatalogHystrix.class)
public interface CommodityCatalogClient {



	

	/*--------------- -----<----*查询*---->--- ----------------------*/
	
	@RequestMapping(method = RequestMethod.POST, value = "/Catalog/SelectCatalog")
	ResponseEntity<PaginationVo> SelectCatalog(String selectCommodityByNumber);
	/*--------------- -----<----*删除*---->--- ----------------------*/

	@RequestMapping(method = RequestMethod.POST, value = "/Catalog/DeleteCatalog")
	ResponseEntity<PaginationVo> DeleteCatalog(String selectCommodityByNumber);

	@RequestMapping(method = RequestMethod.POST, value = "/Catalog/DeleteCatalogById")
	ResponseEntity<PaginationVo> DeleteCatalogById(String selectCommodityByNumber);

	/*--------------- -----<----*增加*---->--- ----------------------*/

	@RequestMapping(method = RequestMethod.POST, value = "/Catalog/InsertCommodityInfo")
	ResponseEntity<PaginationVo> InsertCommodityInfo(String selectCommodityByNumber);
	/*--------------- -----<----*修改*---->--- ----------------------*/
	@RequestMapping(method = RequestMethod.POST, value = "/Catalog/UpdateCatalog")
	ResponseEntity<PaginationVo> UpdateCatalog(String selectCommodityByNumber);
	
}




