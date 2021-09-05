package com.example.orderservice.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.orderservice.order.entity.OmsOrder;
import com.example.orderservice.order.mapper.OmsOrderMapper;
import com.example.orderservice.order.service.IOmsOrderService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author author
 * @since 2021-09-05
 */
@DubboService
public class OmsOrderServiceImpl extends ServiceImpl<OmsOrderMapper, OmsOrder> implements IOmsOrderService {
    @Autowired
    private OmsOrderMapper orderMapper;

    @Override
    public OmsOrder findById(Integer id) {
        return orderMapper.selectById(id);
    }

    @Override
    public List<OmsOrder> findOrderByUserId(Integer userId) {
        return orderMapper.findOrderByUserId(userId);
    }
}
