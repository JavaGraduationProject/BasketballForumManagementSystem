package com.entity.view;

import com.entity.ZhoubianshangchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 周边商城
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-13 11:47:06
 */
@TableName("zhoubianshangcheng")
public class ZhoubianshangchengView  extends ZhoubianshangchengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhoubianshangchengView(){
	}
 
 	public ZhoubianshangchengView(ZhoubianshangchengEntity zhoubianshangchengEntity){
 	try {
			BeanUtils.copyProperties(this, zhoubianshangchengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
