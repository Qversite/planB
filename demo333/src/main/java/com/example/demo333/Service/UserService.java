package com.example.demo333.Service;

import com.example.demo333.Entity.Role;
import com.example.demo333.Entity.User;
import com.example.demo333.Repo.UserRepo;
import com.example.demo333.UsersDt.UsersDt;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepo;
    private final PasswordEncoder passwordEncoder;
    public void registration(UsersDt usersDt){
        User user =new User();
        user.setUsername(usersDt.getUsername());
        user.setPassword(passwordEncoder.encode(usersDt.getPassword()));
        user.setRoles(Collections.singleton(Role.USERS));
        userRepo.save(user);
    }
    public User findUser(String name){
        return userRepo.findByUsername(name);
    }
}
