package com.valar.core.service.impl;

import com.valar.core.entity.QuartzLog;
import com.valar.core.mapper.QuartzLogMapper;
import com.valar.core.service.IQuartzLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 定时任务日志 服务实现类
 * </p>
 *
 * @author valarcfcc
 * @since 2021-01-31
 */
@Service
public class QuartzLogServiceImpl extends ServiceImpl<QuartzLogMapper, QuartzLog> implements IQuartzLogService {

}
