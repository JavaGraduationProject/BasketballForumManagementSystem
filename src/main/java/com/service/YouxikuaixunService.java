package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YouxikuaixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YouxikuaixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YouxikuaixunView;


/**
 * 游戏快讯
 *
 * @author 
 * @email 
 * @date 2020-11-13 11:47:06
 */
public interface YouxikuaixunService extends IService<YouxikuaixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YouxikuaixunVO> selectListVO(Wrapper<YouxikuaixunEntity> wrapper);
   	
   	YouxikuaixunVO selectVO(@Param("ew") Wrapper<YouxikuaixunEntity> wrapper);
   	
   	List<YouxikuaixunView> selectListView(Wrapper<YouxikuaixunEntity> wrapper);
   	
   	YouxikuaixunView selectView(@Param("ew") Wrapper<YouxikuaixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YouxikuaixunEntity> wrapper);
   	
}

