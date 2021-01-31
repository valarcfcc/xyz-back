package com.valar.core.service.impl;

import com.valar.core.entity.Database;
import com.valar.core.mapper.DatabaseMapper;
import com.valar.core.service.IDatabaseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 数据库管理 服务实现类
 * </p>
 *
 * @author valarcfcc
 * @since 2021-01-31
 */
@Service
public class DatabaseServiceImpl extends ServiceImpl<DatabaseMapper, Database> implements IDatabaseService {

}
