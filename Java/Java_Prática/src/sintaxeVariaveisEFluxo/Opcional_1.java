package sintaxeVariaveisEFluxo;

public class Opcional_1 {


	    public static void main(String[] args) {

	        double salario = 2000.0;
	        
	        if (salario>=1900&&salario<=2800) {
	        	System.out.println("o IR � de 7.5% e pode deduzir na declara��o o valor de R$ 142");
	        }else if (salario>2800&&salario<=3751) {
	        	System.out.println("o IR � de 15% e pode deduzir R$ 350");
	        }else {
	        	System.out.println("o IR � de 22.5% e pode deduzir R$ 636");
	        }
	    }
	
}
