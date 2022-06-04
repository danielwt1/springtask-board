package com.example.tasktable.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class FastImpl implements ServiceFast{
    @Override
    public String fileAdd(int AlzCode, String queja, String type, List<MultipartFile> file) {
        System.out.println("file.size() = " + file.size());
        file.stream().forEach((element) -> {
            System.out.println("element = " + element);
        });
        return "xd";
    }
}
