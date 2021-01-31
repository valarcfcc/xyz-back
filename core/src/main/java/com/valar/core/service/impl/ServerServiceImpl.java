package com.valar.core.service.impl;

import com.valar.core.entity.Server;
import com.valar.core.mapper.ServerMapper;
import com.valar.core.service.IServerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务器管理 服务实现类
 * </p>
 *
 * @author valarcfcc
 * @since 2021-01-31
 */
@Service
public class ServerServiceImpl extends ServiceImpl<ServerMapper, Server> implements IServerService {

}
