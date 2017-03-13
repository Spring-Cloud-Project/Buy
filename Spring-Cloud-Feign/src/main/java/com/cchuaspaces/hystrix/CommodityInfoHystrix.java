package com.cchuaspaces.hystrix;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import com.cchuaspaces.model.CommodityInfo;
import com.cchuaspaces.model.PaginationVo;
import com.cchuaspaces.model.TableUser;
import com.cchuaspaces.service.CommodityInfoClient;
import com.cchuaspaces.service.ComputeClient;
import com.cchuaspaces.service.TableUserClient;

@Component
public class CommodityInfoHystrix implements CommodityInfoClient {

	@Override
	public ResponseEntity<PaginationVo> SelectCommodityByNumber(String selectCommodityByNumber) {
	     return new ResponseEntity<PaginationVo>(HttpStatus.FORBIDDEN); 
	}

	@Override
	public ResponseEntity<PaginationVo> SelectCommodityById(String selectCommodityById) {
	     return new ResponseEntity<PaginationVo>(HttpStatus.FORBIDDEN);
	}

	@Override
	public ResponseEntity<PaginationVo> SelectCommodityInfo(String SelectCommodityInfo) {
	     return new ResponseEntity<PaginationVo>(HttpStatus.FORBIDDEN);
	}

	@Override
	public ResponseEntity<PaginationVo> DeleteCommodityByNumber(String DeleteCommodityByNumber) {
		 return new ResponseEntity<PaginationVo>(HttpStatus.FORBIDDEN);
	}

	@Override
	public ResponseEntity<PaginationVo> DeleteCommodityById(String DeleteCommodityById) {
		 return new ResponseEntity<PaginationVo>(HttpStatus.FORBIDDEN);
	}

	@Override
	public ResponseEntity<PaginationVo> InsertCommodityInfo(String insertCommodityInfo) {
		 return new ResponseEntity<PaginationVo>(HttpStatus.FORBIDDEN);
	}

	@Override
	public ResponseEntity<PaginationVo> UpdCommodityInfoById(String selectCommodityInfo) {
		 return new ResponseEntity<PaginationVo>(HttpStatus.FORBIDDEN);
	}

	@Override
	public ResponseEntity<PaginationVo> UpdCommodityInfoByNumber(String updCommodityInfoByNumber) {
		 return new ResponseEntity<PaginationVo>(HttpStatus.FORBIDDEN);
	}

	

}