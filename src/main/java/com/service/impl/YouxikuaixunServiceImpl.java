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


import com.dao.YouxikuaixunDao;
import com.entity.YouxikuaixunEntity;
import com.service.YouxikuaixunService;
import com.entity.vo.YouxikuaixunVO;
import com.entity.view.YouxikuaixunView;

@Service("youxikuaixunService")
public class YouxikuaixunServiceImpl extends ServiceImpl<YouxikuaixunDao, YouxikuaixunEntity> implements YouxikuaixunService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YouxikuaixunEntity> page = this.selectPage(
                new Query<YouxikuaixunEntity>(params).getPage(),
                new EntityWrapper<YouxikuaixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YouxikuaixunEntity> wrapper) {
		  Page<YouxikuaixunView> page =new Query<YouxikuaixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YouxikuaixunVO> selectListVO(Wrapper<YouxikuaixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YouxikuaixunVO selectVO(Wrapper<YouxikuaixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YouxikuaixunView> selectListView(Wrapper<YouxikuaixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YouxikuaixunView selectView(Wrapper<YouxikuaixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
