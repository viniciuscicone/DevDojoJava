package primeiroo.pacote;

public class SemContrutor {
    int numero;

    // Não há nenhum construtor definido, mas o 
    // compilador fornecerá um construtor padrão sem parâmetros

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }


	
	public static void main(String[] args) {
		SemContrutor exemplo = new SemContrutor();
	    exemplo.setNumero(12);
	    System.out.println("Número: " + exemplo.getNumero());
	}

}
