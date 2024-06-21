package primeiroo.pacote;

public class GettersNSetters {

	// PROPRIEDADE EM PRIVATE
	
	private String firstName;
	private String lastName;
	
	//	Usando private. Uma nova instancia tera limitaçoes de acesso e nenhum 
	//  atributo (modificador de acesso)
	//	podera ser modificado diretamente, deverao ser acessados por meio de 
	//  métodos get e set
	// Encapsulamento. 

	// Setters

	public void setFirstName(String firstName) {
		
		this.firstName = firstName.toUpperCase();
		
	}
	
	public void setLastName(String lastName) {
		
		this.lastName = lastName.toUpperCase();
		
	}
	
	// Getters
	
	public String getFirstName() {
		
		return firstName;
		
	}
	
	public String getLastName() {
		
		return lastName;
		
	}
		
}
