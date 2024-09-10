package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 精彩分享
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-11-13 11:47:06
 */
@TableName("jingcaifenxiang")
public class JingcaifenxiangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JingcaifenxiangEntity() {
		
	}
	
	public JingcaifenxiangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
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
