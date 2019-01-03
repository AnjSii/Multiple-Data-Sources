package com.anj.test.connection.orderinfo.service;

import com.anj.test.connection.orderinfo.domain.OrderInfo;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * @author anj
 */
public interface OrderInfoService extends IService<OrderInfo> {

	List<OrderInfo> list();

	OrderInfo getNewOrder();

	OrderInfo update(OrderInfo orderInfo);
}
