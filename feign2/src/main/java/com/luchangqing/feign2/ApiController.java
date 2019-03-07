/**
 * 项目名:sc_02_netflix_eureka
 * 包名：com.luchangqing.feign1
 * 文件名：ApiController.java
 * 用途：(这里用一句话描述这个方法的作用)
 * 版本信息：1.0
 * 作者：luzq58
 * 日期：2019-3-7 16:20:20
 * Copyright (c) 2019 东方希望集团-版权所有.
 */
package com.luchangqing.feign2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@Autowired
	private ApiService apiService;

	@RequestMapping("index")
	public String index(){
		return apiService.index();
	}
}

