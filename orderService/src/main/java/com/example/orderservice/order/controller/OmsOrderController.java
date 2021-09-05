package com.example.orderservice.order.controller;


import com.example.orderservice.order.entity.OmsOrder;
import com.example.orderservice.order.service.IOmsOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 订单表 前端控制器
 * </p>
 *
 * @author author
 * @since 2021-09-05
 */
@RestController
@RequestMapping("/order")
public class OmsOrderController {
    @Autowired
    private IOmsOrderService orderService;

    @GetMapping("/{id}")
    public OmsOrder findOrderById(@PathVariable("id")Integer id){
        OmsOrder omsOrder = orderService.findById(id);
        return omsOrder;
    }

    @GetMapping("findOrderByUserId/{userId}")
    public List<OmsOrder> findOrderByUserId(@PathVariable("userId")Integer userId){
        List<OmsOrder> orders = orderService.findOrderByUserId(userId);
        return orders;
    }

}
