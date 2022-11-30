package bythebank_pessoal.modelo;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(int agencia, int conta, String nome, String profissao, String CPF) {
		super(agencia, conta, nome, profissao, CPF);
		// TODO Auto-generated constructor stub
		
		
	}
	@Override
	public void saca(double valor){
	    double valorASacar = valor + 0.2;
	    super.saca(valorASacar);
	}
	@Override
	public void deposita(double valor) {
		double a = super.getSaldo() + valor;
		setSaldo(a); 
	}

}
