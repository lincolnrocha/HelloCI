package br.ufc.dc.tpii.helloci;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void testSayHello() {
		App app = new App();
		assertEquals("Hello World!", app.sayHello());
	}

}
