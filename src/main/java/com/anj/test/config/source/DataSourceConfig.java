package com.anj.test.config.source;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.baomidou.mybatisplus.spring.MybatisSqlSessionFactoryBean;

/**
 * @author anj
 */
@Configuration
public class DataSourceConfig {

	@Primary
	@Bean
	@ConfigurationProperties(prefix = "spring.datasource.druid.hp_driver")
	public DataSource driverDataSource() {
		return DruidDataSourceBuilder.create().build();
	}

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource.druid.hp_order")
	public DataSource orderDataSource() {
		return DruidDataSourceBuilder.create().build();
	}

	@Bean
	public SqlSessionFactory sqlSessionFactory(DynamicMultipleDataSource dynamicMultipleDataSource) throws
			Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dynamicMultipleDataSource);
		return sqlSessionFactoryBean.getObject();
	}

	@Bean
	public DataSourceTransactionManager transactionManager(DynamicMultipleDataSource dynamicMultipleDataSource) {
		return new DataSourceTransactionManager(dynamicMultipleDataSource);
	}

	/**
	 * 动态数据源配置
	 */
	@Bean
	public DynamicMultipleDataSource multipleDataSource(
			@Qualifier(GlobalConstant.DRIVER_DATA_SOURCE_KEY) DataSource driverDataSource,
			@Qualifier(GlobalConstant.ORDER_DATA_SOURCE_KEY) DataSource orderDataSource) {
		DynamicMultipleDataSource dynamicMultipleDataSource = new DynamicMultipleDataSource();
		Map<Object, Object> targetDataSources = new HashMap<>();
		targetDataSources.put(GlobalConstant.DRIVER_DATA_SOURCE_KEY, driverDataSource);
		targetDataSources.put(GlobalConstant.ORDER_DATA_SOURCE_KEY, orderDataSource);
		dynamicMultipleDataSource.setTargetDataSources(targetDataSources);
		dynamicMultipleDataSource.setDefaultTargetDataSource(driverDataSource);
		return dynamicMultipleDataSource;
	}

	@Bean
	@Primary
	public MybatisSqlSessionFactoryBean mybatisSqlSessionFactoryBean(DynamicMultipleDataSource dynamicMultipleDataSource) {
		MybatisSqlSessionFactoryBean sqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dynamicMultipleDataSource);
		return sqlSessionFactoryBean;
	}
}

