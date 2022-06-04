package com.example.tasktable.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ServiceFast {
    public String fileAdd(int AlzCode, String queja, String type, List<MultipartFile> file);

}
