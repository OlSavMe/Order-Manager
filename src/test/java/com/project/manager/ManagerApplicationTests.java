package com.project.manager;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.project.manager.web.ManagerController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManagerApplicationTests {
	@Autowired
	private ManagerController controller;

	@Test
	public void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
