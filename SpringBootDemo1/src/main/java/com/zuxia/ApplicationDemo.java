package com.zuxia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication
 * 声明我们的入口类 并且声明是springboot项目的
 */
@SpringBootApplication
public class ApplicationDemo {
    public static void main(String[] args) {
        //使用SpringApplication类的静态方法 启动springboot程序
        //方法的参数：1.程序的入口类  2.main函数的参数args
        SpringApplication.run(ApplicationDemo.class,args);
    }
}
