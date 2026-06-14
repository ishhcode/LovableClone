package com.Learning.project.Lovable_Clone.entity;

import java.time.Instant;

public class UsageLog {
    Long id ;
    Project projectId;
    User userId;
    String action;
    Integer tokensUsed;
    Integer durationMs;
    String metadata;  //json of (model_used, prompt_used etc)
    Instant createdAt;
}
