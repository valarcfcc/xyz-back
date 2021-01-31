package com.valar.core.service.impl;

import com.valar.core.entity.DeployServer;
import com.valar.core.mapper.DeployServerMapper;
import com.valar.core.service.IDeployServerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 应用与服务器关联 服务实现类
 * </p>
 *
 * @author valarcfcc
 * @since 2021-01-31
 */
@Service
public class DeployServerServiceImpl extends ServiceImpl<DeployServerMapper, DeployServer> implements IDeployServerService {

}
