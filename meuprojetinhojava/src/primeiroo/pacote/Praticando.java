package primeiroo.pacote;

public class Praticando {
	
	
	
    public static final int CONSTANTE_ESTATICA = 10;

    // Constante individual (não static)
    public int CONSTANTE_INDIVIDUAL = 4;


	
	public static void main(String[] args) {
		
		
		System.out.println("olá essa e minha classe principal");
		
		Calculadora som = new Calculadora();
		som.soma(2,7);
		som.subtrai(2,5);
		
		int a = 10;
		String b = "55";
		
		//int resul = Integer.valueOf(b);
		
		int numero = Praticando.CONSTANTE_ESTATICA;
		
		
		Praticando pre = new Praticando();
		
		System.out.println(numero + "," + pre.CONSTANTE_INDIVIDUAL);
		
		
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
