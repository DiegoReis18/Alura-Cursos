package Pilha;



public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main"); 
       
        try {
        metodo1();
        }catch(ArithmeticException|NullPointerException|MinhaExcecao ex) {
        	System.out.println(ex.getMessage());
        	ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        try {
            metodo2();
        }catch(Teste ex) {
            	System.out.println(ex.getMessage());
            	ex.printStackTrace();
        }
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws Teste {  //throws é o checked
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);            
            
        }
        throw new MinhaExcecao("ERROOO"); //unchecked
	    
        //System.out.println("Fim do metodo2");
    }
}
