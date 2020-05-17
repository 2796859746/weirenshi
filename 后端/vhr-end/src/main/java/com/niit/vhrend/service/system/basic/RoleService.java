package com.niit.vhrend.service.system.basic;

import com.niit.vhrend.mapper.RoleMapper;
import com.niit.vhrend.model.Role;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleService {
    @Resource
    RoleMapper roleMapper;
    public List<Role> getAllRoles(){
        return roleMapper.getAllRoles();
    }
    public Integer addRole(Role role){
        if(!role.getName().startsWith("ROLE_")){
            role.setName("ROLE_"+role.getName());
        }
        return roleMapper.insert(role);
    }
    public Integer deleteRoleById(Integer rid){
        return roleMapper.deleteByPrimaryKey(rid);
    }
}
