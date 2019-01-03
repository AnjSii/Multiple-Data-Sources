package com.anj.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anj.test.common.CommonResponse;
import com.anj.test.common.ResponseUtil;
import com.anj.test.connection.orderinfo.domain.OrderInfo;
import com.anj.test.connection.orderinfo.service.OrderInfoService;
import com.anj.test.utils.ServiceException;

/**
 * @author anj
 */
@RestController
@RequestMapping("/order")
public class OrderController {

@Autowired
private OrderInfoService orderInfoService;

	/**
	* Get all product
	*
	* @return
	* @throws ServiceException
	*/
	@RequestMapping(value = "/getAllOrderInfo", method = RequestMethod.GET)
	public CommonResponse getAllProduct() {
		List<OrderInfo> orderInfoList = this.orderInfoService.list();
		return ResponseUtil.generateResponse(orderInfoList);
	}

	/**
	 * getNewOrder
	 *
	 * @return
	 * @throws ServiceException
	 */
	@RequestMapping(value = "/getNewOrder", method = RequestMethod.GET)
	public CommonResponse getNewOrder() {
		OrderInfo orderInfoList = this.orderInfoService.getNewOrder();
		return ResponseUtil.generateResponse(orderInfoList);
	}
}
