package bythebank_pessoal.modelo;

public abstract class Conta {
	private double saldo;
	private int agencia;
	private int conta;
	private Cliente titular;
	
	
	public Conta(int agencia, int conta, String nome, String profissao, String CPF) {
		this.agencia = agencia;
		this.conta = conta;
		Cliente cliente = new Cliente(nome,CPF,profissao);
		this.titular = cliente;
	}
	public abstract void deposita(double valor);
	
	public void saca(double valor) {
		if(this.saldo<valor) {
			throw new SaldoInsuficiente("Seu saldo de "+this.saldo+" é menor do que o saque de "+valor); //unchecked
			
		}
			this.saldo -= valor;
		
	}
	public void transferencia(double valor, Conta destino) {
		this.saca(valor);
		destino.deposita(valor);
		
	}
	
	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public int getAgencia() {
		return agencia;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	public int getConta() {
		return conta;
	}


	public void setConta(int conta) {
		this.conta = conta;
	}


	public String getCliente() {
		return this.titular.getNome();
	}


	public void setCliente(Cliente cliente) {
		this.titular = cliente;
	}
}
