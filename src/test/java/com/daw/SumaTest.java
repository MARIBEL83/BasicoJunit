package com.daw;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumaTest {

	
	@BeforeEach
	public void setUp() throws Exception {
	
	}

	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
	 public void testSuma() {
	int resultado=Suma.Suma(2,3);
	assertTrue(resultado==5);
	}



	

}
