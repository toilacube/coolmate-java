package com.example.crud.Auth.AuthenToken;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class EmailPasswordAuthenticationToken extends UsernamePasswordAuthenticationToken {
    public EmailPasswordAuthenticationToken(Object principal, Object credentials) {
        super(principal, credentials);
    }

    public EmailPasswordAuthenticationToken(Object principal, Object credentials, Collection<? extends GrantedAuthority> authorities) {
        super(principal, credentials, authorities);
    }
}
