package com.example.tasktable.controller.api;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

//@Api(tags={"proxycobol"})
@RequestMapping(path ={"/apiP/"},produces ={MediaType.APPLICATION_JSON_VALUE})
public interface PruebaApiCTRL {
    @RequestMapping(value="prueba/{codigoALZ}/{codigo_queja}/{type}",method= RequestMethod.POST,consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    String addFile(String type, List<MultipartFile>file,String codigo_queja,int codigoALZ);
}
