package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YouxifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YouxifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YouxifenleiView;


/**
 * 游戏分类
 *
 * @author 
 * @email 
 * @date 2020-11-13 11:47:06
 */
public interface YouxifenleiService extends IService<YouxifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YouxifenleiVO> selectListVO(Wrapper<YouxifenleiEntity> wrapper);
   	
   	YouxifenleiVO selectVO(@Param("ew") Wrapper<YouxifenleiEntity> wrapper);
   	
   	List<YouxifenleiView> selectListView(Wrapper<YouxifenleiEntity> wrapper);
   	
   	YouxifenleiView selectView(@Param("ew") Wrapper<YouxifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YouxifenleiEntity> wrapper);
   	
}

