package com.xiaoxin.service;

import com.xiaoxin.domain.User;
import com.xiaoxin.domain.UserTk;

/**
 * @author zhangyongxin
 * @date 2017/11/13 下午2:50
 */
public interface UserService {
    User getUserById(int userId);
    UserTk getUserTkById(int userId);
}
