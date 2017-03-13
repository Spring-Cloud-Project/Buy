package com.cchuaspaces.hystrix;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.cchuaspaces.model.DetailedList;
import com.cchuaspaces.model.PaginationVo;
import com.cchuaspaces.model.TableUser;
import com.cchuaspaces.service.ComputeClient;
import com.cchuaspaces.service.DetailedListClient;

@Component
public class DetailedListHystrix implements DetailedListClient {

	@Override
	public ResponseEntity<PaginationVo> SelectByUserId(String selectByUserId) {
		return new ResponseEntity<PaginationVo>(HttpStatus.FORBIDDEN);
	}

	@Override
	public ResponseEntity<PaginationVo> SelectByDetailedId(String selectByDetailedId) {

		return new ResponseEntity<PaginationVo>(HttpStatus.FORBIDDEN);
	}

	@Override
	public ResponseEntity<PaginationVo> DeleteByCommodity(String deleteByDetailedId) {

		return new ResponseEntity<PaginationVo>(HttpStatus.FORBIDDEN);
	}

	@Override
	public ResponseEntity<PaginationVo> DeleteBydetailedId(String deleteByNumber) {

		return new ResponseEntity<PaginationVo>(HttpStatus.FORBIDDEN);
	}

	@Override
	public ResponseEntity<PaginationVo> DeleteAll(String deleteAll) {

		return new ResponseEntity<PaginationVo>(HttpStatus.FORBIDDEN);
	}

	@Override
	public ResponseEntity<PaginationVo> InsertDetailed(String insertDetailed) {

		return new ResponseEntity<PaginationVo>(HttpStatus.FORBIDDEN);
	}

	@Override
	public ResponseEntity<PaginationVo> UpdateByUserId(String updateByUserId) {

		return new ResponseEntity<PaginationVo>(HttpStatus.FORBIDDEN);
	}

	@Override
	public ResponseEntity<PaginationVo> UpdateByDetailedId(String updateByDetailedId) {
		return new ResponseEntity<PaginationVo>(HttpStatus.FORBIDDEN);
	}

	@Override
	public ResponseEntity<PaginationVo> DeleteCommodity(String deleteByNumber) {
		return new ResponseEntity<PaginationVo>(HttpStatus.FORBIDDEN);
		
	}



}
