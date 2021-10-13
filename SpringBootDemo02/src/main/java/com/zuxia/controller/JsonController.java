package com.zuxia.controller;

import com.zuxia.config.FoodConfig;
import com.zuxia.entiey.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController
 * 是@Controller和@ResponseBody的组合
 * 用来返回json格式的响应结果  而不是视图
 */
@RestController
public class JsonController {
    /**
     * food.rice=拌饭
     * food.meat=烤肉
     * @Value 通过${key}结构获得配置文件中的属性
     */
    @Value("food.rice")
    private String rice;
    @Value("food.meat")
    private String meat;
    //返回jsong格式
    @RequestMapping("/json")
    public Food json(){
        //使用注解@Value获得配置文件中的属性
        Food food=new Food(rice,meat);
        return food;
    }

    //使用绑定bean类的方式获得配置文件中的属性
    @Autowired
    private FoodConfig foodConfig;
    @RequestMapping("/beanJson")
    public Food BeanJSON(){
        Food food=new Food(foodConfig.getRice(),foodConfig.getMeat());
        return food;
    }
}
