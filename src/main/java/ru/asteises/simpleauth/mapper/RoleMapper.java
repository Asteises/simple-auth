package ru.asteises.simpleauth.mapper;

import org.springframework.stereotype.Service;
import ru.asteises.simpleauth.model.dto.RoleDto;
import ru.asteises.simpleauth.model.entity.Role;

@Service
public class RoleMapper {

    public Role toRole(RoleDto roleDto) {
        Role role = new Role();
        role.setName(roleDto.getRoleName());
        return role;
    }

    public RoleDto toDto(Role role) {
        RoleDto roleDto = new RoleDto();
        roleDto.setRoleName(role.getName());
        return roleDto;
    }
}
