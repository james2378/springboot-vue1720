package com.dao;

import com.entity.XueshengdanganEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengdanganVO;
import com.entity.view.XueshengdanganView;


/**
 * 学生档案
 * 
 * @author 
 * @email 
 * @date 2023-03-10 08:57:41
 */
public interface XueshengdanganDao extends BaseMapper<XueshengdanganEntity> {
	
	List<XueshengdanganVO> selectListVO(@Param("ew") Wrapper<XueshengdanganEntity> wrapper);
	
	XueshengdanganVO selectVO(@Param("ew") Wrapper<XueshengdanganEntity> wrapper);
	
	List<XueshengdanganView> selectListView(@Param("ew") Wrapper<XueshengdanganEntity> wrapper);

	List<XueshengdanganView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengdanganEntity> wrapper);
	
	XueshengdanganView selectView(@Param("ew") Wrapper<XueshengdanganEntity> wrapper);
	

}
