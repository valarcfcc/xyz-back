package com.valar.core.service.impl;

import com.valar.core.entity.App;
import com.valar.core.mapper.AppMapper;
import com.valar.core.service.IAppService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 应用管理 服务实现类
 * </p>
 *
 * @author valarcfcc
 * @since 2021-01-31
 */
@Service
public class AppServiceImpl extends ServiceImpl<AppMapper, App> implements IAppService {

}
