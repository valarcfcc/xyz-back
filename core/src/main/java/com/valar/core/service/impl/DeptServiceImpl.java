package com.valar.core.service.impl;

import com.valar.core.entity.Dept;
import com.valar.core.mapper.DeptMapper;
import com.valar.core.service.IDeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * <p>
 * 部门 服务实现类
 * </p>
 *
 * @author valarcfcc
 * @since 2021-01-31
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {

    @Override
    public Set<Dept> findByRoleId(Long id) {
        return null;
    }

    @Override
    public List<Dept> findByPid(Long deptId) {
        return null;
    }

    @Override
    public Collection<? extends Long> getDeptChildren(Long deptId, List<Dept> deptChildren) {
        return null;
    }
}
