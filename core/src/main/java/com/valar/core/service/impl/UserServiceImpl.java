package com.valar.core.service.impl;

import com.valar.core.entity.User;
import com.valar.core.entity.dto.UserDto;
import com.valar.core.mapper.UserMapper;
import com.valar.core.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 *
 * @author valarcfcc
 * @since 2021-01-31
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public UserDto findByName(String username) {
        return null;
    }
}
