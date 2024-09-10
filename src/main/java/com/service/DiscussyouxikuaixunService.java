package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyouxikuaixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyouxikuaixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyouxikuaixunView;


/**
 * 游戏快讯评论表
 *
 * @author 
 * @email 
 * @date 2020-11-13 11:47:06
 */
public interface DiscussyouxikuaixunService extends IService<DiscussyouxikuaixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyouxikuaixunVO> selectListVO(Wrapper<DiscussyouxikuaixunEntity> wrapper);
   	
   	DiscussyouxikuaixunVO selectVO(@Param("ew") Wrapper<DiscussyouxikuaixunEntity> wrapper);
   	
   	List<DiscussyouxikuaixunView> selectListView(Wrapper<DiscussyouxikuaixunEntity> wrapper);
   	
   	DiscussyouxikuaixunView selectView(@Param("ew") Wrapper<DiscussyouxikuaixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyouxikuaixunEntity> wrapper);
   	
}

