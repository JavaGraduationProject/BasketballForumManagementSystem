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


import com.dao.DiscussyouxikuaixunDao;
import com.entity.DiscussyouxikuaixunEntity;
import com.service.DiscussyouxikuaixunService;
import com.entity.vo.DiscussyouxikuaixunVO;
import com.entity.view.DiscussyouxikuaixunView;

@Service("discussyouxikuaixunService")
public class DiscussyouxikuaixunServiceImpl extends ServiceImpl<DiscussyouxikuaixunDao, DiscussyouxikuaixunEntity> implements DiscussyouxikuaixunService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyouxikuaixunEntity> page = this.selectPage(
                new Query<DiscussyouxikuaixunEntity>(params).getPage(),
                new EntityWrapper<DiscussyouxikuaixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyouxikuaixunEntity> wrapper) {
		  Page<DiscussyouxikuaixunView> page =new Query<DiscussyouxikuaixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyouxikuaixunVO> selectListVO(Wrapper<DiscussyouxikuaixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyouxikuaixunVO selectVO(Wrapper<DiscussyouxikuaixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyouxikuaixunView> selectListView(Wrapper<DiscussyouxikuaixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyouxikuaixunView selectView(Wrapper<DiscussyouxikuaixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
