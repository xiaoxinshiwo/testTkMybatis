package com.xiaoxin.service.impl;

import com.xiaoxin.dao.UserMapper;
import com.xiaoxin.dao.UserTkMapper;
import com.xiaoxin.domain.User;
import com.xiaoxin.domain.UserTk;
import com.xiaoxin.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhangyongxin
 * @date 2017/11/13 下午2:51
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userDao;
    @Resource
    private UserTkMapper userTkDao;

    public User getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }
    public UserTk getUserTkById(int userId) {
        return this.userTkDao.selectByPrimaryKey(userId);
    }
}
