package bythebank_herdado;

public class Designer extends Funcionario {
	private int senha;
	
	public Designer() {
		
	}
	public boolean autentica(int senha) {
		if(this.senha==senha) {
			return true;
		}else {
			return false;
		}
	}
	public double getBonificacao() {
		 return 1;
	}
	
	public int getSenha() {
		return this.senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}

}
