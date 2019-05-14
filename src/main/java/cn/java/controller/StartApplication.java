package cn.java.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Description: springboot启动程序
 * 
 * @author Yin
 * @version
 * @see
 */
@SpringBootApplication(scanBasePackages = { "cn.java.controller", "cn.java.service.impl" })
@EnableAutoConfiguration
// 配置mapper层的扫描
@MapperScan(basePackages = { "cn.java.mapper" })
public class StartApplication {	
    public static void main(String[] args) {  
        SpringApplication.run(StartApplication.class, args);
    }
}
