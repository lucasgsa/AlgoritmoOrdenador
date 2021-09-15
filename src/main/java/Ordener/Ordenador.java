package Ordener;

public class Ordenador {
	
	public static String[] ordenar(String[] array) {
		String[] novoArray = array.clone();
		Integer qtdTrocas = null;
		
		while (qtdTrocas == null || qtdTrocas != 0) {
			qtdTrocas = 0;
			for (int i = 0; i < novoArray.length-1; i++) {
				if (novoArray[i].compareTo(novoArray[i+1]) > 0) {
					String tempAtual = novoArray[i];
					novoArray[i] = novoArray[i+1];
					novoArray[i+1] = tempAtual;
					qtdTrocas++;
				}
			}
		}
		
		return novoArray;
		
	}
	
}
