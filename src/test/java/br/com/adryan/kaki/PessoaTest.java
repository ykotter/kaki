package br.com.adryan.kaki;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class PessoaTest {

	@Test
	public void getIdadeTest() {

		Pessoa p = new Pessoa(LocalDate.of(2020, 7, 25));
		assertEquals(1, p.getIdade());
	}
}