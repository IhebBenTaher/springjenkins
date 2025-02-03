package com.example.springjenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringjenkinsApplicationTests {
	public static Logger logger= LoggerFactory.getLogger(SpringjenkinsApplicationTests.class);
	@Test
	 contextLoads() {
		logger.info("test execute");
		logger.info("test execute second");
		assertEquals(true,true);
	}

}
