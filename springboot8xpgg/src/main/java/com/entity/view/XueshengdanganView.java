package com.entity.view;

import com.entity.XueshengdanganEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生档案
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-10 08:57:41
 */
@TableName("xueshengdangan")
public class XueshengdanganView  extends XueshengdanganEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengdanganView(){
	}
 
 	public XueshengdanganView(XueshengdanganEntity xueshengdanganEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengdanganEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
