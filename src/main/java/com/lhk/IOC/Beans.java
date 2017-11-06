package com.lhk.IOC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/6 11:40
 */
@Configuration
public class Beans {
    @Bean(name = "car")
    public Car buildCar() {
        Car car = new Car();
        car.setBrand("宝马330");
        car.setColor("红色");
        car.setMaxSpeed(400);
        return car;
    }

}
