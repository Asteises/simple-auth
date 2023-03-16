package ru.asteises.simpleauth.model.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoleDto {

    @NotEmpty
    @Size(min = 2, max = 100, message = "Role must be from 2 to 100 characters")
    private String roleName;
}
