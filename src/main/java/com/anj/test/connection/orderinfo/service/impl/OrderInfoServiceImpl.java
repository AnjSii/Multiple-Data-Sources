package com.anj.test.connection.orderinfo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anj.test.connection.orderinfo.domain.OrderInfo;
import com.anj.test.connection.orderinfo.mapper.OrderInfoMapper;
import com.anj.test.connection.orderinfo.service.OrderInfoService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

/**
 * @author anj
 */
@Service
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo> implements OrderInfoService {

	@Override
	public List<OrderInfo> list() {
		return super.selectList(null);
	}

	@Override
	public OrderInfo getNewOrder() {
		EntityWrapper entityWrapper = new EntityWrapper();
		entityWrapper.orderBy("id", false);
		List<OrderInfo> orderInfoList = this.selectList(entityWrapper);
		return orderInfoList.get(0);
	}

	@Override
	public OrderInfo update(OrderInfo orderInfo) {
		this.updateAllColumnById(orderInfo);
		return orderInfo;
	}
}
