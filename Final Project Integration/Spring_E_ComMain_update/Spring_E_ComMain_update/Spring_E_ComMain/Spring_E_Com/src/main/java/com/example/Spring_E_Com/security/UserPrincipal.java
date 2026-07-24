package com.example.Spring_E_Com.security;

import com.example.Spring_E_Com.model.User;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
@Getter
@RequiredArgsConstructor
public class UserPrincipal implements UserDetails {

    private final User user;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(user.getRole().getName()));
    }

    @Override
    public @Nullable String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getEmail();
    }

    @Override
    public boolean isAccountNonLocked() {
        return user.getAccountNonLocked();
    }

    @Override
    public boolean isEnabled() {
        return user.getIsActive();
    }

    @Override
    public boolean isAccountNonExpired() {
        return user.getAccountNotExpired();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return user.getCredentialsNonExpired();
    }
}
