package ru.learnup.learnup.spring.mvc.homework30.roles;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

@Data
public class UserRoleForUser implements GrantedAuthority {

    private final String role;

    public UserRoleForUser(String role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return role;
    }
}
