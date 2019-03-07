/**
 * 项目名:sc_02_netflix_eureka
 * 包名：com.luchangqing.zuul1
 * 文件名：ApiFilter.java
 * 用途：(这里用一句话描述这个方法的作用)
 * 版本信息：1.0
 * 作者：luzq58
 * 日期：2019-3-7 10:52:52
 * Copyright (c) 2019 东方希望集团-版权所有.
 */
package com.luchangqing.zuul1;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
public class ApiFilter extends ZuulFilter {
	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		RequestContext currentContext = RequestContext.getCurrentContext();
		HttpServletRequest request = currentContext.getRequest();
		String token = request.getParameter("token");
		if(!"123".equals(token)){
			currentContext.setSendZuulResponse(false);
			currentContext.setResponseStatusCode(401);
			try {
				currentContext.getResponse().getWriter().write("token is invalid.");
			} catch (IOException e) {

			}
		}
		return null;
	}
}
