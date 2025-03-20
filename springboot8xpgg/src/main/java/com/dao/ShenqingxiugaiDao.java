package com.dao;

import com.entity.ShenqingxiugaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShenqingxiugaiVO;
import com.entity.view.ShenqingxiugaiView;


/**
 * 申请修改
 * 
 * @author 
 * @email 
 * @date 2023-03-10 08:57:41
 */
public interface ShenqingxiugaiDao extends BaseMapper<ShenqingxiugaiEntity> {
	
	List<ShenqingxiugaiVO> selectListVO(@Param("ew") Wrapper<ShenqingxiugaiEntity> wrapper);
	
	ShenqingxiugaiVO selectVO(@Param("ew") Wrapper<ShenqingxiugaiEntity> wrapper);
	
	List<ShenqingxiugaiView> selectListView(@Param("ew") Wrapper<ShenqingxiugaiEntity> wrapper);

	List<ShenqingxiugaiView> selectListView(Pagination page,@Param("ew") Wrapper<ShenqingxiugaiEntity> wrapper);
	
	ShenqingxiugaiView selectView(@Param("ew") Wrapper<ShenqingxiugaiEntity> wrapper);
	

}
