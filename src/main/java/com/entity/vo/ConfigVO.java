package com.entity.vo;

import com.entity.ConfigEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 轮播图管理
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-11-13 11:47:06
 */
public class ConfigVO  implements Serializable {
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
