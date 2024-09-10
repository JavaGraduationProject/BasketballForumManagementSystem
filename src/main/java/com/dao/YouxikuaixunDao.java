package com.dao;

import com.entity.YouxikuaixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YouxikuaixunVO;
import com.entity.view.YouxikuaixunView;


/**
 * 游戏快讯
 * 
 * @author 
 * @email 
 * @date 2020-11-13 11:47:06
 */
public interface YouxikuaixunDao extends BaseMapper<YouxikuaixunEntity> {
	
	List<YouxikuaixunVO> selectListVO(@Param("ew") Wrapper<YouxikuaixunEntity> wrapper);
	
	YouxikuaixunVO selectVO(@Param("ew") Wrapper<YouxikuaixunEntity> wrapper);
	
	List<YouxikuaixunView> selectListView(@Param("ew") Wrapper<YouxikuaixunEntity> wrapper);

	List<YouxikuaixunView> selectListView(Pagination page,@Param("ew") Wrapper<YouxikuaixunEntity> wrapper);
	
	YouxikuaixunView selectView(@Param("ew") Wrapper<YouxikuaixunEntity> wrapper);
	
}
