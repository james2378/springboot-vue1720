package com.entity.view;

import com.entity.GuihaidanganEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 归还档案
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-10 08:57:41
 */
@TableName("guihaidangan")
public class GuihaidanganView  extends GuihaidanganEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GuihaidanganView(){
	}
 
 	public GuihaidanganView(GuihaidanganEntity guihaidanganEntity){
 	try {
			BeanUtils.copyProperties(this, guihaidanganEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
