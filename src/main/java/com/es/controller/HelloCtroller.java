package com.es.controller;

import com.es.config.Swagger2;
import com.es.entity.Person;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "ProductController", tags = "商品-相关接口")
public class HelloCtroller {
    @Autowired
    Swagger2 swagger2;


    @ApiOperation(value = "导入商品信息", notes = "导入商品信息，选择供应商导入模板")
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(/*@ApiParam(name = "商品信息", value = "传入json格式", required = true)Person person*/){
        System.out.println("===================");
        System.out.println(swagger2);
        return "hello ,world";
    }



}
