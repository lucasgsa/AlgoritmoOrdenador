package Ordener;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestesOrdenador {
	
	@Test
	public void teste() {
		
		String[] array = {"zebra", "cálice", "borboleata"};
		String[] arrayOrdenado = Ordenador.ordenar(array);
		
		String[] esperado = {"borboleata", "cálice", "zebra"};
		Assertions.assertArrayEquals(esperado, arrayOrdenado);
	}
}
