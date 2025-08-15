import java.util.TreeSet;

public class Codigo3 {
	public static void main(String[] args) {
		TreeSet<Fruta> frutas = new TreeSet<>();
		frutas.add(new Fruta("Morango", "Vermelho"));
		frutas.add(new Fruta("Abacate", "Verde"));
		frutas.add(new Fruta("Banana", "Amarelo"));
		frutas.add(new Fruta("Jaboticaba", "Preto"));
		for (Fruta f : frutas) {
			System.out.println(f.getFruta());
		}
	}
	static class Fruta {
		private String nome;
		private String cor;
		Fruta(String nome, String cor){
			this.nome = nome;
			this.cor = cor;
		}
		String getFruta() {
			return nome + " - " + cor;
		}
	}
}

/*
 Fazer com que o código anterior exiba as Frutas em ordem alfabética com suas respectivas cores.
 */
