package com.valar.core.service.impl;

import com.valar.core.entity.AlipayConfig;
import com.valar.core.mapper.AlipayConfigMapper;
import com.valar.core.service.IAlipayConfigService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 支付宝配置类 服务实现类
 * </p>
 *
 * @author valarcfcc
 * @since 2021-01-31
 */
@Service
public class AlipayConfigServiceImpl extends ServiceImpl<AlipayConfigMapper, AlipayConfig> implements IAlipayConfigService {

}
