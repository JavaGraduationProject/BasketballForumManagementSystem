package com.entity.vo;

import com.entity.JingcaifenxiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 精彩分享
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-11-13 11:47:06
 */
public class JingcaifenxiangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 分享标题
	 */
	
	private String fenxiangbiaoti;
		
	/**
	 * 游戏名称
	 */
	
	private String youximingcheng;
		
	/**
	 * 游戏厂商
	 */
	
	private String youxichangshang;
		
	/**
	 * 精彩瞬间
	 */
	
	private String jingcaishunjian;
		
	/**
	 * 精彩介绍
	 */
	
	private String jingcaijieshao;
		
	/**
	 * 精彩详情
	 */
	
	private String jingcaixiangqing;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：分享标题
	 */
	 
	public void setFenxiangbiaoti(String fenxiangbiaoti) {
		this.fenxiangbiaoti = fenxiangbiaoti;
	}
	
	/**
	 * 获取：分享标题
	 */
	public String getFenxiangbiaoti() {
		return fenxiangbiaoti;
	}
				
	
	/**
	 * 设置：游戏名称
	 */
	 
	public void setYouximingcheng(String youximingcheng) {
		this.youximingcheng = youximingcheng;
	}
	
	/**
	 * 获取：游戏名称
	 */
	public String getYouximingcheng() {
		return youximingcheng;
	}
				
	
	/**
	 * 设置：游戏厂商
	 */
	 
	public void setYouxichangshang(String youxichangshang) {
		this.youxichangshang = youxichangshang;
	}
	
	/**
	 * 获取：游戏厂商
	 */
	public String getYouxichangshang() {
		return youxichangshang;
	}
				
	
	/**
	 * 设置：精彩瞬间
	 */
	 
	public void setJingcaishunjian(String jingcaishunjian) {
		this.jingcaishunjian = jingcaishunjian;
	}
	
	/**
	 * 获取：精彩瞬间
	 */
	public String getJingcaishunjian() {
		return jingcaishunjian;
	}
				
	
	/**
	 * 设置：精彩介绍
	 */
	 
	public void setJingcaijieshao(String jingcaijieshao) {
		this.jingcaijieshao = jingcaijieshao;
	}
	
	/**
	 * 获取：精彩介绍
	 */
	public String getJingcaijieshao() {
		return jingcaijieshao;
	}
				
	
	/**
	 * 设置：精彩详情
	 */
	 
	public void setJingcaixiangqing(String jingcaixiangqing) {
		this.jingcaixiangqing = jingcaixiangqing;
	}
	
	/**
	 * 获取：精彩详情
	 */
	public String getJingcaixiangqing() {
		return jingcaixiangqing;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
			
}
