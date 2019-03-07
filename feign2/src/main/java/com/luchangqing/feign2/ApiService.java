/**
 * 项目名:sc_02_netflix_eureka
 * 包名：com.luchangqing.feign2
 * 文件名：ApiService.java
 * 用途：(这里用一句话描述这个方法的作用)
 * 版本信息：1.0
 * 作者：luzq58
 * 日期：2019-3-7 16:36:36
 * Copyright (c) 2019 东方希望集团-版权所有.
 */
package com.luchangqing.feign2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eurekaclient1",fallback = ApiServiceError.class)
public interface ApiService {

	@RequestMapping(value = "index",method = RequestMethod.GET)
	String index();
}
