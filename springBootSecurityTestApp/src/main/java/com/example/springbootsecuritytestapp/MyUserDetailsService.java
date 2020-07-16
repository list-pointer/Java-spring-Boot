package com.example.springbootsecuritytestapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    UserRepository repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        DatabaseConfig data = repo.findByUserName(username);
        if (data == null) {
            throw new UsernameNotFoundException("User 404");
        }
        return new UserPrinciple(data);
    }
}
