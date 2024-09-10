package com.dao;

import com.entity.DiscussjingcaifenxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjingcaifenxiangVO;
import com.entity.view.DiscussjingcaifenxiangView;


/**
 * 精彩分享评论表
 * 
 * @author 
 * @email 
 * @date 2020-11-13 11:47:06
 */
public interface DiscussjingcaifenxiangDao extends BaseMapper<DiscussjingcaifenxiangEntity> {
	
	List<DiscussjingcaifenxiangVO> selectListVO(@Param("ew") Wrapper<DiscussjingcaifenxiangEntity> wrapper);
	
	DiscussjingcaifenxiangVO selectVO(@Param("ew") Wrapper<DiscussjingcaifenxiangEntity> wrapper);
	
	List<DiscussjingcaifenxiangView> selectListView(@Param("ew") Wrapper<DiscussjingcaifenxiangEntity> wrapper);

	List<DiscussjingcaifenxiangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjingcaifenxiangEntity> wrapper);
	
	DiscussjingcaifenxiangView selectView(@Param("ew") Wrapper<DiscussjingcaifenxiangEntity> wrapper);
	
}
