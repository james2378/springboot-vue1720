package com.entity.view;

import com.entity.ShenqingxiugaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 申请修改
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-10 08:57:41
 */
@TableName("shenqingxiugai")
public class ShenqingxiugaiView  extends ShenqingxiugaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShenqingxiugaiView(){
	}
 
 	public ShenqingxiugaiView(ShenqingxiugaiEntity shenqingxiugaiEntity){
 	try {
			BeanUtils.copyProperties(this, shenqingxiugaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
