package com.Learning.project.Lovable_Clone.service.impl;

import com.Learning.project.Lovable_Clone.dto.project.FileContentResponse;
import com.Learning.project.Lovable_Clone.dto.project.FileNode;
import com.Learning.project.Lovable_Clone.service.FileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl implements FileService {
    @Override
    public List<FileNode> getFileTree(Long projectId, Long userId) {
        return List.of();
    }

    @Override
    public FileContentResponse getFile(Long projectId, String path, Long userId) {
        return null;
    }
}
