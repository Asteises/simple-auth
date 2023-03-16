package ru.asteises.simpleauth.model.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRegDto {

    @NotEmpty
    @Size(min = 4, max = 100, message = "Email must be min 4 and max 100 characters")
    private String email;

    @Min(value = 6, message = "Password must be min 6 characters")
    private String password;

    @Size(min = 2, max = 100, message = "First name must be from 2 to 100 characters")
    private String firstname;

    @Size(min = 2, max = 100, message = "Last name must be from 2 to 100 characters")
    private String lastname;

    private String role;
}
