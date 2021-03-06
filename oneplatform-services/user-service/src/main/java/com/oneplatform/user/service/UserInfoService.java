package com.oneplatform.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeesuite.common.util.AssertUtil;
import com.jeesuite.common.util.BeanUtils;
import com.jeesuite.mybatis.plugin.pagination.Page;
import com.jeesuite.mybatis.plugin.pagination.PageParams;
import com.jeesuite.mybatis.plugin.pagination.PageExecutor;
import com.jeesuite.mybatis.plugin.pagination.PageExecutor.PageDataLoader;
import com.oneplatform.user.dto.param.UserInfoQueryParam;
import com.oneplatform.user.dao.entity.UserInfoEntity;
import com.oneplatform.user.dao.mapper.UserInfoEntityMapper;

/**
 * generated by www.jeesuite.com
 */
@Service
public class UserInfoService {

	@Autowired
	private UserInfoEntityMapper userInfoMapper;

	public void addUserInfo(UserInfoEntity entity) {
		userInfoMapper.insertSelective(entity);
	}

	public void updateUserInfo(UserInfoEntity entity) {
		UserInfoEntity originEntity = userInfoMapper.selectByPrimaryKey(entity.getId());
		AssertUtil.notNull(originEntity);
		BeanUtils.copy(entity, originEntity);
		userInfoMapper.updateByPrimaryKey(originEntity);
	}
	
	public void deleteUserInfo(Integer id) {
		userInfoMapper.deleteByPrimaryKey(id);
	}
	
	public UserInfoEntity findUserInfoById(Integer id){
		UserInfoEntity entity = userInfoMapper.selectByPrimaryKey(id);
		AssertUtil.notNull(entity);
		return entity;
	}
	
    public Page<UserInfoEntity> pageQuery(PageParams pageParam,UserInfoQueryParam param){
		Page<UserInfoEntity> page = PageExecutor.pagination(pageParam, new PageDataLoader<UserInfoEntity>() {
			@Override
			public List<UserInfoEntity> load() {
				return userInfoMapper.findListByQueryParam(param);
			}
		});
		return page;
	}

}
