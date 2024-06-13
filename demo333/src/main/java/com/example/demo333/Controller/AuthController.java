package com.example.demo333.Controller;

import com.example.demo333.Repo.UserRepo;
import com.example.demo333.Service.UserService;
import com.example.demo333.UsersDt.UsersDt;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping
public class AuthController {
    private final UserService userService;
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/registration")
    public String registerForm(){
        return "registration";
    }

    @PostMapping("/registration")
    public String registerUser(UsersDt usersDt){
        userService.registration(usersDt);
        return "redirect:/login";
    }
}
