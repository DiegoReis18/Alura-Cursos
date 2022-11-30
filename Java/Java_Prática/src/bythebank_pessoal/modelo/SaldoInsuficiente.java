package bythebank_pessoal.modelo;

public class SaldoInsuficiente extends RuntimeException{
	public SaldoInsuficiente(String msg) {
		super(msg);
	}
}
