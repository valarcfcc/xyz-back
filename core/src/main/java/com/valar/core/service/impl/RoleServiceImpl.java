package com.valar.core.service.impl;

import com.valar.core.entity.Role;
import com.valar.core.entity.dto.RoleDto;
import com.valar.core.entity.dto.RoleQueryCriteria;
import com.valar.core.entity.dto.RoleSmallDto;
import com.valar.core.entity.dto.UserDto;
import com.valar.core.mapper.RoleMapper;
import com.valar.core.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Set;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author valarcfcc
 * @since 2021-01-31
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

    @Override
    public List<RoleDto> queryAll() {
        return null;
    }

    @Override
    public RoleDto findById(long id) {
        return null;
    }

    @Override
    public void create(Role resources) {

    }

    @Override
    public void update(Role resources) {

    }

    @Override
    public void delete(Set<Long> ids) {

    }

    @Override
    public List<RoleSmallDto> findByUsersId(Long id) {
        return null;
    }

    @Override
    public Integer findByRoles(Set<Role> roles) {
        return null;
    }

    @Override
    public void updateMenu(Role resources, RoleDto roleDTO) {

    }

    @Override
    public void untiedMenu(Long id) {

    }

    @Override
    public Object queryAll(RoleQueryCriteria criteria, Pageable pageable) {
        return null;
    }

    @Override
    public List<RoleDto> queryAll(RoleQueryCriteria criteria) {
        return null;
    }

    @Override
    public void download(List<RoleDto> queryAll, HttpServletResponse response) throws IOException {

    }

    @Override
    public List<GrantedAuthority> mapToGrantedAuthorities(UserDto user) {
        return null;
    }

    @Override
    public void verification(Set<Long> ids) {

    }

    @Override
    public List<Role> findInMenuId(List<Long> menuIds) {
        return null;
    }
}
