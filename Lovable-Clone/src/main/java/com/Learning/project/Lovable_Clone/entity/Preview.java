package com.Learning.project.Lovable_Clone.entity;

import com.Learning.project.Lovable_Clone.Enum.PreviewStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Preview {

    @Id
    Long id;
    Project projectId;
    String namespace;
    String prodName;
    String previewUrl;
    PreviewStatus status;
    Instant startedAt;
    Instant TerminatedAt;
    Instant createdAt;
}
