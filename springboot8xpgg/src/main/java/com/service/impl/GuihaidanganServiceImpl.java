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


import com.dao.GuihaidanganDao;
import com.entity.GuihaidanganEntity;
import com.service.GuihaidanganService;
import com.entity.vo.GuihaidanganVO;
import com.entity.view.GuihaidanganView;

@Service("guihaidanganService")
public class GuihaidanganServiceImpl extends ServiceImpl<GuihaidanganDao, GuihaidanganEntity> implements GuihaidanganService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuihaidanganEntity> page = this.selectPage(
                new Query<GuihaidanganEntity>(params).getPage(),
                new EntityWrapper<GuihaidanganEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuihaidanganEntity> wrapper) {
		  Page<GuihaidanganView> page =new Query<GuihaidanganView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuihaidanganVO> selectListVO(Wrapper<GuihaidanganEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuihaidanganVO selectVO(Wrapper<GuihaidanganEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuihaidanganView> selectListView(Wrapper<GuihaidanganEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuihaidanganView selectView(Wrapper<GuihaidanganEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
