package com.example.orderservice.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.orderservice.order.entity.OmsOrder;

import java.util.List;

/**
 * <p>
 * 订单表 服务类
 * </p>
 *
 * @author author
 * @since 2021-09-05
 */
public interface IOmsOrderService extends IService<OmsOrder> {

    OmsOrder findById(Integer id);

    List<OmsOrder> findOrderByUserId(Integer userId);
}
