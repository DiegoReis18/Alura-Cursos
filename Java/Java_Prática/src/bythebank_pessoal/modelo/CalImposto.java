package bythebank_pessoal.modelo;

import bythebank_pessoal.teste.*;

public class CalImposto{

    private double totalImposto;

    public void registra(Tributavel t){
        double valor = t.getImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto(){
        return totalImposto;
    }

}