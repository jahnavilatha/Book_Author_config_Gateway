package com.Book;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootTest
@EnableDiscoveryClient
class BookServiceApplicationTests {

	@Test
	void contextLoads() {
	}

}
