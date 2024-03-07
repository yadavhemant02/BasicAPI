package com.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class userServiceTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		//fail("Not yet implemented");
		System.out.print("pppp");
	}
	
	
	@Test
	void tested() {
		ArrayList<Integer> aa = new ArrayList<>();
		aa.add(1);
		ArrayList<Integer> bb = new ArrayList<>();
		bb.add(1);
		assertEquals(aa, bb,()->"good");
	}

}
