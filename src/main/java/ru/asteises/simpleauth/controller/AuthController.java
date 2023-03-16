package ru.asteises.simpleauth.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.asteises.simpleauth.model.dto.UserRegDto;
import ru.asteises.simpleauth.service.UserService;

@Slf4j
@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @PostMapping("/registration")
    public ResponseEntity<String> registration(@RequestBody @Valid UserRegDto userRegDto) {
        log.info("UserRegDto come in: {}", userRegDto);
        userService.registration(userRegDto);
        return ResponseEntity.ok("User create and save in DB");
    }
}
