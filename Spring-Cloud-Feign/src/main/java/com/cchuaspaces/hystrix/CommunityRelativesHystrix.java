package com.cchuaspaces.hystrix;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import com.cchuaspaces.model.CommodityCatalog;
import com.cchuaspaces.model.CommodityInfo;
import com.cchuaspaces.model.PaginationVo;
import com.cchuaspaces.model.TableUser;
import com.cchuaspaces.service.CommodityCatalogClient;
import com.cchuaspaces.service.CommodityInfoClient;
import com.cchuaspaces.service.CommunityRelativesClient;
import com.cchuaspaces.service.ComputeClient;
import com.cchuaspaces.service.TableUserClient;

@Component
public class CommunityRelativesHystrix implements CommunityRelativesClient {

	@Override
	public ResponseEntity<PaginationVo> SelectClassifyProduct(String selectCommodityByNumber) {
	     return new ResponseEntity<PaginationVo>(HttpStatus.FORBIDDEN); 
	}

	@Override
	public ResponseEntity<PaginationVo> DeleteByNumber(String selectCommodityByNumber) {
	     return new ResponseEntity<PaginationVo>(HttpStatus.FORBIDDEN); 
	}

	@Override
	public ResponseEntity<PaginationVo> InsertRelativesr(String selectCommodityByNumber) {
	     return new ResponseEntity<PaginationVo>(HttpStatus.FORBIDDEN); 
	}

	@Override
	public ResponseEntity<PaginationVo> UpdateCatalog(String selectCommodityByNumber) {
	     return new ResponseEntity<PaginationVo>(HttpStatus.FORBIDDEN); 
	}







}