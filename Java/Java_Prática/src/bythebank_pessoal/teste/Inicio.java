package bythebank_pessoal.teste;

import bythebank_pessoal.modelo.*;

public class Inicio {
	public static void main(String[] args) {
	
		
		Conta cc = new ContaCorrente(222, 333, "a", "a", "a");
		Conta cc2 = new ContaCorrente(223, 334, "b", "b", "b");
        cc.deposita(150.0);
        cc.transferencia(100.0,cc2);
        System.out.println("c1: "+cc.getSaldo()+"\nc2: "+cc2.getSaldo()); //poderia colocar try e catch para aparecer outra mensagem

	}
}
