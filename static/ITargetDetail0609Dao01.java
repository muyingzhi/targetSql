package com.tianjian.ods.dao.targetdetails;

import com.tianjian.ods.bean.IndicatorsBean;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;



public interface ITargetDetail0609Dao01{
	
	
	 public List<IndicatorsBean> pieEchartsHsp1(@Param("startDate") Date startDate,
												@Param("endDate") Date endDate,
												@Param("hspIds") String[] hspIds,
												@Param("field")String field);

	 public List<IndicatorsBean> pieEchartsHsp2(@Param("startDate") Date startDate,
												@Param("endDate") Date endDate,
												@Param("hspIds") String[] hspIds,
												@Param("field")String field);
	 public List<IndicatorsBean> pieEchartsHsp3(@Param("startDate") Date startDate,
												@Param("endDate") Date endDate,
												@Param("hspIds") String[] hspIds);
	 
	 public List<IndicatorsBean> pieEchartsDept1(@Param("startDate") Date startDate,
												 @Param("endDate") Date endDate,
												 @Param("hspIds") String[] hspIds,
												 @Param("field")String field);
	 
	
	 public List<IndicatorsBean> pieEchartsHspOperation1(@Param("startDate") Date startDate,
														 @Param("endDate") Date endDate,
														 @Param("hspIds") String[] hspIds,
														 @Param("field")String field);

	 public List<IndicatorsBean> pieEchartsHspOperation2(@Param("startDate") Date startDate,
														 @Param("endDate") Date endDate,
														 @Param("hspIds") String[] hspIds,
														 @Param("field")String field);
	 
	 public List<IndicatorsBean> pieEchartsDeptOperation1(@Param("startDate") Date startDate,
														  @Param("endDate") Date endDate,
														  @Param("hspIds") String[] hspIds,
														  @Param("field")String field);

	 public List<IndicatorsBean> tbEchartsOperationType(@Param("startDate") Date startDate,
														@Param("endDate") Date endDate,
														@Param("hspIds") String[] hspIds);

	 
	 public List<IndicatorsBean> get0101pieEcharts3(@Param("startDate") Date startDate,
													@Param("endDate") Date endDate,
													@Param("hspIds") String[] hspIds);

	 public List<IndicatorsBean> get0609pieEcharts3(@Param("startDate") Date startDate,
													@Param("endDate") Date endDate,
													@Param("hspIds") String[] hspId);

	 

}