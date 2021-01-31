package com.valar.core.service.impl;

import com.valar.core.entity.Menu;
import com.valar.core.mapper.MenuMapper;
import com.valar.core.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统菜单 服务实现类
 * </p>
 *
 * @author valarcfcc
 * @since 2021-01-31
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
