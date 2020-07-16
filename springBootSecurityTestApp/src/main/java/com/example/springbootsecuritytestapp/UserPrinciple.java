package com.example.springbootsecuritytestapp;

//import org.hibernate.engine.internal.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

//principle means current user
public class UserPrinciple implements UserDetails {
    private DatabaseConfig databaseConfig;

    UserPrinciple(DatabaseConfig databaseConfig) {
        super();
        this.databaseConfig = databaseConfig;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority("USER"));
    }

    @Override
    public String getPassword() {
        return databaseConfig.getPassword();
    }

    @Override
    public String getUsername() {
        return databaseConfig.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
