package com.Learning.project.Lovable_Clone.service;

import com.Learning.project.Lovable_Clone.dto.auth.AuthResponse;
import com.Learning.project.Lovable_Clone.dto.auth.LoginRequest;
import com.Learning.project.Lovable_Clone.dto.auth.SignUpRequest;
import org.jspecify.annotations.Nullable;

public interface AuthService {

    AuthResponse signUp(SignUpRequest request);

    AuthResponse login(LoginRequest request);
}
