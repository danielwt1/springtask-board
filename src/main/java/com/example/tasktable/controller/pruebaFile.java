package com.example.tasktable.controller;

import com.example.tasktable.controller.api.PruebaApiCTRL;
import com.example.tasktable.service.ServiceFast;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
public class pruebaFile implements PruebaApiCTRL {
    @Autowired
    private ServiceFast serviceFast;

    @Override
    public String addFile(@PathVariable String type, @RequestParam List<MultipartFile> file, @PathVariable String codigo_queja, @PathVariable int codigoALZ) {

        System.out.println("file.size() = " + file.size());
        file.stream().forEach((element) -> {
            System.out.println("element = " + element);
        });
        return serviceFast.fileAdd(codigoALZ, codigo_queja, type, file);
    }
}