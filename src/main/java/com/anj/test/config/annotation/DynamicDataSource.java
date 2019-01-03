package com.anj.test.config.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.annotation.AliasFor;

import com.anj.test.config.source.DataSourceSwitch;

/**
 * 动态数据源注解
 * {@link DataSourceSwitch}
 * @author anj
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface DynamicDataSource {
	@AliasFor("dataSource")
	String value() default StringUtils.EMPTY;

	@AliasFor("value")
	String dataSource() default StringUtils.EMPTY;
}
