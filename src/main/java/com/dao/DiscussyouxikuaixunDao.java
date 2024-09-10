package com.dao;

import com.entity.DiscussyouxikuaixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyouxikuaixunVO;
import com.entity.view.DiscussyouxikuaixunView;


/**
 * 游戏快讯评论表
 * 
 * @author 
 * @email 
 * @date 2020-11-13 11:47:06
 */
public interface DiscussyouxikuaixunDao extends BaseMapper<DiscussyouxikuaixunEntity> {
	
	List<DiscussyouxikuaixunVO> selectListVO(@Param("ew") Wrapper<DiscussyouxikuaixunEntity> wrapper);
	
	DiscussyouxikuaixunVO selectVO(@Param("ew") Wrapper<DiscussyouxikuaixunEntity> wrapper);
	
	List<DiscussyouxikuaixunView> selectListView(@Param("ew") Wrapper<DiscussyouxikuaixunEntity> wrapper);

	List<DiscussyouxikuaixunView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyouxikuaixunEntity> wrapper);
	
	DiscussyouxikuaixunView selectView(@Param("ew") Wrapper<DiscussyouxikuaixunEntity> wrapper);
	
}
