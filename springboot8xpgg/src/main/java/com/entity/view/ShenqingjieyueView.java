package com.entity.view;

import com.entity.ShenqingjieyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 申请借阅
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-10 08:57:41
 */
@TableName("shenqingjieyue")
public class ShenqingjieyueView  extends ShenqingjieyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShenqingjieyueView(){
	}
 
 	public ShenqingjieyueView(ShenqingjieyueEntity shenqingjieyueEntity){
 	try {
			BeanUtils.copyProperties(this, shenqingjieyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
