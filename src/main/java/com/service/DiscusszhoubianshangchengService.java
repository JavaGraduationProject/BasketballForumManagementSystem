package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszhoubianshangchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszhoubianshangchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszhoubianshangchengView;


/**
 * 周边商城评论表
 *
 * @author 
 * @email 
 * @date 2020-11-13 11:47:06
 */
public interface DiscusszhoubianshangchengService extends IService<DiscusszhoubianshangchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszhoubianshangchengVO> selectListVO(Wrapper<DiscusszhoubianshangchengEntity> wrapper);
   	
   	DiscusszhoubianshangchengVO selectVO(@Param("ew") Wrapper<DiscusszhoubianshangchengEntity> wrapper);
   	
   	List<DiscusszhoubianshangchengView> selectListView(Wrapper<DiscusszhoubianshangchengEntity> wrapper);
   	
   	DiscusszhoubianshangchengView selectView(@Param("ew") Wrapper<DiscusszhoubianshangchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszhoubianshangchengEntity> wrapper);
   	
}

