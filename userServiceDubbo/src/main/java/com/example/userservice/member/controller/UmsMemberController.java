package com.example.userservice.member.controller;


import com.example.orderservice.order.service.IOmsOrderService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
public class UmsMemberController {

    @DubboReference
    private IOmsOrderService orderService;

    @GetMapping("findOrderByUserId/{userId}")
    public Object findOrderByUserId(@PathVariable("userId") Integer userId) {
        return orderService.findOrderByUserId(userId);
    }

}
