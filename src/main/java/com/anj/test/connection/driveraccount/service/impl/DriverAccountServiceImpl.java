package com.anj.test.connection.driveraccount.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.anj.test.connection.driveraccount.domain.DriverAccount;
import com.anj.test.connection.driveraccount.mapper.DriverAccountMapper;
import com.anj.test.connection.driveraccount.service.DriverAccountService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

/**
 * @author anj
 */
@Service
public class DriverAccountServiceImpl extends ServiceImpl<DriverAccountMapper, DriverAccount> implements DriverAccountService {

	@Override
	public List<DriverAccount> list() {
		return super.selectList(null);
	}
}
