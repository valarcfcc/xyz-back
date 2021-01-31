package com.valar.core.service.impl;

import com.valar.core.entity.Deploy;
import com.valar.core.mapper.DeployMapper;
import com.valar.core.service.IDeployService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 部署管理 服务实现类
 * </p>
 *
 * @author valarcfcc
 * @since 2021-01-31
 */
@Service
public class DeployServiceImpl extends ServiceImpl<DeployMapper, Deploy> implements IDeployService {

}
