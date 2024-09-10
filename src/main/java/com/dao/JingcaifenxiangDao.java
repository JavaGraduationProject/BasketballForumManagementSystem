package com.dao;

import com.entity.JingcaifenxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingcaifenxiangVO;
import com.entity.view.JingcaifenxiangView;


/**
 * 精彩分享
 * 
 * @author 
 * @email 
 * @date 2020-11-13 11:47:06
 */
public interface JingcaifenxiangDao extends BaseMapper<JingcaifenxiangEntity> {
	
	List<JingcaifenxiangVO> selectListVO(@Param("ew") Wrapper<JingcaifenxiangEntity> wrapper);
	
	JingcaifenxiangVO selectVO(@Param("ew") Wrapper<JingcaifenxiangEntity> wrapper);
	
	List<JingcaifenxiangView> selectListView(@Param("ew") Wrapper<JingcaifenxiangEntity> wrapper);

	List<JingcaifenxiangView> selectListView(Pagination page,@Param("ew") Wrapper<JingcaifenxiangEntity> wrapper);
	
	JingcaifenxiangView selectView(@Param("ew") Wrapper<JingcaifenxiangEntity> wrapper);
	
}
