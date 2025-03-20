package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenqingxiugaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenqingxiugaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenqingxiugaiView;


/**
 * 申请修改
 *
 * @author 
 * @email 
 * @date 2023-03-10 08:57:41
 */
public interface ShenqingxiugaiService extends IService<ShenqingxiugaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenqingxiugaiVO> selectListVO(Wrapper<ShenqingxiugaiEntity> wrapper);
   	
   	ShenqingxiugaiVO selectVO(@Param("ew") Wrapper<ShenqingxiugaiEntity> wrapper);
   	
   	List<ShenqingxiugaiView> selectListView(Wrapper<ShenqingxiugaiEntity> wrapper);
   	
   	ShenqingxiugaiView selectView(@Param("ew") Wrapper<ShenqingxiugaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenqingxiugaiEntity> wrapper);
   	

}

