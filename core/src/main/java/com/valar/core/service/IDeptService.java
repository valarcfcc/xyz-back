package com.valar.core.service;

import com.valar.core.entity.Dept;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * <p>
 * 部门 服务类
 * </p>
 *
 * @author valarcfcc
 * @since 2021-01-31
 */
public interface IDeptService extends IService<Dept> {

    Set<Dept> findByRoleId(Long id);

    List<Dept> findByPid(Long deptId);

    Collection<? extends Long> getDeptChildren(Long deptId, List<Dept> deptChildren);
}
