package br.com.adryan.kaki;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class OvoTest {

	@Test
	public void fritarCruTest() {
		Ovo ovo = new Ovo(1);
		ovo.quebrar();
		for (int i = 0; i < 1; i++) {
			ovo.fritar();
		}
		assertEquals(EnumStatusOvo.CRU, ovo.pegarStatus());
	}
	
	@Test
	public void fritarMeioFritoTest() {
		Ovo ovo = new Ovo(1);
		ovo.quebrar();
		for (int i = 0; i < 2; i++) {
			ovo.fritar();
		}
		assertEquals(EnumStatusOvo.MEIO_FRITO, ovo.pegarStatus());
	}
	
	@Test
	public void fritarDeliciaTest() {
		Ovo ovo = new Ovo(1);
		ovo.quebrar();
		for (int i = 0; i < 4; i++) {
			ovo.fritar();
		}
		assertEquals(EnumStatusOvo.DELICIA, ovo.pegarStatus());
	}
	
	@Test
	public void fritarMeioTorradoTest() {
		Ovo ovo = new Ovo(1);
		ovo.quebrar();
		for (int i = 0; i < 5; i++) {
			ovo.fritar();
		}
		assertEquals(EnumStatusOvo.MEIO_QUEIMADO, ovo.pegarStatus());
	}
	
	@Test
	public void fritarQueimadoTest() {
		Ovo ovo = new Ovo(1);
		ovo.quebrar();
		for (int i = 0; i < 10; i++) {
			ovo.fritar();
		}
		assertEquals(EnumStatusOvo.QUEIMADO, ovo.pegarStatus());
	}
	

	@Test 
	public void fritarNaoQuebradoTest() { 
		Ovo ovo = new Ovo(10); 
		Exception exception = assertThrows(RuntimeException.class, () -> { 
			ovo.fritar(); 
		});
		assertEquals("Ovo nao esta quebrado", exception.getMessage()); 
	}
	 
}