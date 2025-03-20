package com.dao;

import com.entity.GuidangjianmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuidangjianmuVO;
import com.entity.view.GuidangjianmuView;


/**
 * 归档建目
 * 
 * @author 
 * @email 
 * @date 2023-03-10 08:57:41
 */
public interface GuidangjianmuDao extends BaseMapper<GuidangjianmuEntity> {
	
	List<GuidangjianmuVO> selectListVO(@Param("ew") Wrapper<GuidangjianmuEntity> wrapper);
	
	GuidangjianmuVO selectVO(@Param("ew") Wrapper<GuidangjianmuEntity> wrapper);
	
	List<GuidangjianmuView> selectListView(@Param("ew") Wrapper<GuidangjianmuEntity> wrapper);

	List<GuidangjianmuView> selectListView(Pagination page,@Param("ew") Wrapper<GuidangjianmuEntity> wrapper);
	
	GuidangjianmuView selectView(@Param("ew") Wrapper<GuidangjianmuEntity> wrapper);
	

}
