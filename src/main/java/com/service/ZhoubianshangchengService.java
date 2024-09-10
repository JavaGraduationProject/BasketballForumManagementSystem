package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhoubianshangchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhoubianshangchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhoubianshangchengView;


/**
 * 周边商城
 *
 * @author 
 * @email 
 * @date 2020-11-13 11:47:06
 */
public interface ZhoubianshangchengService extends IService<ZhoubianshangchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhoubianshangchengVO> selectListVO(Wrapper<ZhoubianshangchengEntity> wrapper);
   	
   	ZhoubianshangchengVO selectVO(@Param("ew") Wrapper<ZhoubianshangchengEntity> wrapper);
   	
   	List<ZhoubianshangchengView> selectListView(Wrapper<ZhoubianshangchengEntity> wrapper);
   	
   	ZhoubianshangchengView selectView(@Param("ew") Wrapper<ZhoubianshangchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhoubianshangchengEntity> wrapper);
   	
}

