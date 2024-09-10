package com.entity.view;

import com.entity.DiscusszhoubianshangchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 周边商城评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-13 11:47:06
 */
@TableName("discusszhoubianshangcheng")
public class DiscusszhoubianshangchengView  extends DiscusszhoubianshangchengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusszhoubianshangchengView(){
	}
 
 	public DiscusszhoubianshangchengView(DiscusszhoubianshangchengEntity discusszhoubianshangchengEntity){
 	try {
			BeanUtils.copyProperties(this, discusszhoubianshangchengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
