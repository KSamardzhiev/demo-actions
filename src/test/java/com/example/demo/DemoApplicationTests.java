package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test void testTalentBoostMethod() {
		TalentBoostGreeting tbg = new TalentBoostController().talentboost("Peter");
		assert tbg.content().equals("Welcome to TalenBoost 2023, Peter!");
	}

}
