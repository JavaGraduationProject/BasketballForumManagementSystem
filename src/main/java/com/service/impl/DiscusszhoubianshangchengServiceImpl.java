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


import com.dao.DiscusszhoubianshangchengDao;
import com.entity.DiscusszhoubianshangchengEntity;
import com.service.DiscusszhoubianshangchengService;
import com.entity.vo.DiscusszhoubianshangchengVO;
import com.entity.view.DiscusszhoubianshangchengView;

@Service("discusszhoubianshangchengService")
public class DiscusszhoubianshangchengServiceImpl extends ServiceImpl<DiscusszhoubianshangchengDao, DiscusszhoubianshangchengEntity> implements DiscusszhoubianshangchengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszhoubianshangchengEntity> page = this.selectPage(
                new Query<DiscusszhoubianshangchengEntity>(params).getPage(),
                new EntityWrapper<DiscusszhoubianshangchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszhoubianshangchengEntity> wrapper) {
		  Page<DiscusszhoubianshangchengView> page =new Query<DiscusszhoubianshangchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszhoubianshangchengVO> selectListVO(Wrapper<DiscusszhoubianshangchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszhoubianshangchengVO selectVO(Wrapper<DiscusszhoubianshangchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszhoubianshangchengView> selectListView(Wrapper<DiscusszhoubianshangchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszhoubianshangchengView selectView(Wrapper<DiscusszhoubianshangchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
