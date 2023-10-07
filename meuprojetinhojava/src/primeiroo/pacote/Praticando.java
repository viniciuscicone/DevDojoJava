package primeiroo.pacote;

public class Praticando {

	public static void main(String[] args) {
		
		
		System.out.println("olá essa e minha classe principal");
		
		Calculadora som = new Calculadora();
		som.soma(2,7);
		som.subtrai(2,5);
		
		int a = 10;
		String b = "55";
		
		int resul = Integer.valueOf(b);
		
		System.out.println(resul);
		System.out.println("banana nanana nanana");
		System.out.println((a + resul));
		
	}
	
	 public static void criandoUmObjeto(String[] args) {
	     // Criando um objeto da classe Carro
	     Carro meuCarro = new Carro("Toyota", "Corolla", 2020);

	     // Acessando os métodos do objeto meuCarro
	     System.out.println(meuCarro.getMarca());  // Imprime: Toyota
	     System.out.println(meuCarro.getModelo()); // Imprime: Corolla
	     System.out.println(meuCarro.getAno());    // Imprime: 2020

	     // Modificando os atributos do objeto meuCarro
	     meuCarro.setMarca("Honda");
	     meuCarro.setModelo("Civic");
	     meuCarro.setAno(2022);

	     
	     // imprimindo no terminal as modificaçoes
	     System.out.println(meuCarro.getMarca());  // Imprime: Honda
	     System.out.println(meuCarro.getModelo()); // Imprime: Civic
	     System.out.println(meuCarro.getAno());    // Imprime: 2022
	 }

}
