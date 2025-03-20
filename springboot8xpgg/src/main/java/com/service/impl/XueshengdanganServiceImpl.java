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


import com.dao.XueshengdanganDao;
import com.entity.XueshengdanganEntity;
import com.service.XueshengdanganService;
import com.entity.vo.XueshengdanganVO;
import com.entity.view.XueshengdanganView;

@Service("xueshengdanganService")
public class XueshengdanganServiceImpl extends ServiceImpl<XueshengdanganDao, XueshengdanganEntity> implements XueshengdanganService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengdanganEntity> page = this.selectPage(
                new Query<XueshengdanganEntity>(params).getPage(),
                new EntityWrapper<XueshengdanganEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengdanganEntity> wrapper) {
		  Page<XueshengdanganView> page =new Query<XueshengdanganView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengdanganVO> selectListVO(Wrapper<XueshengdanganEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengdanganVO selectVO(Wrapper<XueshengdanganEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengdanganView> selectListView(Wrapper<XueshengdanganEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengdanganView selectView(Wrapper<XueshengdanganEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
