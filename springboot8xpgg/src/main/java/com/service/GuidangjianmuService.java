package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuidangjianmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuidangjianmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuidangjianmuView;


/**
 * 归档建目
 *
 * @author 
 * @email 
 * @date 2023-03-10 08:57:41
 */
public interface GuidangjianmuService extends IService<GuidangjianmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuidangjianmuVO> selectListVO(Wrapper<GuidangjianmuEntity> wrapper);
   	
   	GuidangjianmuVO selectVO(@Param("ew") Wrapper<GuidangjianmuEntity> wrapper);
   	
   	List<GuidangjianmuView> selectListView(Wrapper<GuidangjianmuEntity> wrapper);
   	
   	GuidangjianmuView selectView(@Param("ew") Wrapper<GuidangjianmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuidangjianmuEntity> wrapper);
   	

}

