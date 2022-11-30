package bythebank_herdado;

public class Administrador extends Funcionario implements Autenticavel {

    private int senha;
    private AutenticaUtil autenticador;

    public double getBonificacao(){
        return 20;
    }

    public Administrador(){

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