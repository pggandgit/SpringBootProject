package com.zuxia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Controller
 * 声明控制类 用来处理业务逻辑 请求分发  组装响应
 */
@Controller
public class HellowController {
    /**
     *  @RequestMapping("/hello")
     *  指定方法和请求之间的映射关系
     * @return
     */
    @RequestMapping("/hello")
    @ResponseBody//代表返回值是json格式
    public String hello(){
        return "hello fdsaf";
    }
}
