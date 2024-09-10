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

import com.entity.YouxikuaixunEntity;
import com.entity.view.YouxikuaixunView;

import com.service.YouxikuaixunService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 游戏快讯
 * 后端接口
 * @author 
 * @email 
 * @date 2020-11-13 11:47:06
 */
@RestController
@RequestMapping("/youxikuaixun")
public class YouxikuaixunController {
    @Autowired
    private YouxikuaixunService youxikuaixunService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YouxikuaixunEntity youxikuaixun, HttpServletRequest request){

        EntityWrapper<YouxikuaixunEntity> ew = new EntityWrapper<YouxikuaixunEntity>();
		PageUtils page = youxikuaixunService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, youxikuaixun), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YouxikuaixunEntity youxikuaixun, HttpServletRequest request){
        EntityWrapper<YouxikuaixunEntity> ew = new EntityWrapper<YouxikuaixunEntity>();
		PageUtils page = youxikuaixunService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, youxikuaixun), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YouxikuaixunEntity youxikuaixun){
       	EntityWrapper<YouxikuaixunEntity> ew = new EntityWrapper<YouxikuaixunEntity>();
      	ew.allEq(MPUtil.allEQMapPre( youxikuaixun, "youxikuaixun")); 
        return R.ok().put("data", youxikuaixunService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YouxikuaixunEntity youxikuaixun){
        EntityWrapper< YouxikuaixunEntity> ew = new EntityWrapper< YouxikuaixunEntity>();
 		ew.allEq(MPUtil.allEQMapPre( youxikuaixun, "youxikuaixun")); 
		YouxikuaixunView youxikuaixunView =  youxikuaixunService.selectView(ew);
		return R.ok("查询游戏快讯成功").put("data", youxikuaixunView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        YouxikuaixunEntity youxikuaixun = youxikuaixunService.selectById(id);
        return R.ok().put("data", youxikuaixun);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        YouxikuaixunEntity youxikuaixun = youxikuaixunService.selectById(id);
        return R.ok().put("data", youxikuaixun);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        YouxikuaixunEntity youxikuaixun = youxikuaixunService.selectById(id);
        if(type.equals("1")) {
        	youxikuaixun.setThumbsupnum(youxikuaixun.getThumbsupnum()+1);
        } else {
        	youxikuaixun.setCrazilynum(youxikuaixun.getCrazilynum()+1);
        }
        youxikuaixunService.updateById(youxikuaixun);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YouxikuaixunEntity youxikuaixun, HttpServletRequest request){
    	youxikuaixun.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(youxikuaixun);

        youxikuaixunService.insert(youxikuaixun);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YouxikuaixunEntity youxikuaixun, HttpServletRequest request){
    	youxikuaixun.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(youxikuaixun);

        youxikuaixunService.insert(youxikuaixun);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YouxikuaixunEntity youxikuaixun, HttpServletRequest request){
        //ValidatorUtils.validateEntity(youxikuaixun);
        youxikuaixunService.updateById(youxikuaixun);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        youxikuaixunService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<YouxikuaixunEntity> wrapper = new EntityWrapper<YouxikuaixunEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = youxikuaixunService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
