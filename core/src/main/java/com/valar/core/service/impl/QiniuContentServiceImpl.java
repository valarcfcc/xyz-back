package com.valar.core.service.impl;

import com.valar.core.entity.QiniuContent;
import com.valar.core.mapper.QiniuContentMapper;
import com.valar.core.service.IQiniuContentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 七牛云文件存储 服务实现类
 * </p>
 *
 * @author valarcfcc
 * @since 2021-01-31
 */
@Service
public class QiniuContentServiceImpl extends ServiceImpl<QiniuContentMapper, QiniuContent> implements IQiniuContentService {

}
