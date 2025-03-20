package com.dao;

import com.entity.ShenqingjieyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShenqingjieyueVO;
import com.entity.view.ShenqingjieyueView;


/**
 * 申请借阅
 * 
 * @author 
 * @email 
 * @date 2023-03-10 08:57:41
 */
public interface ShenqingjieyueDao extends BaseMapper<ShenqingjieyueEntity> {
	
	List<ShenqingjieyueVO> selectListVO(@Param("ew") Wrapper<ShenqingjieyueEntity> wrapper);
	
	ShenqingjieyueVO selectVO(@Param("ew") Wrapper<ShenqingjieyueEntity> wrapper);
	
	List<ShenqingjieyueView> selectListView(@Param("ew") Wrapper<ShenqingjieyueEntity> wrapper);

	List<ShenqingjieyueView> selectListView(Pagination page,@Param("ew") Wrapper<ShenqingjieyueEntity> wrapper);
	
	ShenqingjieyueView selectView(@Param("ew") Wrapper<ShenqingjieyueEntity> wrapper);
	

}
