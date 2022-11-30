package bythebank_herdado;

public class Gerente extends Funcionario implements Autenticavel {

    private int senha;
   
    private AutenticaUtil autenticador;

    public double getBonificacao(){
        return 500;
    }

    public Gerente(){

        this.autenticador = new AutenticaUtil();
    }

    @Override
    public void setSenha(int senha){
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha){
        return this.autenticador.autentica(senha);
    }
}

