package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuidangshenheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuidangshenheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuidangshenheView;


/**
 * 归档审核
 *
 * @author 
 * @email 
 * @date 2023-03-10 08:57:41
 */
public interface GuidangshenheService extends IService<GuidangshenheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuidangshenheVO> selectListVO(Wrapper<GuidangshenheEntity> wrapper);
   	
   	GuidangshenheVO selectVO(@Param("ew") Wrapper<GuidangshenheEntity> wrapper);
   	
   	List<GuidangshenheView> selectListView(Wrapper<GuidangshenheEntity> wrapper);
   	
   	GuidangshenheView selectView(@Param("ew") Wrapper<GuidangshenheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuidangshenheEntity> wrapper);
   	

}

