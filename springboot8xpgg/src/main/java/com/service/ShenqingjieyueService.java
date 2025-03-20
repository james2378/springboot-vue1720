package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenqingjieyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenqingjieyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenqingjieyueView;


/**
 * 申请借阅
 *
 * @author 
 * @email 
 * @date 2023-03-10 08:57:41
 */
public interface ShenqingjieyueService extends IService<ShenqingjieyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenqingjieyueVO> selectListVO(Wrapper<ShenqingjieyueEntity> wrapper);
   	
   	ShenqingjieyueVO selectVO(@Param("ew") Wrapper<ShenqingjieyueEntity> wrapper);
   	
   	List<ShenqingjieyueView> selectListView(Wrapper<ShenqingjieyueEntity> wrapper);
   	
   	ShenqingjieyueView selectView(@Param("ew") Wrapper<ShenqingjieyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenqingjieyueEntity> wrapper);
   	

}

