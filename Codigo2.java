public class Codigo2 {
	public static void main(String[] args) {
		// Produtos e seus respectivos preços: Xuxu:4.99 ... Maçã:3.99
		String[] produtos = {"Xuxu", "Melão", "Goiaba", "Maçã"};
		double[] precos = {4.99, 2.99, 1.99, 3.99};
		
		//BubbleSort
		for (int x = 0; x < produtos.length - 1; x++) {
			for (int y = 1; y < produtos.length; y++) {
				if (produtos[x].compareTo(produtos[y]) > 0) {
					String aux = produtos[x];
					produtos[x] = produtos[y];
					produtos[y] = aux;
				}
			}
		}
		
		for (int cont = 0; cont < produtos.length; cont++) {
			System.out.println(produtos[cont] + ": " + precos[cont]);
		}
	}
}

/*
 Fazer com que o código anterior exiba os Produtos em ordem alfabética com seus respectivos preços.
 */

