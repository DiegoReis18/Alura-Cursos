package bythebank_pessoal.modelo;
import bythebank_pessoal.teste.*;

public class ContaCorrente extends Conta implements Tributavel{

	public ContaCorrente(int agencia, int conta, String nome, String profissao, String CPF) {
		super(agencia, conta, nome, profissao, CPF);
		
	}
	@Override
	public void saca(double valor){
	    double valorASacar = valor + 0.1;
	    super.saca(valorASacar);
	}
	@Override
	public void deposita(double valor) {
		double a = super.getSaldo() + valor;
		setSaldo(a); 
		
	}
	 @Override
	    public double getImposto(){
	        return super.getSaldo() * 0.01;
	    }


}
