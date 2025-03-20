package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengdanganEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengdanganVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengdanganView;


/**
 * 学生档案
 *
 * @author 
 * @email 
 * @date 2023-03-10 08:57:41
 */
public interface XueshengdanganService extends IService<XueshengdanganEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengdanganVO> selectListVO(Wrapper<XueshengdanganEntity> wrapper);
   	
   	XueshengdanganVO selectVO(@Param("ew") Wrapper<XueshengdanganEntity> wrapper);
   	
   	List<XueshengdanganView> selectListView(Wrapper<XueshengdanganEntity> wrapper);
   	
   	XueshengdanganView selectView(@Param("ew") Wrapper<XueshengdanganEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengdanganEntity> wrapper);
   	

}

