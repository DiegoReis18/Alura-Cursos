package sintaxeVariaveisEFluxo;

public class TesteCondicional2 {
	public static void main(String[] args) {

		System.out.println("testando condicionais");

		int idade = 19;
		int quantidadePessoas = 1;
		boolean acompanhado = quantidadePessoas > 1;

		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo");

		} else {
			System.out.println("infelizmente voce nao pode entrar");

		}
	}
}
