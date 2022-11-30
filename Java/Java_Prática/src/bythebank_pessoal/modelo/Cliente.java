package bythebank_pessoal.modelo;

public class Cliente {
	private String cpf,nome,profissao;
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, String CPF, String profissao) {
		this.cpf = CPF;
		this.nome = nome;
		this.profissao = profissao;
	}
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}
