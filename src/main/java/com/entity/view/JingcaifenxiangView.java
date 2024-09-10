package com.entity.view;

import com.entity.JingcaifenxiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 精彩分享
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-13 11:47:06
 */
@TableName("jingcaifenxiang")
public class JingcaifenxiangView  extends JingcaifenxiangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JingcaifenxiangView(){
	}
 
 	public JingcaifenxiangView(JingcaifenxiangEntity jingcaifenxiangEntity){
 	try {
			BeanUtils.copyProperties(this, jingcaifenxiangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
