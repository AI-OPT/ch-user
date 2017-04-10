package com.ai.ch.user.dao.mapper.attach;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import com.ai.ch.user.dao.mapper.bo.CtScoreLog;
import com.ai.ch.user.dao.mapper.bo.ShopInfo;

/**
 * 供应商评分表
 * @author Zh
 *
 */
public interface CtScoreLogAttachMapper {

	/**
	 * ct_score_log
	 * @param tenantId
	 * @param userId
	 * @param startPage
	 * @param endPage
	 * @return
	 */
	@Results({ @Result(id = true, property = "userId", column = "user_id", javaType = String.class,jdbcType = JdbcType.VARCHAR),
			@Result(property = "tenantId", column = "tenant_id", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Result(property = "operId", column = "oper_id", javaType = Long.class, jdbcType = JdbcType.VARCHAR),
			@Result(property = "scoreDate", column = "score_date", javaType = Timestamp.class, jdbcType = JdbcType.VARCHAR),
			@Result(property = "totalScore", column = "total_score", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
			@Result(property = "score1", column = "score1", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
			@Result(property = "score2", column = "score2", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
			@Result(property = "score3", column = "score3", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
			@Result(property = "score4", column = "score4", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
			@Result(property = "score5", column = "score5", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
			@Result(property = "score6", column = "score6", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
			@Result(property = "score7", column = "score7", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
			@Result(property = "score8", column = "score8", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
			@Result(property = "score9", column = "score9", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
			@Result(property = "score10", column = "score10", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
			@Result(property = "score11", column = "score11", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
			@Result(property = "score12", column = "score12", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
			@Result(property = "score13", column = "score13", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
			@Result(property = "score14", column = "score14", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
			@Result(property = "score15", column = "score15", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
			@Result(property = "score16", column = "score16", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
			@Result(property = "score17", column = "score17", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
			@Result(property = "score18", column = "score18", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
			@Result(property = "score19", column = "score19", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
			@Result(property = "score20", column = "score20", javaType = Integer.class, jdbcType = JdbcType.VARCHAR), })

	/**
	 * 查询scorelog记录
	 * @param tenantId
	 * @param userId
	 * @param startPage
	 * @param endPage
	 * @return
	 */
	@Select("select scoreLog.* from ct_score_log scoreLog where scoreLog.tenant_id=#{tenantId} and scoreLog.user_id=#{userId} limit #{startPage},#{endPage}")
	List<CtScoreLog> queryScoreLog(@Param("tenantId") String tenantId, @Param("userId") String userId,@Param("startPage") int startPage, @Param("endPage") int endPage);

	/**
	 * 查询店铺信息
	 * @return
	 */
	@Select("select shop_info.* from shop_info shopInfo where shopInfo.tenant_id=#{tenantId} and shopInfo.shop_name=#{shopName} limit 0,1")
	ShopInfo selectOne(@Param("tenantId") String tenantId, @Param("shopName") String shopName);
	
	/**
	 * ct_score_log
	 * @param tenantId
	 * @param userId
	 * @return
	 */
	@Results({ @Result(id = true, property = "userId", column = "user_id", javaType = String.class,jdbcType = JdbcType.VARCHAR),
		@Result(property = "tenantId", column = "tenant_id", javaType = String.class, jdbcType = JdbcType.VARCHAR),
		@Result(property = "operId", column = "oper_id", javaType = Long.class, jdbcType = JdbcType.VARCHAR),
		@Result(property = "scoreDate", column = "score_date", javaType = Timestamp.class, jdbcType = JdbcType.VARCHAR),
		@Result(property = "totalScore", column = "total_score", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
		@Result(property = "score1", column = "score1", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
		@Result(property = "score2", column = "score2", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
		@Result(property = "score3", column = "score3", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
		@Result(property = "score4", column = "score4", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
		@Result(property = "score5", column = "score5", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
		@Result(property = "score6", column = "score6", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
		@Result(property = "score7", column = "score7", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
		@Result(property = "score8", column = "score8", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
		@Result(property = "score9", column = "score9", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
		@Result(property = "score10", column = "score10", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
		@Result(property = "score11", column = "score11", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
		@Result(property = "score12", column = "score12", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
		@Result(property = "score13", column = "score13", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
		@Result(property = "score14", column = "score14", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
		@Result(property = "score15", column = "score15", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
		@Result(property = "score16", column = "score16", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
		@Result(property = "score17", column = "score17", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
		@Result(property = "score18", column = "score18", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
		@Result(property = "score19", column = "score19", javaType = Integer.class, jdbcType = JdbcType.VARCHAR),
		@Result(property = "score20", column = "score20", javaType = Integer.class, jdbcType = JdbcType.VARCHAR), })
	
	/**
	 * 查询scorelog信息
	 * @param tenantId
	 * @param userId
	 * @return
	 */
	@Select("select scoreLog.* from ct_score_log scoreLog where scoreLog.tenant_id=#{tenantId} and scoreLog.user_id=#{userId} and scoreLog.score_date in (select  max(cs.score_date) from ct_score_log cs where cs.user_id=#{userId} group by cs.oper_id)")
	List<CtScoreLog> selectScoreLogMax(@Param("tenantId") String tenantId, @Param("userId") String userId);
	
	/**
	 * 查询供应商评分总数
	 * @param tenantId
	 * @param userId
	 * @return
	 */
	@Select("select count(scoreLog.user_id) from ct_score_log scoreLog where scoreLog.tenant_id=#{tenantId} and scoreLog.user_id=#{userId}")
	int queryCountScoreLog(@Param("tenantId") String tenantId, @Param("userId") String userId);
	
}
