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


import com.dao.DanganrukuDao;
import com.entity.DanganrukuEntity;
import com.service.DanganrukuService;
import com.entity.vo.DanganrukuVO;
import com.entity.view.DanganrukuView;

@Service("danganrukuService")
public class DanganrukuServiceImpl extends ServiceImpl<DanganrukuDao, DanganrukuEntity> implements DanganrukuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DanganrukuEntity> page = this.selectPage(
                new Query<DanganrukuEntity>(params).getPage(),
                new EntityWrapper<DanganrukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DanganrukuEntity> wrapper) {
		  Page<DanganrukuView> page =new Query<DanganrukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DanganrukuVO> selectListVO(Wrapper<DanganrukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DanganrukuVO selectVO(Wrapper<DanganrukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DanganrukuView> selectListView(Wrapper<DanganrukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DanganrukuView selectView(Wrapper<DanganrukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<DanganrukuEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<DanganrukuEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<DanganrukuEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
