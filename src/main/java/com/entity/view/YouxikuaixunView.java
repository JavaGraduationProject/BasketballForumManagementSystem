package com.entity.view;

import com.entity.YouxikuaixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 游戏快讯
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-13 11:47:06
 */
@TableName("youxikuaixun")
public class YouxikuaixunView  extends YouxikuaixunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YouxikuaixunView(){
	}
 
 	public YouxikuaixunView(YouxikuaixunEntity youxikuaixunEntity){
 	try {
			BeanUtils.copyProperties(this, youxikuaixunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
