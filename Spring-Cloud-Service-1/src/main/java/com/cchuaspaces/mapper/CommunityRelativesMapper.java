package com.cchuaspaces.mapper;

/*
 * ****************<--*---Code information---*-->**************
 * 	
 *		Author: Cchua
 *		GitHub: https://github.com/vipcchua
 *		Blog  : weibo.com/vipcchua
 * 
 * 
 * ************************************************************/

import java.util.List;

import org.apache.ibatis.annotations.*;

import com.cchuaspaces.model.CommodityCatalog;
import com.cchuaspaces.model.CommodityCatalogSql;
import com.cchuaspaces.model.CommodityInfo;
import com.cchuaspaces.model.CommodityInfoSql;
import com.cchuaspaces.model.CommunityRelatives;
import com.cchuaspaces.model.CommunityRelativesSql;
import com.cchuaspaces.model.TableUser;
import com.cchuaspaces.model.TableUserSql;

@Mapper

public interface CommunityRelativesMapper {
	/*--------------- -----<----*查询*---->--- ----------------------*/

	@Select("SELECT * FROM community_relatives where parents_id = #{parentsId} AND depth = #{depth}")
	/* + " AND commodity_catalog.parents_id = #{parentsId}" */

	public CommunityRelatives SelectByparentsId(@Param("parentsId") String parentsId, @Param("depth") int depth);

	@Select("SELECT * FROM community_relatives where parents_id = #{parentsId} AND depth = #{depth}")
	/* + " AND commodity_catalog.parents_id = #{parentsId}" */

	public List<CommunityRelatives> SelectByparentsIdList(@Param("parentsId") String parentsId,
			@Param("depth") int depth);

	@Select("SELECT * FROM community_relatives where parents_id = #{parentsId} ")
	/* + " AND commodity_catalog.parents_id = #{parentsId}" */

	public CommunityRelatives SelectByparentsIds(@Param("parentsId") String parentsId);

	@Select("SELECT * FROM community_relatives where commodity_number = #{commodityNumber}")
	/* + " AND commodity_catalog.parents_id = #{parentsId}" */
	public List<CommunityRelatives> SelectByCommodityNumber(CommunityRelatives communityRelatives);

	@Select("SELECT * FROM community_relatives where"
			+ " commodity_number = #{commodityNumber} And parents_id = #{parentsId}")
	/* + " AND commodity_catalog.parents_id = #{parentsId}" */
	public List<CommunityRelatives> SelectByprcn(CommunityRelatives communityRelatives);

	/*--------------- -----<----*增加*---->--- ----------------------*/

	@InsertProvider(type = CommunityRelativesSql.class, method = "InsertCommunityRelatives")
	public List<CommunityRelatives> InsertCommunityRelatives(CommunityRelatives communityRelatives);

	@InsertProvider(type = CommunityRelativesSql.class, method = "InsertCommunityRelatives")
	int InsertCommunityRelativesObj(CommunityRelatives communityRelatives);

	/*--------------- -----<----*删除*---->--- ----------------------*/

	@Delete("Delete FROM community_relatives where parents_id = #{parentsId}"
			+ " AND community_relatives.commodity_number = #{commodityNumber}")
	int DeleteCatalog(CommunityRelatives communityRelatives);

	@Delete("Delete FROM community_relatives where id = #{Id}")
	int DeleteCatalogById(CommunityRelatives communityRelatives);

	/*--------------- -----<----*修改*---->--- ----------------------*/

	@Update("UPDATE community_relatives SET community_relatives.parents_id = #{parentsId} "
			+ "Where community_relatives.commodity_number = #{commodityNumber}")
	int UpdateCatalog(CommunityRelatives communityRelatives);

}