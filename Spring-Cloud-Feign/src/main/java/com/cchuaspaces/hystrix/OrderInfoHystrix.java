package com.cchuaspaces.hystrix;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import com.cchuaspaces.model.CommodityInfo;
import com.cchuaspaces.model.OrderInfo;
import com.cchuaspaces.model.PaginationVo;
import com.cchuaspaces.model.TableUser;
import com.cchuaspaces.service.CommodityInfoClient;
import com.cchuaspaces.service.ComputeClient;
import com.cchuaspaces.service.OrderInfoClient;
import com.cchuaspaces.service.TableUserClient;

@Component
public class OrderInfoHystrix implements OrderInfoClient {



	@Override
	public ResponseEntity<PaginationVo> DeleteByNumber(String DeleteCommodityByNumber) {
	     return new ResponseEntity<PaginationVo>(HttpStatus.FORBIDDEN); 
	}

	@Override
	public ResponseEntity<PaginationVo> DeleteById(String DeleteCommodityById) {
	     return new ResponseEntity<PaginationVo>(HttpStatus.FORBIDDEN); 
	}

	@Override
	public ResponseEntity<PaginationVo> SelectByNumber(String deleteByNumber) {
	     return new ResponseEntity<PaginationVo>(HttpStatus.FORBIDDEN); 
	}


	

}