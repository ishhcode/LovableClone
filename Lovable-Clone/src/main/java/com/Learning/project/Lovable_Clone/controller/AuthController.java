package com.Learning.project.Lovable_Clone.controller;

import com.Learning.project.Lovable_Clone.dto.auth.AuthResponse;
import com.Learning.project.Lovable_Clone.dto.auth.LoginRequest;
import com.Learning.project.Lovable_Clone.dto.auth.SignUpRequest;
import com.Learning.project.Lovable_Clone.dto.auth.UserProfileResponse;
import com.Learning.project.Lovable_Clone.service.AuthService;
import com.Learning.project.Lovable_Clone.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;
    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signUp(@RequestBody SignUpRequest request){
        return ResponseEntity.ok(authService.signUp(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request){
        return ResponseEntity.ok(authService.login(request));
    }

    @GetMapping("/profile")
    public ResponseEntity<UserProfileResponse> getProfile(){
        Long userId =1L;
        return ResponseEntity.ok(userService.getProfile(userId));
    }


}
