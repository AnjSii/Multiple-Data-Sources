package com.anj.test.config.source;

import java.lang.reflect.Method;
import java.util.Objects;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.anj.test.config.annotation.DynamicDataSource;

/**
 * @author anj
 */
public class DataSourceSwitchMethodInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		final String packageName = invocation.getThis().getClass().getPackage().getName();
		if (packageName.contains("driveraccount")) {
			setDataSourceKey(invocation.getMethod(), GlobalConstant.DRIVER_DATA_SOURCE_KEY);
		}
		if (packageName.contains("orderinfo")) {
			setDataSourceKey(invocation.getMethod(), GlobalConstant.ORDER_DATA_SOURCE_KEY);
		}
		return invocation.proceed();
	}

	/**
	 * 设置数据源key
	 */
	private void setDataSourceKey(final Method method, final String defaultKey) {
		final DynamicDataSource dynamicDataSource = method.getAnnotation(DynamicDataSource.class);
		if (Objects.isNull(dynamicDataSource)) {
			DynamicMultipleDataSource.setDataSourceKey(defaultKey);
			return;
		}
		DynamicMultipleDataSource.setDataSourceKey(dynamicDataSource.value());
	}
}
