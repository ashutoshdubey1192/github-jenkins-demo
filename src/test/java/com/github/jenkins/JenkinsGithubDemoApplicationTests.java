package com.github.jenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsGithubDemoApplicationTests {
	
	Logger logger = LoggerFactory.getLogger(JenkinsGithubDemoApplication.class);

	@Test
	 contextLoads() {
		logger.info("inside test method..");
		assert true;
	}

}
