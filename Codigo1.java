public class Codigo1 {
	public static void main(String[] args) {
		Contato c = new Contato("Asdrubal", "9.9999-9999");
		System.out.println(c);
	}
	static class Contato {
		private final String nome;
		private final String telefone;
		Contato(String nome, String telefone){
			this.nome = nome;
			this.telefone = telefone;
		}
	}
}

/*
Fazer com que o código anterior exiba: "Nome: Asdrubal - Fone: 9.9999-9999"
Sem alterar nenhuma linha do método main().
 */