package ru.asteises.simpleauth.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.asteises.simpleauth.model.User;
import ru.asteises.simpleauth.model.dto.UserRegDto;
import ru.asteises.simpleauth.storage.UserRepository;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    public void registration(UserRegDto userRegDto) {

        User user = new User();
        user.setEmail(userRegDto.getEmail());
        user.setPassword(passwordEncoder.encode(userRegDto.getPassword()));
        user.setFirstname(userRegDto.getFirstname());
        user.setLastname(userRegDto.getLastname());
//        user.setRole(Role.valueOf(userRegDto.getRole()));

        log.info("Save user: {}", user);
        userRepository.save(user);
    }
}
