package com.cchuaspaces.service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.commons.beanutils.PropertyUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cchuaspaces.mapper.CommodityCatalogMapper;
import com.cchuaspaces.mapper.CommodityInfoMapper;
import com.cchuaspaces.mapper.CommunityRelativesMapper;
import com.cchuaspaces.model.CommodityCatalog;
import com.cchuaspaces.model.CommodityInfo;
import com.cchuaspaces.model.CommunityRelatives;
import com.cchuaspaces.pojo.CommodityCatalogVo;
import com.cchuaspaces.pojo.CommodityInfoVo;
import com.cchuaspaces.pojo.PaginationVo;

/*
 * ****************<--*---Code information---*-->**************
 * 	
 *		Author: Cchua
 *		GitHub: https://github.com/vipcchua
 *		Blog  : weibo.com/vipcchua
 * 
 * 
 * ************************************************************/
@Service

public class CommodityCatalogService {

	@Autowired
	private CommodityCatalogMapper commodityCatalogMapper;
	
	@Autowired
	private CommunityRelativesMapper  communityRelativesMapper;

	@Autowired
	private PaginationVo paginationVo;
	
	@Autowired
	private CommodityCatalogVo commodityCatalogVo;

	/*--------------- -----<----*查询*---->--- ----------------------*/
	public PaginationVo SelectCatalog(@RequestBody String commodityInfo, Model model) {

		/*
		 * List<CommodityCatalog> json = JSON.parseObject(commodityInfo,
		 * CommodityCatalog.class);
		 */

		CommodityCatalog json = JSONObject.parseObject(commodityInfo, CommodityCatalog.class);

		List<CommodityCatalog> data = commodityCatalogMapper.SelectCatalog(json);
		

	/*	SelectByparentsId*/


		
		
		
		
		paginationVo.setDataResultList(data);

		return paginationVo;

	}
	
	
	public PaginationVo SelectClassifyProduct(@RequestBody String commodityInfo, Model model) {

		/*
		 * List<CommodityCatalog> json = JSON.parseObject(commodityInfo,
		 * CommodityCatalog.class);
		 */

		CommodityCatalog json = JSONObject.parseObject(commodityInfo, CommodityCatalog.class);

		List<CommodityCatalog> data = commodityCatalogMapper.SelectCatalog(json);

		
		CommunityRelatives asdsa = communityRelativesMapper.SelectByparentsIds(data.get(0).getParentsId());
		
		
		
		try {
			PropertyUtils.copyProperties(commodityCatalogVo, data);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		commodityCatalogVo.getDataResultList().get(0);
		
		
/*		commodityCatalogVo.setDataResultList(data);*/
		
		
		/*paginationVo.setDataResultList(data);*/

		return paginationVo;

	}
	
	
	

	
	
	

	/*--------------- -----<----*删除*---->--- ----------------------*/
	public PaginationVo DeleteByCommodity(@RequestBody String CommodityInfo, Model model) {
		/*
		 * List<CommodityCatalog> json = JSON.parseArray(CommodityInfo,
		 * CommodityCatalog.class);
		 */
		CommodityCatalog json = JSONObject.parseObject(CommodityInfo, CommodityCatalog.class);

		int tostate = commodityCatalogMapper.DeleteCatalog(json);

		if (tostate != 0)
			paginationVo.setSqlState("Success");
		else
			paginationVo.setSqlState("Error");

		paginationVo.setDataResultObj(json);

		return paginationVo;

	}

	public PaginationVo DeleteCatalogById(@RequestBody String CommodityInfo, Model model) {

		CommodityCatalog json = JSONObject.parseObject(CommodityInfo, CommodityCatalog.class);

		int tostate = commodityCatalogMapper.DeleteCatalogById(json);

		if (tostate != 0)
			paginationVo.setSqlState("Success");
		else
			paginationVo.setSqlState("Error");

		paginationVo.setDataResultObj(json);

		return paginationVo;

	}

	/*--------------- -----<----*增加*---->--- ----------------------*/

	public PaginationVo InsertCommodityInfo(@RequestBody String CommodityInfo, Model model) {

		CommodityCatalog json = JSONObject.parseObject(CommodityInfo, CommodityCatalog.class);

		json.setCatalogId(uuid());
		List<CommodityCatalog> user = commodityCatalogMapper.InsertCommodityInfo(json);
		paginationVo.setDataResultObj(json);

		return paginationVo;

	}

	/*--------------- -----<----*修改*---->--- ----------------------*/
	public PaginationVo UpdateCatalog(@RequestBody String CommodityInfo, Model model) {

		CommodityCatalog json = JSONObject.parseObject(CommodityInfo,CommodityCatalog.class);
		
		int tostate = commodityCatalogMapper.UpdateCatalog(json);

		if (tostate != 0)
			paginationVo.setSqlState("Success");
		else
			paginationVo.setSqlState("Error");

		paginationVo.setDataResultObj(json);

		return paginationVo;

	}

	private String uuid() {
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid);

		return uuid;
	}

}
