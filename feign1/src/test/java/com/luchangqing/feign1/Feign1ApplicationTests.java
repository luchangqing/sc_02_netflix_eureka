package com.luchangqing.feign1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Feign1ApplicationTests {
	@Autowired
	private ApiService apiService;

	@Test
	public void contextLoads() {
		System.out.println("Feign1ApplicationTests.contextLoads"+apiService.index());
	}

}
