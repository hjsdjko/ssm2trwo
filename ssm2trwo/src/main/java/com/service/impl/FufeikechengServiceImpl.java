package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.FufeikechengDao;
import com.entity.FufeikechengEntity;
import com.service.FufeikechengService;
import com.entity.vo.FufeikechengVO;
import com.entity.view.FufeikechengView;

@Service("fufeikechengService")
public class FufeikechengServiceImpl extends ServiceImpl<FufeikechengDao, FufeikechengEntity> implements FufeikechengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FufeikechengEntity> page = this.selectPage(
                new Query<FufeikechengEntity>(params).getPage(),
                new EntityWrapper<FufeikechengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FufeikechengEntity> wrapper) {
		  Page<FufeikechengView> page =new Query<FufeikechengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FufeikechengVO> selectListVO(Wrapper<FufeikechengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FufeikechengVO selectVO(Wrapper<FufeikechengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FufeikechengView> selectListView(Wrapper<FufeikechengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FufeikechengView selectView(Wrapper<FufeikechengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
