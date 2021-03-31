package com.xunjer.cn.personal_cv;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@MapperScan(basePackages = {"com.xunjer.cn.personal_cv.mapper"})
public class PersonalCvApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonalCvApplication.class, args);
    }

}
