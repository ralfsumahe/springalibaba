package com.example.userservice.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "service-order",path = "/order",configuration = FeignConfig.class)
public interface OrderFeignService {
    @GetMapping("/findOrderByUserId/{userId}")
    public Object findOrderByUserId(@PathVariable("userId")Integer userId);
}
