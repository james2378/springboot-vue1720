package com.dao;

import com.entity.GuihaidanganEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuihaidanganVO;
import com.entity.view.GuihaidanganView;


/**
 * 归还档案
 * 
 * @author 
 * @email 
 * @date 2023-03-10 08:57:41
 */
public interface GuihaidanganDao extends BaseMapper<GuihaidanganEntity> {
	
	List<GuihaidanganVO> selectListVO(@Param("ew") Wrapper<GuihaidanganEntity> wrapper);
	
	GuihaidanganVO selectVO(@Param("ew") Wrapper<GuihaidanganEntity> wrapper);
	
	List<GuihaidanganView> selectListView(@Param("ew") Wrapper<GuihaidanganEntity> wrapper);

	List<GuihaidanganView> selectListView(Pagination page,@Param("ew") Wrapper<GuihaidanganEntity> wrapper);
	
	GuihaidanganView selectView(@Param("ew") Wrapper<GuihaidanganEntity> wrapper);
	

}
