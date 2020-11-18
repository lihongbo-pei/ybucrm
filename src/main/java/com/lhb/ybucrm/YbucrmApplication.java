package com.lhb.ybucrm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.lhb.ybucrm"})
@MapperScan(basePackages={"com.lhb.ybucrm.mapper"}) // 扫 描 M a p p e
public class YbucrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(YbucrmApplication.class, args);
    }

}
