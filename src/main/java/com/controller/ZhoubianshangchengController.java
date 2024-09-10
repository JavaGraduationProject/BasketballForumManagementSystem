package com.controller;

import java.text.SimpleDateFormat;
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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZhoubianshangchengEntity;
import com.entity.view.ZhoubianshangchengView;

import com.service.ZhoubianshangchengService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 周边商城
 * 后端接口
 * @author 
 * @email 
 * @date 2020-11-13 11:47:06
 */
@RestController
@RequestMapping("/zhoubianshangcheng")
public class ZhoubianshangchengController {
    @Autowired
    private ZhoubianshangchengService zhoubianshangchengService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhoubianshangchengEntity zhoubianshangcheng, HttpServletRequest request){

        EntityWrapper<ZhoubianshangchengEntity> ew = new EntityWrapper<ZhoubianshangchengEntity>();
		PageUtils page = zhoubianshangchengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhoubianshangcheng), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhoubianshangchengEntity zhoubianshangcheng, HttpServletRequest request){
        EntityWrapper<ZhoubianshangchengEntity> ew = new EntityWrapper<ZhoubianshangchengEntity>();
		PageUtils page = zhoubianshangchengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhoubianshangcheng), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhoubianshangchengEntity zhoubianshangcheng){
       	EntityWrapper<ZhoubianshangchengEntity> ew = new EntityWrapper<ZhoubianshangchengEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhoubianshangcheng, "zhoubianshangcheng")); 
        return R.ok().put("data", zhoubianshangchengService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhoubianshangchengEntity zhoubianshangcheng){
        EntityWrapper< ZhoubianshangchengEntity> ew = new EntityWrapper< ZhoubianshangchengEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhoubianshangcheng, "zhoubianshangcheng")); 
		ZhoubianshangchengView zhoubianshangchengView =  zhoubianshangchengService.selectView(ew);
		return R.ok("查询周边商城成功").put("data", zhoubianshangchengView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        ZhoubianshangchengEntity zhoubianshangcheng = zhoubianshangchengService.selectById(id);
        return R.ok().put("data", zhoubianshangcheng);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        ZhoubianshangchengEntity zhoubianshangcheng = zhoubianshangchengService.selectById(id);
        return R.ok().put("data", zhoubianshangcheng);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        ZhoubianshangchengEntity zhoubianshangcheng = zhoubianshangchengService.selectById(id);
        if(type.equals("1")) {
        	zhoubianshangcheng.setThumbsupnum(zhoubianshangcheng.getThumbsupnum()+1);
        } else {
        	zhoubianshangcheng.setCrazilynum(zhoubianshangcheng.getCrazilynum()+1);
        }
        zhoubianshangchengService.updateById(zhoubianshangcheng);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhoubianshangchengEntity zhoubianshangcheng, HttpServletRequest request){
    	zhoubianshangcheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhoubianshangcheng);

        zhoubianshangchengService.insert(zhoubianshangcheng);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhoubianshangchengEntity zhoubianshangcheng, HttpServletRequest request){
    	zhoubianshangcheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhoubianshangcheng);

        zhoubianshangchengService.insert(zhoubianshangcheng);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZhoubianshangchengEntity zhoubianshangcheng, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhoubianshangcheng);
        zhoubianshangchengService.updateById(zhoubianshangcheng);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhoubianshangchengService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ZhoubianshangchengEntity> wrapper = new EntityWrapper<ZhoubianshangchengEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = zhoubianshangchengService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
