package com.dao;

import com.entity.FufeikechengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FufeikechengVO;
import com.entity.view.FufeikechengView;


/**
 * 付费课程
 * 
 * @author 
 * @email 
 * @date 2022-03-06 12:04:02
 */
public interface FufeikechengDao extends BaseMapper<FufeikechengEntity> {
	
	List<FufeikechengVO> selectListVO(@Param("ew") Wrapper<FufeikechengEntity> wrapper);
	
	FufeikechengVO selectVO(@Param("ew") Wrapper<FufeikechengEntity> wrapper);
	
	List<FufeikechengView> selectListView(@Param("ew") Wrapper<FufeikechengEntity> wrapper);

	List<FufeikechengView> selectListView(Pagination page,@Param("ew") Wrapper<FufeikechengEntity> wrapper);
	
	FufeikechengView selectView(@Param("ew") Wrapper<FufeikechengEntity> wrapper);
	

}
