package bythebank;

public class TesteEncapsulamento {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.deposita(1000);
		System.out.println(primeiraConta.saldo);
		
	}
}
