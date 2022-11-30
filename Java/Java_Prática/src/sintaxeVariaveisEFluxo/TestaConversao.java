package sintaxeVariaveisEFluxo;

public class TestaConversao {
	public static void main(String[] args) {
		double salario = 1220.99;
		int valor = (int) salario; //obriga a converter o valor double em int type casting
		System.out.println(valor);
		
		long VariavelLong = 403403539045934L; //precisa do L no final do long
		short pequeno = 12345;
		byte menor = 123;
		float valorquebrado = 3.14f; //precisa do f no final
	}
}
