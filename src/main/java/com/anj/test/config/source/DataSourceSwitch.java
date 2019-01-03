package com.anj.test.config.source;

import java.lang.reflect.Method;
import java.util.Objects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;

import com.anj.test.config.annotation.DynamicDataSource;

/**
 * @author anj
 */
public class DataSourceSwitch {

	@Before("execution(* com.anj.test.connection.ariveraccount.*.*Service.*(..))")
	public void driverAccount(JoinPoint joinPoint) {
		setDataSourceKey(joinPoint, GlobalConstant.DRIVER_DATA_SOURCE_KEY);
	}

	@Before("execution(* com.anj.test.connection.orderinfo.*.*Service.*(..))")
	public void orderInfo(JoinPoint joinPoint) {
		setDataSourceKey(joinPoint, GlobalConstant.ORDER_DATA_SOURCE_KEY);
	}

	/**
	 * 设置数据源key
	 */
	private void setDataSourceKey(JoinPoint joinPoint, final String defaultKey) {
		final Method method = this.currentMethod(joinPoint);
		final DynamicDataSource dynamicDataSource = method.getAnnotation(DynamicDataSource.class);
		if (Objects.isNull(dynamicDataSource)) {
			DynamicMultipleDataSource.setDataSourceKey(defaultKey);
			return;
		}
		DynamicMultipleDataSource.setDataSourceKey(dynamicDataSource.value());
	}

	/**
	 * 获取当前执行的方法
	 */
	private Method currentMethod(JoinPoint joinPoint) {
		return ((MethodSignature) joinPoint.getSignature()).getMethod();
	}
}
