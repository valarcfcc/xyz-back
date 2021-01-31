package com.valar.core.service.impl;

import com.valar.core.entity.QiniuConfig;
import com.valar.core.mapper.QiniuConfigMapper;
import com.valar.core.service.IQiniuConfigService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 七牛云配置 服务实现类
 * </p>
 *
 * @author valarcfcc
 * @since 2021-01-31
 */
@Service
public class QiniuConfigServiceImpl extends ServiceImpl<QiniuConfigMapper, QiniuConfig> implements IQiniuConfigService {

}
