package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuihaidanganEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuihaidanganVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuihaidanganView;


/**
 * 归还档案
 *
 * @author 
 * @email 
 * @date 2023-03-10 08:57:41
 */
public interface GuihaidanganService extends IService<GuihaidanganEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuihaidanganVO> selectListVO(Wrapper<GuihaidanganEntity> wrapper);
   	
   	GuihaidanganVO selectVO(@Param("ew") Wrapper<GuihaidanganEntity> wrapper);
   	
   	List<GuihaidanganView> selectListView(Wrapper<GuihaidanganEntity> wrapper);
   	
   	GuihaidanganView selectView(@Param("ew") Wrapper<GuihaidanganEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuihaidanganEntity> wrapper);
   	

}

