package com.dao;

import com.entity.ZhoubianshangchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhoubianshangchengVO;
import com.entity.view.ZhoubianshangchengView;


/**
 * 周边商城
 * 
 * @author 
 * @email 
 * @date 2020-11-13 11:47:06
 */
public interface ZhoubianshangchengDao extends BaseMapper<ZhoubianshangchengEntity> {
	
	List<ZhoubianshangchengVO> selectListVO(@Param("ew") Wrapper<ZhoubianshangchengEntity> wrapper);
	
	ZhoubianshangchengVO selectVO(@Param("ew") Wrapper<ZhoubianshangchengEntity> wrapper);
	
	List<ZhoubianshangchengView> selectListView(@Param("ew") Wrapper<ZhoubianshangchengEntity> wrapper);

	List<ZhoubianshangchengView> selectListView(Pagination page,@Param("ew") Wrapper<ZhoubianshangchengEntity> wrapper);
	
	ZhoubianshangchengView selectView(@Param("ew") Wrapper<ZhoubianshangchengEntity> wrapper);
	
}
