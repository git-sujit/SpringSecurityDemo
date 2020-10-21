package com.demo.security;

import com.demo.domain.User;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomSecurityUser extends User implements UserDetails {
    public CustomSecurityUser() {
    }

    public CustomSecurityUser(User user) {
        this.setAuthorities(user.getAuthorities());
        this.setUserId(user.getUserId());
        this.setUsername(user.getUsername());
        this.setPassword(user.getPassword());
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
