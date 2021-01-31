package com.valar.core.service.impl;

import com.valar.core.entity.DeployHistory;
import com.valar.core.mapper.DeployHistoryMapper;
import com.valar.core.service.IDeployHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 部署历史管理 服务实现类
 * </p>
 *
 * @author valarcfcc
 * @since 2021-01-31
 */
@Service
public class DeployHistoryServiceImpl extends ServiceImpl<DeployHistoryMapper, DeployHistory> implements IDeployHistoryService {

}
