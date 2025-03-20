package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 归档审核
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-10 08:57:41
 */
@TableName("guidangshenhe")
public class GuidangshenheEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GuidangshenheEntity() {
		
	}
	
	public GuidangshenheEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 审核编号
	 */
					
	private String shenhebianhao;
	
	/**
	 * 标题
	 */
					
	private String biaoti;
	
	/**
	 * 档案分类
	 */
					
	private String danganfenlei;
	
	/**
	 * 内容
	 */
					
	private String neirong;
	
	/**
	 * 审核结果
	 */
					
	private String shenhejieguo;
	
	/**
	 * 审核时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shenheshijian;
	
	/**
	 * 学生账号
	 */
					
	private String xueshengzhanghao;
	
	/**
	 * 学生姓名
	 */
					
	private String xueshengxingming;
	
	/**
	 * 班级
	 */
					
	private String banji;
	
	/**
	 * 专业
	 */
					
	private String zhuanye;
	
	/**
	 * 身份证
	 */
					
	private String shenfenzheng;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：审核编号
	 */
	public void setShenhebianhao(String shenhebianhao) {
		this.shenhebianhao = shenhebianhao;
	}
	/**
	 * 获取：审核编号
	 */
	public String getShenhebianhao() {
		return shenhebianhao;
	}
	/**
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
	/**
	 * 设置：档案分类
	 */
	public void setDanganfenlei(String danganfenlei) {
		this.danganfenlei = danganfenlei;
	}
	/**
	 * 获取：档案分类
	 */
	public String getDanganfenlei() {
		return danganfenlei;
	}
	/**
	 * 设置：内容
	 */
	public void setNeirong(String neirong) {
		this.neirong = neirong;
	}
	/**
	 * 获取：内容
	 */
	public String getNeirong() {
		return neirong;
	}
	/**
	 * 设置：审核结果
	 */
	public void setShenhejieguo(String shenhejieguo) {
		this.shenhejieguo = shenhejieguo;
	}
	/**
	 * 获取：审核结果
	 */
	public String getShenhejieguo() {
		return shenhejieguo;
	}
	/**
	 * 设置：审核时间
	 */
	public void setShenheshijian(Date shenheshijian) {
		this.shenheshijian = shenheshijian;
	}
	/**
	 * 获取：审核时间
	 */
	public Date getShenheshijian() {
		return shenheshijian;
	}
	/**
	 * 设置：学生账号
	 */
	public void setXueshengzhanghao(String xueshengzhanghao) {
		this.xueshengzhanghao = xueshengzhanghao;
	}
	/**
	 * 获取：学生账号
	 */
	public String getXueshengzhanghao() {
		return xueshengzhanghao;
	}
	/**
	 * 设置：学生姓名
	 */
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
	/**
	 * 设置：班级
	 */
	public void setBanji(String banji) {
		this.banji = banji;
	}
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
	/**
	 * 设置：专业
	 */
	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}
	/**
	 * 获取：专业
	 */
	public String getZhuanye() {
		return zhuanye;
	}
	/**
	 * 设置：身份证
	 */
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}

}
