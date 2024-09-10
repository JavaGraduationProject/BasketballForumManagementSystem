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


import com.dao.JingcaifenxiangDao;
import com.entity.JingcaifenxiangEntity;
import com.service.JingcaifenxiangService;
import com.entity.vo.JingcaifenxiangVO;
import com.entity.view.JingcaifenxiangView;

@Service("jingcaifenxiangService")
public class JingcaifenxiangServiceImpl extends ServiceImpl<JingcaifenxiangDao, JingcaifenxiangEntity> implements JingcaifenxiangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingcaifenxiangEntity> page = this.selectPage(
                new Query<JingcaifenxiangEntity>(params).getPage(),
                new EntityWrapper<JingcaifenxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingcaifenxiangEntity> wrapper) {
		  Page<JingcaifenxiangView> page =new Query<JingcaifenxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingcaifenxiangVO> selectListVO(Wrapper<JingcaifenxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingcaifenxiangVO selectVO(Wrapper<JingcaifenxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingcaifenxiangView> selectListView(Wrapper<JingcaifenxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingcaifenxiangView selectView(Wrapper<JingcaifenxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
