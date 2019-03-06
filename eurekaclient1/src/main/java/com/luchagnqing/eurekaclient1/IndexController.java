/**
 * 项目名:sc_02_netflix_eureka
 * 包名：com.luchagnqing.eurekaclient1
 * 文件名：IndexController.java
 * 用途：(这里用一句话描述这个方法的作用)
 * 版本信息：1.0
 * 作者：luzq58
 * 日期：2019-3-6 18:57:57
 * Copyright (c) 2019 东方希望集团-版权所有.
 */
package com.luchagnqing.eurekaclient1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	@RequestMapping("index")
	public String index(){
		return "luchangqing";
	}
}
