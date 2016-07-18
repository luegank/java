package com.luegank.maventest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.luegank.maventest.Main;

public class MainTest {
	Main main;
	@Before
	public void setUp() throws Exception {
		main = new Main();
	}

	@Test
	public void testAdd() {
		int re = main.add(2, 4);
		assertEquals("bad",re,5);
	}
	@Test
	public void testMultiply(){
		int re = main.multiply(5,6);
		assertEquals("bad",re,32);
	}
}
