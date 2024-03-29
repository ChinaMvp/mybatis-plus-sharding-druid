package com.mvp.world.mybatisplusshardingdruid.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mvp.world.mybatisplusshardingdruid.model.po.OrderPo;

import java.math.BigDecimal;
import java.util.List;

public interface OrderService extends IService<OrderPo> {

    OrderPo getOrderPoByUserId(Long userId, Long id);

    OrderPo getOrderPoById(Long id);

    Long saveOne(Long userId, Long orderId, BigDecimal price, String remark);

    int insertBatchOrders(List<OrderPo> orderList);
}
