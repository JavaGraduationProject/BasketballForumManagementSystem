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


import com.dao.DiscussjingcaifenxiangDao;
import com.entity.DiscussjingcaifenxiangEntity;
import com.service.DiscussjingcaifenxiangService;
import com.entity.vo.DiscussjingcaifenxiangVO;
import com.entity.view.DiscussjingcaifenxiangView;

@Service("discussjingcaifenxiangService")
public class DiscussjingcaifenxiangServiceImpl extends ServiceImpl<DiscussjingcaifenxiangDao, DiscussjingcaifenxiangEntity> implements DiscussjingcaifenxiangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjingcaifenxiangEntity> page = this.selectPage(
                new Query<DiscussjingcaifenxiangEntity>(params).getPage(),
                new EntityWrapper<DiscussjingcaifenxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjingcaifenxiangEntity> wrapper) {
		  Page<DiscussjingcaifenxiangView> page =new Query<DiscussjingcaifenxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjingcaifenxiangVO> selectListVO(Wrapper<DiscussjingcaifenxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjingcaifenxiangVO selectVO(Wrapper<DiscussjingcaifenxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjingcaifenxiangView> selectListView(Wrapper<DiscussjingcaifenxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjingcaifenxiangView selectView(Wrapper<DiscussjingcaifenxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
