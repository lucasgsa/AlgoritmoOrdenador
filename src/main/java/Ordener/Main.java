package Ordener;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String[] array = {"borboleata", "zebra", "c�lice", "tatiana", "tatiana", "borboleata"};
		String[] arrayOrdenado = Ordenador.ordenar(array);
		
		String[] esperado = {"borboleata", "borboleata", "c�lice", "tatiana", "tatiana", "zebra"};
		
		System.out.println(Arrays.toString(arrayOrdenado));
		System.out.println(Arrays.toString(esperado));
	}
}
