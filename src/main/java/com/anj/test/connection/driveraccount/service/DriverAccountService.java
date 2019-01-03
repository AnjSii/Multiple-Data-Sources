package com.anj.test.connection.driveraccount.service;

import com.anj.test.connection.driveraccount.domain.DriverAccount;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * @author anj
 */
public interface DriverAccountService extends IService<DriverAccount> {

	List<DriverAccount> list();
}
