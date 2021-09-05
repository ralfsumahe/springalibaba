package com.example.orderservice.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.orderservice.order.entity.OmsOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 订单表 Mapper 接口
 * </p>
 *
 * @author author
 * @since 2021-09-05
 */
@Mapper
public interface OmsOrderMapper extends BaseMapper<OmsOrder> {

    List<OmsOrder> findOrderByUserId(Integer userId);
}
