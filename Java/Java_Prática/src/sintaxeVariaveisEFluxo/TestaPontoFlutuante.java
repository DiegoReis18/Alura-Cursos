package sintaxeVariaveisEFluxo;

public class TestaPontoFlutuante {

	public static void main(String[] args) {
		double salario = 1220.55;
		System.out.println("Seu salario � "+salario);
		salario = 1220.55/2.5;
		System.out.println("Seu salario � "+salario);
		int NovaDivisao = 1220/2;
		System.out.println("Seu salario � "+NovaDivisao);
		double DivisaoDOUBLE = 5/2;  
		System.out.println("Seu salario � "+DivisaoDOUBLE);  // mostrar� apenas 2.0
		double CERTO = 5.0/2; //transforma um deles em double para dar o resultado certo
		System.out.println("Seu salario � "+CERTO); //mostrar� 2.5
	}

}
