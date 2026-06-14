package com.Learning.project.Lovable_Clone.service;

import com.Learning.project.Lovable_Clone.dto.auth.UserProfileResponse;

public interface UserService {
     UserProfileResponse getProfile(Long userId);
}
