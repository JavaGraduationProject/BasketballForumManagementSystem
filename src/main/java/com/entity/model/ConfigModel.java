package com.entity.model;

import com.entity.ConfigEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 轮播图管理
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-11-13 11:47:06
 */
public class ConfigModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 值
	 */
	
	private String value;
				
	
	/**
	 * 设置：值
	 */
	 
	public void setValue(String value) {
		this.value = value;
	}
	
	/**
	 * 获取：值
	 */
	public String getValue() {
		return value;
	}
			
}
