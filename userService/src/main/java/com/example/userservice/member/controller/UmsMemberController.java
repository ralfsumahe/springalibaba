package com.example.userservice.member.controller;


import com.example.userservice.config.OrderFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 * 会员表 前端控制器
 * </p>
 *
 * @author author
 * @since 2021-09-05
 */
@RestController
@RequestMapping("/member")
@Slf4j
public class UmsMemberController {

    @Autowired
    private RestTemplate restTemplate;
    @LoadBalanced
    @Autowired
    private RestTemplate restTemplate2;
    @Autowired
    private OrderFeignService orderFeignService;

    @GetMapping("findOrderByUserId/{userId}")
    public Object findOrderByUserId(@PathVariable("userId") Integer userId){
        log.info("findOrderByUserId");
        return restTemplate.getForObject("http://localhost:8081/order/findOrderByUserId/"+userId,Object.class);
    }

    @GetMapping("findOrderByUserId2/{userId}")
    public Object findOrderByUserId2(@PathVariable("userId") Integer userId){
        log.info("findOrderByUserId2");
        return restTemplate2.getForObject("http://service-order/order/findOrderByUserId/"+userId,Object.class);
    }

    @GetMapping("findOrderByUserId3/{userId}")
    public Object findOrderByUserId3(@PathVariable("userId") Integer userId){
        log.info("findOrderByUserId3");
        return orderFeignService.findOrderByUserId(userId);
    }


}
