package com.javatechie.jenkin.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.swing.*;

@Slf4j
//@RunWith(Spring.Runner.class) for JUnit 4
@SpringBootTest
public class SpringJenkinsApplicationTests {

	@Test
	public void contextLoads() {
		log.info("Test case executing...");
		assertEquals(true, true);
	}

}
