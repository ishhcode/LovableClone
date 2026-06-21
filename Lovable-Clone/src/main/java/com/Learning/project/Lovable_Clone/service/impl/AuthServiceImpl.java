package com.Learning.project.Lovable_Clone.service.impl;


import com.Learning.project.Lovable_Clone.dto.auth.AuthResponse;
import com.Learning.project.Lovable_Clone.dto.auth.LoginRequest;
import com.Learning.project.Lovable_Clone.dto.auth.SignUpRequest;
import com.Learning.project.Lovable_Clone.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public AuthResponse signUp(SignUpRequest request) {
        return null;
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        return null;
    }
}
