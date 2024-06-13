package com.example.demo333.UsersDt;

import com.example.demo333.Entity.Role;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsersDt {
    private Long id;
    private String username;
    private String password;
    private Set<Role> roles;
}
