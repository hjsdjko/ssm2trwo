package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FufeikechengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FufeikechengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FufeikechengView;


/**
 * 付费课程
 *
 * @author 
 * @email 
 * @date 2022-03-06 12:04:02
 */
public interface FufeikechengService extends IService<FufeikechengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FufeikechengVO> selectListVO(Wrapper<FufeikechengEntity> wrapper);
   	
   	FufeikechengVO selectVO(@Param("ew") Wrapper<FufeikechengEntity> wrapper);
   	
   	List<FufeikechengView> selectListView(Wrapper<FufeikechengEntity> wrapper);
   	
   	FufeikechengView selectView(@Param("ew") Wrapper<FufeikechengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FufeikechengEntity> wrapper);
   	

}

