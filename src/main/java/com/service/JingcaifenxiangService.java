package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingcaifenxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingcaifenxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingcaifenxiangView;


/**
 * 精彩分享
 *
 * @author 
 * @email 
 * @date 2020-11-13 11:47:06
 */
public interface JingcaifenxiangService extends IService<JingcaifenxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingcaifenxiangVO> selectListVO(Wrapper<JingcaifenxiangEntity> wrapper);
   	
   	JingcaifenxiangVO selectVO(@Param("ew") Wrapper<JingcaifenxiangEntity> wrapper);
   	
   	List<JingcaifenxiangView> selectListView(Wrapper<JingcaifenxiangEntity> wrapper);
   	
   	JingcaifenxiangView selectView(@Param("ew") Wrapper<JingcaifenxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingcaifenxiangEntity> wrapper);
   	
}

