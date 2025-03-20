package com.dao;

import com.entity.GuidangshenheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuidangshenheVO;
import com.entity.view.GuidangshenheView;


/**
 * 归档审核
 * 
 * @author 
 * @email 
 * @date 2023-03-10 08:57:41
 */
public interface GuidangshenheDao extends BaseMapper<GuidangshenheEntity> {
	
	List<GuidangshenheVO> selectListVO(@Param("ew") Wrapper<GuidangshenheEntity> wrapper);
	
	GuidangshenheVO selectVO(@Param("ew") Wrapper<GuidangshenheEntity> wrapper);
	
	List<GuidangshenheView> selectListView(@Param("ew") Wrapper<GuidangshenheEntity> wrapper);

	List<GuidangshenheView> selectListView(Pagination page,@Param("ew") Wrapper<GuidangshenheEntity> wrapper);
	
	GuidangshenheView selectView(@Param("ew") Wrapper<GuidangshenheEntity> wrapper);
	

}
