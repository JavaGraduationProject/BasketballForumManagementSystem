package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjingcaifenxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjingcaifenxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjingcaifenxiangView;


/**
 * 精彩分享评论表
 *
 * @author 
 * @email 
 * @date 2020-11-13 11:47:06
 */
public interface DiscussjingcaifenxiangService extends IService<DiscussjingcaifenxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjingcaifenxiangVO> selectListVO(Wrapper<DiscussjingcaifenxiangEntity> wrapper);
   	
   	DiscussjingcaifenxiangVO selectVO(@Param("ew") Wrapper<DiscussjingcaifenxiangEntity> wrapper);
   	
   	List<DiscussjingcaifenxiangView> selectListView(Wrapper<DiscussjingcaifenxiangEntity> wrapper);
   	
   	DiscussjingcaifenxiangView selectView(@Param("ew") Wrapper<DiscussjingcaifenxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjingcaifenxiangEntity> wrapper);
   	
}

