package bythebank_herdado;

public class EditorVideo extends Funcionario {
	private int senha;
	
	public EditorVideo() {
		
	}
	public boolean autentica(int senha) {
		if(this.senha==senha) {
			return true;
		}else {
			return false;
		}
	}
	public double getBonificacao() {
		 return 100;
	}
	
	public int getSenha() {
		return this.senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}

}
