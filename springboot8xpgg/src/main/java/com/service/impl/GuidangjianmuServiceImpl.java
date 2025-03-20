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


import com.dao.GuidangjianmuDao;
import com.entity.GuidangjianmuEntity;
import com.service.GuidangjianmuService;
import com.entity.vo.GuidangjianmuVO;
import com.entity.view.GuidangjianmuView;

@Service("guidangjianmuService")
public class GuidangjianmuServiceImpl extends ServiceImpl<GuidangjianmuDao, GuidangjianmuEntity> implements GuidangjianmuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuidangjianmuEntity> page = this.selectPage(
                new Query<GuidangjianmuEntity>(params).getPage(),
                new EntityWrapper<GuidangjianmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuidangjianmuEntity> wrapper) {
		  Page<GuidangjianmuView> page =new Query<GuidangjianmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuidangjianmuVO> selectListVO(Wrapper<GuidangjianmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuidangjianmuVO selectVO(Wrapper<GuidangjianmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuidangjianmuView> selectListView(Wrapper<GuidangjianmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuidangjianmuView selectView(Wrapper<GuidangjianmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
