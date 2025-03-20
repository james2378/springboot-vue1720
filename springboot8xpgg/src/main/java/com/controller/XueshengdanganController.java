package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.XueshengdanganEntity;
import com.entity.view.XueshengdanganView;

import com.service.XueshengdanganService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 学生档案
 * 后端接口
 * @author 
 * @email 
 * @date 2023-03-10 08:57:41
 */
@RestController
@RequestMapping("/xueshengdangan")
public class XueshengdanganController {
    @Autowired
    private XueshengdanganService xueshengdanganService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XueshengdanganEntity xueshengdangan,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			xueshengdangan.setXueshengzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XueshengdanganEntity> ew = new EntityWrapper<XueshengdanganEntity>();

		PageUtils page = xueshengdanganService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshengdangan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XueshengdanganEntity xueshengdangan, 
		HttpServletRequest request){
        EntityWrapper<XueshengdanganEntity> ew = new EntityWrapper<XueshengdanganEntity>();

		PageUtils page = xueshengdanganService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshengdangan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XueshengdanganEntity xueshengdangan){
       	EntityWrapper<XueshengdanganEntity> ew = new EntityWrapper<XueshengdanganEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xueshengdangan, "xueshengdangan")); 
        return R.ok().put("data", xueshengdanganService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XueshengdanganEntity xueshengdangan){
        EntityWrapper< XueshengdanganEntity> ew = new EntityWrapper< XueshengdanganEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xueshengdangan, "xueshengdangan")); 
		XueshengdanganView xueshengdanganView =  xueshengdanganService.selectView(ew);
		return R.ok("查询学生档案成功").put("data", xueshengdanganView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XueshengdanganEntity xueshengdangan = xueshengdanganService.selectById(id);
        return R.ok().put("data", xueshengdangan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XueshengdanganEntity xueshengdangan = xueshengdanganService.selectById(id);
        return R.ok().put("data", xueshengdangan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XueshengdanganEntity xueshengdangan, HttpServletRequest request){
    	xueshengdangan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xueshengdangan);
        xueshengdanganService.insert(xueshengdangan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XueshengdanganEntity xueshengdangan, HttpServletRequest request){
    	xueshengdangan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xueshengdangan);
        xueshengdanganService.insert(xueshengdangan);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XueshengdanganEntity xueshengdangan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xueshengdangan);
        xueshengdanganService.updateById(xueshengdangan);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xueshengdanganService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<XueshengdanganEntity> wrapper = new EntityWrapper<XueshengdanganEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xueshengzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = xueshengdanganService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
