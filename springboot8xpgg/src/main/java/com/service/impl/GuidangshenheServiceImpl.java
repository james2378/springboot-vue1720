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


import com.dao.GuidangshenheDao;
import com.entity.GuidangshenheEntity;
import com.service.GuidangshenheService;
import com.entity.vo.GuidangshenheVO;
import com.entity.view.GuidangshenheView;

@Service("guidangshenheService")
public class GuidangshenheServiceImpl extends ServiceImpl<GuidangshenheDao, GuidangshenheEntity> implements GuidangshenheService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuidangshenheEntity> page = this.selectPage(
                new Query<GuidangshenheEntity>(params).getPage(),
                new EntityWrapper<GuidangshenheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuidangshenheEntity> wrapper) {
		  Page<GuidangshenheView> page =new Query<GuidangshenheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuidangshenheVO> selectListVO(Wrapper<GuidangshenheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuidangshenheVO selectVO(Wrapper<GuidangshenheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuidangshenheView> selectListView(Wrapper<GuidangshenheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuidangshenheView selectView(Wrapper<GuidangshenheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
