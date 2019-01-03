package com.anj.test.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.plugins.PerformanceInterceptor;

/**
 * @author : 披荆斩棘
 * @date : 2017/5/10
 */
@Configuration
@MapperScan({
		"com.anj.test.connection.driveraccount.mapper",
		"com.anj.test.connection.orderinfo.mapper"
})
public class MybatisPlusConfig {
	/**
	 * mybatis-plus 性能分析拦截器<br>
	 * 文档：http://mp.baomidou.com<br>
	 */
	@Bean
	public PerformanceInterceptor performanceInterceptor() {
		return new PerformanceInterceptor();
	}

}
