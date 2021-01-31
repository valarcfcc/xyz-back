package com.valar.core.service.impl;

import com.valar.core.entity.QuartzJob;
import com.valar.core.mapper.QuartzJobMapper;
import com.valar.core.service.IQuartzJobService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 定时任务 服务实现类
 * </p>
 *
 * @author valarcfcc
 * @since 2021-01-31
 */
@Service
public class QuartzJobServiceImpl extends ServiceImpl<QuartzJobMapper, QuartzJob> implements IQuartzJobService {

}
