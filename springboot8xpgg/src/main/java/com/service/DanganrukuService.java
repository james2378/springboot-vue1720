package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DanganrukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DanganrukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DanganrukuView;


/**
 * 档案入库
 *
 * @author 
 * @email 
 * @date 2023-03-10 08:57:41
 */
public interface DanganrukuService extends IService<DanganrukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DanganrukuVO> selectListVO(Wrapper<DanganrukuEntity> wrapper);
   	
   	DanganrukuVO selectVO(@Param("ew") Wrapper<DanganrukuEntity> wrapper);
   	
   	List<DanganrukuView> selectListView(Wrapper<DanganrukuEntity> wrapper);
   	
   	DanganrukuView selectView(@Param("ew") Wrapper<DanganrukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DanganrukuEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<DanganrukuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<DanganrukuEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<DanganrukuEntity> wrapper);



}

