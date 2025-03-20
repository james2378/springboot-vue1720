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


import com.dao.ShenqingxiugaiDao;
import com.entity.ShenqingxiugaiEntity;
import com.service.ShenqingxiugaiService;
import com.entity.vo.ShenqingxiugaiVO;
import com.entity.view.ShenqingxiugaiView;

@Service("shenqingxiugaiService")
public class ShenqingxiugaiServiceImpl extends ServiceImpl<ShenqingxiugaiDao, ShenqingxiugaiEntity> implements ShenqingxiugaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenqingxiugaiEntity> page = this.selectPage(
                new Query<ShenqingxiugaiEntity>(params).getPage(),
                new EntityWrapper<ShenqingxiugaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenqingxiugaiEntity> wrapper) {
		  Page<ShenqingxiugaiView> page =new Query<ShenqingxiugaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShenqingxiugaiVO> selectListVO(Wrapper<ShenqingxiugaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShenqingxiugaiVO selectVO(Wrapper<ShenqingxiugaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShenqingxiugaiView> selectListView(Wrapper<ShenqingxiugaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenqingxiugaiView selectView(Wrapper<ShenqingxiugaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
