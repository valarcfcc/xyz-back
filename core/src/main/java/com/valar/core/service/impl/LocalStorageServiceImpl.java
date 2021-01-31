package com.valar.core.service.impl;

import com.valar.core.entity.LocalStorage;
import com.valar.core.mapper.LocalStorageMapper;
import com.valar.core.service.ILocalStorageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 本地存储 服务实现类
 * </p>
 *
 * @author valarcfcc
 * @since 2021-01-31
 */
@Service
public class LocalStorageServiceImpl extends ServiceImpl<LocalStorageMapper, LocalStorage> implements ILocalStorageService {

}
