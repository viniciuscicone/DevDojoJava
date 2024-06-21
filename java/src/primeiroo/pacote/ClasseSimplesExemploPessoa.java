package primeiroo.pacote;

public class ClasseSimplesExemploPessoa {

	// Definição da classe de pessoas.
		// Atributos
	    String nome;
	    int idade;

	// Construtor
	public ClasseSimplesExemploPessoa(String nome, int idade) {
	        this.nome = nome;
	        this.idade = idade;
	}

	// Método para exibir informações da pessoa
	public void exibirInformacoes() {
	        System.out.println("Nome: " + nome);
	        System.out.println("Idade: " + idade);
	}
	
	// Metodo
	public static void main(String[] args) {
			// Criando objetos
			ClasseSimplesExemploPessoa pessoa1 = new ClasseSimplesExemploPessoa("Alice", 30);
			ClasseSimplesExemploPessoa pessoa2 = new ClasseSimplesExemploPessoa("Bob", 25);
		
		    // Chamando o método para exibir informações
		    pessoa1.exibirInformacoes();
		    // Adicionando uma linha em branco
		    System.out.println();
		    pessoa2.exibirInformacoes();
		    
	}
}


