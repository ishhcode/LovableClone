package com.Learning.project.Lovable_Clone.service;

import com.Learning.project.Lovable_Clone.dto.project.FileContentResponse;
import com.Learning.project.Lovable_Clone.dto.project.FileNode;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface FileService {
    List<FileNode> getFileTree(Long projectId, Long userId);

    FileContentResponse getFile(Long projectId, String path, Long userId);
}
