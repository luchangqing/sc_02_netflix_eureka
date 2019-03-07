/**
 * 项目名:sc_02_netflix_eureka
 * 包名：com.luchangqing.feign2
 * 文件名：ApiServiceError.java
 * 用途：(这里用一句话描述这个方法的作用)
 * 版本信息：1.0
 * 作者：luzq58
 * 日期：2019-3-7 16:38:38
 * Copyright (c) 2019 东方希望集团-版权所有.
 */
package com.luchangqing.feign2;

import org.springframework.stereotype.Component;

@Component
public class ApiServiceError implements ApiService {
	@Override
	public String index() {
		return "系统错误";
	}
}
