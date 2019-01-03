package com.anj.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anj.test.common.CommonResponse;
import com.anj.test.common.ResponseUtil;
import com.anj.test.connection.driveraccount.domain.DriverAccount;
import com.anj.test.connection.driveraccount.service.DriverAccountService;
import com.anj.test.connection.orderinfo.domain.OrderInfo;
import com.anj.test.connection.orderinfo.service.OrderInfoService;
import com.anj.test.utils.ServiceException;
import com.baomidou.mybatisplus.mapper.EntityWrapper;

/**
 * @author anj
 */
@RestController
@RequestMapping("/driver")
public class DriverController {

@Autowired
private DriverAccountService driverAccountService;

@Autowired
private OrderInfoService orderInfoService;

	/**
	* Get all product
	*
	* @return
	* @throws ServiceException
	*/
	@RequestMapping(value = "/getAllDriverAccount", method = RequestMethod.GET)
	public CommonResponse getAllProduct() {
		List<DriverAccount> driverAccountList = this.driverAccountService.list();
		return ResponseUtil.generateResponse(driverAccountList);
	}

	/**
	 * Get all product
	 *
	 * @return
	 * @throws ServiceException
	 */
	@RequestMapping(value = "/orderTodriver", method = RequestMethod.POST)
	public CommonResponse orderTodriver(@RequestParam Long driverId, @RequestParam("orderNo") String orderNo) {
		OrderInfo orderInfo = new OrderInfo();
		orderInfo.setOrderNo(orderNo);
		EntityWrapper entityWrapper = new EntityWrapper();
		entityWrapper.setEntity(orderInfo);
		orderInfo =  this.orderInfoService.selectOne(entityWrapper);
		DriverAccount driverAccount = this.driverAccountService.selectById(driverId);
		if (orderInfo == null|| driverAccount == null) {
			return ResponseUtil.generateResponse(false);
		}
		orderInfo.setDriverID(driverAccount.getId());
		orderInfo.setDriverPhone(driverAccount.getPhone());
		orderInfo.setStatus(1L);
		driverAccount.setDriverStatus(2);
		this.orderInfoService.updateAllColumnById(orderInfo);
		this.driverAccountService.updateAllColumnById(driverAccount);
		return ResponseUtil.generateResponse(orderInfo);
	}
}
