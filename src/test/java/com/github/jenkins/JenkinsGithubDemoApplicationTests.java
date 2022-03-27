package com.github.jenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsGithubDemoApplicationTests {
	
	Logger logger = LoggerFactory.getLogger(JenkinsGithubDemoApplication.class);

	@Test
	void contextLoads() {
		logger.info("inside test method..");
		logger.info("inside test method22222222222..");
		assert true;
	}

}
