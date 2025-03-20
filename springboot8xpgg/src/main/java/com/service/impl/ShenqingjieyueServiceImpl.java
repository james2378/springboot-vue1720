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


import com.dao.ShenqingjieyueDao;
import com.entity.ShenqingjieyueEntity;
import com.service.ShenqingjieyueService;
import com.entity.vo.ShenqingjieyueVO;
import com.entity.view.ShenqingjieyueView;

@Service("shenqingjieyueService")
public class ShenqingjieyueServiceImpl extends ServiceImpl<ShenqingjieyueDao, ShenqingjieyueEntity> implements ShenqingjieyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenqingjieyueEntity> page = this.selectPage(
                new Query<ShenqingjieyueEntity>(params).getPage(),
                new EntityWrapper<ShenqingjieyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenqingjieyueEntity> wrapper) {
		  Page<ShenqingjieyueView> page =new Query<ShenqingjieyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShenqingjieyueVO> selectListVO(Wrapper<ShenqingjieyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShenqingjieyueVO selectVO(Wrapper<ShenqingjieyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShenqingjieyueView> selectListView(Wrapper<ShenqingjieyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenqingjieyueView selectView(Wrapper<ShenqingjieyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
