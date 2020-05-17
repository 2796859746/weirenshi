package com.niit.vhrend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@EnableSwagger2
//@ComponentScan("com.niit.vhrend.swagger")
@SpringBootApplication
@MapperScan("com.niit.vhrend.mapper")
public class VhrEndApplication {

    public static void main(String[] args) {
        SpringApplication.run(VhrEndApplication.class, args);
    }
    @GetMapping("/hello")
    public String hello(){
        return "hello spring security";
    }
}
