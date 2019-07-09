package com.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 开启读取配置文件
@SpringBootApplication
@MapperScan({"com.admin.*.mapper"}) 
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
