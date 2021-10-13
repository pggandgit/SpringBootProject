package com.zuxia;

import com.zuxia.config.FoodConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @SpringBootApplication
 * 声明程序的入口
 *
 * @EnableConfigurationProperties({FoodConfig.class})
 * 告诉主程序入口类要自动引入配置文件
 * 配置文件对应的反射类作为它的参数
 */
@SpringBootApplication
@EnableConfigurationProperties({FoodConfig.class})
public class ApplicationDemo2 {
    public static void main(String[] args) {
        //使用spirngApplication的静态方法
        SpringApplication.run(ApplicationDemo2.class,args);
    }
}
