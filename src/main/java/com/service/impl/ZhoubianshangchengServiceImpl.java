package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZhoubianshangchengDao;
import com.entity.ZhoubianshangchengEntity;
import com.service.ZhoubianshangchengService;
import com.entity.vo.ZhoubianshangchengVO;
import com.entity.view.ZhoubianshangchengView;

@Service("zhoubianshangchengService")
public class ZhoubianshangchengServiceImpl extends ServiceImpl<ZhoubianshangchengDao, ZhoubianshangchengEntity> implements ZhoubianshangchengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhoubianshangchengEntity> page = this.selectPage(
                new Query<ZhoubianshangchengEntity>(params).getPage(),
                new EntityWrapper<ZhoubianshangchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhoubianshangchengEntity> wrapper) {
		  Page<ZhoubianshangchengView> page =new Query<ZhoubianshangchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhoubianshangchengVO> selectListVO(Wrapper<ZhoubianshangchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhoubianshangchengVO selectVO(Wrapper<ZhoubianshangchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhoubianshangchengView> selectListView(Wrapper<ZhoubianshangchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhoubianshangchengView selectView(Wrapper<ZhoubianshangchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
