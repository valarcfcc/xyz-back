package com.valar.core.service;

import com.valar.core.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.valar.core.entity.dto.UserDto;

/**
 * <p>
 * 系统用户 服务类
 * </p>
 *
 * @author valarcfcc
 * @since 2021-01-31
 */
public interface IUserService extends IService<User> {

    UserDto findByName(String username);
}
