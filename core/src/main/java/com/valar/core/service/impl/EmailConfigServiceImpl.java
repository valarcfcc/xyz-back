package com.valar.core.service.impl;

import com.valar.core.entity.EmailConfig;
import com.valar.core.mapper.EmailConfigMapper;
import com.valar.core.service.IEmailConfigService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 邮箱配置 服务实现类
 * </p>
 *
 * @author valarcfcc
 * @since 2021-01-31
 */
@Service
public class EmailConfigServiceImpl extends ServiceImpl<EmailConfigMapper, EmailConfig> implements IEmailConfigService {

}
